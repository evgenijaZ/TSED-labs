package com.lab111.labwork9;

/**
 * foreign key field
 */
public class ForeignKeyField extends Field {
    ForeignKeyField(String name, String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return (super.toString() + " FK");
    }
}
