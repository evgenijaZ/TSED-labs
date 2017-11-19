package com.lab111.labwork5_Mediator;

public class Cell {
   protected Mediator mediator;
   protected String name;
   protected Object value;

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

}
