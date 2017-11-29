package com.lab111.labwork9;

public class TableBuilder extends Builder {

    @Override
    public void buildPrimaryKeyField(String name, String type) {
        this.table.setPrimaryKeyField(new PrimaryKeyField(name, type));
    }

    @Override
    public void buildField(String name, String type) {
        this.table.addField(new Field(name, type));
    }

    @Override
    public void buildForeignKeyField(String name, String type) {
        this.table.addForeignKeyField(new ForeignKeyField(name, type));
    }
}
