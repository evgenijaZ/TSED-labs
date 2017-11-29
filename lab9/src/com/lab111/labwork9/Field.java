package com.lab111.labwork9;

public class Field {
    protected String name;
    protected String type;

    public Field(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return (name + "\t" + type + "\n");
    }
}
