package com.lab111.labwork9;

/**
 * record in a table
 */
public class Field {
    /**
     * name of field
     */
    protected String name;
    /**
     * type of field
     */
    protected String type;

    Field(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return (name + "\t| " + type + "\t|");
    }
}
