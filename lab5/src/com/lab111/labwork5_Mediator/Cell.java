package com.lab111.labwork5_Mediator;

/**
 * cell in a table
 */
public class Cell {
    /**
     * name of the cell
     */
    protected String name;

    /**
     * value of the cell
     */
    protected Object value;

    /**
     * mediator for connection between cells
     */
    Mediator mediator;

    public Cell(Mediator mediator, String name, Object value) {
        this.mediator = mediator;
        this.name = name;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
