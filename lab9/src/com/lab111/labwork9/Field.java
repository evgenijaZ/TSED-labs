package com.lab111.labwork9;

public class Field {
    protected String name;
    protected Class type;

    public Field(String name, Class type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return (name+"\t"+type.getSimpleName()+"\n");
    }
}
