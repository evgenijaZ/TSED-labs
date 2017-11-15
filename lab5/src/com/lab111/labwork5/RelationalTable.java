package com.lab111.labwork5;

import java.util.Map;
import java.util.TreeMap;

class RelationalTable {
    private int pkIndex = 0;
    private Map <Integer, Row> rows = new TreeMap <>();
    private Map <String, Class> columns = new TreeMap <>();
    private String tableName;

    RelationalTable(String tableName) {
        this.tableName = tableName;
    }

    void addRows(int count) {
        for (int i = 0; i < count; i++)
            rows.put(rows.size(), new Row());
    }

    void addPKColumn(String name) {
        Cell cell;
        columns.put(name, Integer.class);

        for (Map.Entry e : rows.entrySet()) {
            cell = new PrimaryKeyCell(name, Integer.class, pkIndex++);
            ((Row) e.getValue()).addCell(cell);
        }

    }


    void addColumn(String name, Class type) {
        Cell cell;
        columns.put(name, type);
        cell = new Cell(name, type, null);
        for (Map.Entry e : rows.entrySet()) {
            ((Row) e.getValue()).addCell(cell);
        }

    }

    void setValue(String columnName, int index, Object value) {
        if (index > rows.size() - 1) {
            addRows(index - rows.size() + 1);
            for (Map.Entry e : columns.entrySet())
                rows.get(index).addCell(new Cell((String) e.getKey(), (Class) e.getValue(), null));
        }
        Row row = rows.get(index);
        Cell cell = row.getCell(columnName);
        cell.setValue(value);
    }

    void setFKValue(String columnName, int index, RelationalTable foreignTable, String foreignColumnName, int foreignIndex) {
        Row row = rows.get(index);
        Cell cell = row.getCell(columnName);
        Row foreignRow;
        if (foreignTable.rows.containsKey(foreignIndex))
            foreignRow = foreignTable.rows.get(foreignIndex);
        else {
            System.out.println("Invalid foreign index");
            return;
        }
        PrimaryKeyCell foreignCell = new PrimaryKeyCell(foreignRow.getCell(foreignColumnName));
        if (!(cell instanceof ForeignKeyCell))
            cell = cell.makeFKCell(foreignCell);
        else {
            System.out.println("Cell can`t be changed");
            return;
        }
        foreignCell.addObserver((Observer) cell);
        foreignRow.addCell(foreignCell);
        row.addCell(cell);
    }

    void print() {
        System.out.println("\n" + this.tableName);
        Cell cell;
        Row row;
        for (Map.Entry e : columns.entrySet()) {
            System.out.print(e.getKey() + "\t\t");
        }
        System.out.println();
        for (Map.Entry e : rows.entrySet()) {
            row = (Row) e.getValue();
            for (Map.Entry entryCell : columns.entrySet()) {
                cell = row.getCell((String) entryCell.getKey());
                if (cell != null) System.out.print(cell.getValue() + "\t\t");
                else System.out.print(null + "\t\t\t");
            }
            System.out.println();
        }
    }
}

