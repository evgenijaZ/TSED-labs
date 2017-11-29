package com.lab111.labwork9;

public class PrimaryKeyField extends Field {

    PrimaryKeyField(String name, String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return (super.toString() + " PK");
    }
}
