package com.lab111.labwork5;
/**
 * cell with link to a primary key cell
 */
public class ForeignKeyCell extends Cell implements Observer {
    private Object type;
    private Object name;
    private Object value;
    /**
     * link to a primary key
     */
    private PrimaryKeyCell pkCell;

    ForeignKeyCell(String name, Class type, PrimaryKeyCell pkCell) {
        super(name, type, pkCell.getValue());
        this.name = name;
        this.type = type;
        this.value = pkCell.getValue();
    }

    Object getValue() {
        return value;
    }

    /**
     * update value
     *
     * @param value new value
     */
    @Override
    public void handleEvent(Object value) {
        this.value = value;
    }
}
