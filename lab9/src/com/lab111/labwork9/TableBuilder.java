package com.lab111.labwork9;

public class TableBuilder extends Builder {
    /**
     * to build primary key field in a table
     * @param name name of field
     * @param type type of field
     */
    @Override
    public void buildPrimaryKeyField(String name, String type) {
        this.table.setPrimaryKeyField(new PrimaryKeyField(name, type));
    }
    /**
     * to build regular key field in a table
     * @param name name of field
     * @param type type of field
     */
    @Override
    public void buildField(String name, String type) {
        this.table.addField(new Field(name, type));
    }

    /**
     * to build foreign key field in a table
     * @param name name of field
     * @param type type of field
     */
    @Override
    public void buildForeignKeyField(String name, String type) {
        this.table.addForeignKeyField(new ForeignKeyField(name, type));
    }
}
