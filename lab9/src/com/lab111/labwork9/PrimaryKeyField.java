package com.lab111.labwork9;

public class PrimaryKeyField extends Field {

    public PrimaryKeyField(String name, Class type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return (name + "\t" + type.getSimpleName() + " PK\n");
    }
}
