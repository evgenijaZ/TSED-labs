package com.lab111.labwork9;

/**
 * primary key field
 */
public class PrimaryKeyField extends Field {

    PrimaryKeyField(String name, String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return (super.toString() + " PK");
    }
}
