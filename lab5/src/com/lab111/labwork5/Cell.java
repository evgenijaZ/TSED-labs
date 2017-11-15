package com.lab111.labwork5;

class Cell {
    private String name;
    private Class type;
    private Object value;

    public Cell(String name, Class type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public Class getType() {
        return type;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    ForeignKeyCell makeFKCell(PrimaryKeyCell pkCell) {
        return new ForeignKeyCell(name, type, pkCell);
    }

}
