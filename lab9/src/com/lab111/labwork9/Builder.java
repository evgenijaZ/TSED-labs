package com.lab111.labwork9;

public abstract class Builder {
    protected Table table;

    public Table getTable() {
        return table;
    }

    public void createNewTable(String name) {
        table = new Table(name);
    }

    public abstract void buildPrimaryKeyField(String name, Class type);

    public abstract void buildField(String name, Class type);

    public abstract void buildForeignKeyField(String name, Class type);
}
