package com.lab111.labwork9;

public abstract class Builder {
    /**
     * table
     */
    protected Table table;

    /**
     * to get table
     * @return table
     */
    public Table getTable() {
        return table;
    }

    /**
     * create new table
     * @param name name of the table
     */
    public void createNewTable(String name) {
        table = new Table(name);
    }
    /**
     * to build primary key field in a table
     * @param name name of field
     * @param type type of field
     */
    public abstract void buildPrimaryKeyField(String name, String type);
    /**
     * to build regular field in a table
     * @param name name of field
     * @param type type of field
     */
    public abstract void buildField(String name, String type);

    /**
     * to build foreign key field in a table
     * @param name name of field
     * @param type type of field
     */
    public abstract void buildForeignKeyField(String name, String type);
}
