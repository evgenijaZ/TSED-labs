package com.lab111.labwork5;

public class ForeignKeyCell extends Cell implements Observer{

    private Object value;
    private PrimaryKeyCell pkCell;


    ForeignKeyCell(String name, Class type, PrimaryKeyCell pkCell) {
        super(name,type,pkCell.getValue());
        this.name = name;
        this.type = type;
        this.value = pkCell.getValue();
    }


    Object getValue() {
        return value;
    }

    @Override
    public void handleEvent(Object value) {
        this.value = value;
    }
}
