package com.lab111.labwork9;

public class ForeignKeyField extends Field {
    ForeignKeyField(String name, String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return (super.toString() + " FK");
    }
}
