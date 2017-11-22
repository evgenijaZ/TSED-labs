package com.lab111.labwork5_Mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Table {
    /**
     * current index for primary key
     */
    private int pkIndex = 0;

    /**
     * map of rows
     */
    private Map <Integer, Row> rows = new TreeMap <>();

    /**
     * list of present columns in the table
     */
    private List <String> columns = new ArrayList <>();

    /**
     * name of the table
     */
    private String tableName;


    public Table(String tableName) {
        this.tableName = tableName;
        this.pkIndex = 0;
    }

    /**
     * add new rows
     *
     * @param count number of new rows
     */
    void addRows(int count) {
        for (int i = 0; i < count; i++)
            rows.put(rows.size(), new Row());
    }

    /**
     * add primary key column
     *
     * @param name
     */
    void addPKColumn(Mediator mediator, String name) {
        Cell cell;
        columns.add(name);
        for (Map.Entry e : rows.entrySet()) {
            cell = new PrimaryKeyCell(mediator, name, pkIndex++);
            ((Row) e.getValue()).addCell(cell);
        }

    }

    /**
     * add a regular column
     *
     * @param name name of the column (of all cells in the column)
     */
    void addColumn(String name) {
        Cell cell;
        columns.add(name);
        cell = new Cell(null, name, null);
        for (Map.Entry e : rows.entrySet()) {
            ((Row) e.getValue()).addCell(cell);
        }

    }

    /**
     * set value of the cell
     *
     * @param columnName name of the cell
     * @param index      row index
     * @param value      a new value
     */
    void setValue(Mediator mediator, String columnName, int index, Object value) {
        if (index > rows.size() - 1) {
            addRows(index - rows.size() + 1);
            for (String colName : columns)
                rows.get(index).addCell(new Cell(mediator, colName, null));
        }
        Row row = rows.get(index);
        Cell cell = row.getCell(columnName);
        cell.setValue(value);
    }

    /**
     * set value of the foreign key cell
     *
     * @param columnName        name of the cell
     * @param index             row index of the cell
     * @param foreignTable      name of foreign table with primary key
     * @param foreignColumnName name of the cell with the primary key
     */
    void setFKValue(Mediator mediator, String columnName, int index, Table foreignTable, String foreignColumnName, Object value) {
        Row row = rows.get(index);
        Cell cell = row.getCell(columnName);
        Row foreignRow = foreignTable.rows.get((Integer) value);
        PrimaryKeyCell foreignCell = new PrimaryKeyCell(null, foreignColumnName, value);
        if (foreignRow != null)
            foreignCell = new PrimaryKeyCell(mediator, foreignRow.getCell(foreignColumnName));
        if (!(cell instanceof PrimaryKeyCell))
            cell = new ForeignKeyCell(mediator, cell, foreignCell);
        else {
            System.out.println("Cell can`t be changed");
            return;
        }

        if (foreignRow != null) {
            foreignRow.addCell(foreignCell);
            row.addCell(cell);
        }
    }

    /**
     * delete PrimaryKeyCell from row and mediator
     *
     * @param mediator   Mediator
     * @param columnName name of a column with the cell
     * @param value      value of the cell
     */
    void deletePKCell(Mediator mediator, String columnName, Object value) {
        PrimaryKeyCell primaryKeyCell = mediator.getPKCell(columnName, value);
        primaryKeyCell.setValue(null);
        rows.get((Integer) value).addCell(primaryKeyCell);
        System.out.println(primaryKeyCell.name + " is deleted");
    }

    /**
     * print the name and all values of the table
     */
    void print() {
        System.out.println("\n" + this.tableName);
        Cell cell;
        Row row;
        for (String column : columns) {
            System.out.print(column + "\t\t");
        }
        System.out.println();
        for (Map.Entry e : rows.entrySet()) {
            row = (Row) e.getValue();
            StringBuilder output = new StringBuilder();
            for (String column : columns) {
                cell = row.getCell(column);
                if (cell != null && cell.getValue() != null)
                    output.append(cell.getValue()).append("\t\t");
                else {
                    output.append("null \t\t\t");
//                    output = new StringBuilder();
//                    break;
                }
            }
            System.out.println(output);
        }
        System.out.println();
    }
}
