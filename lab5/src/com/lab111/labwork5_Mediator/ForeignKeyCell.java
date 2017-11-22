package com.lab111.labwork5_Mediator;

public class ForeignKeyCell extends Cell {

    public ForeignKeyCell(Mediator mediator, String name, Object value) {
        super(mediator, name, null);
        setValue(value);
        if (this.value == null)
            System.out.println("Warning! There isn`t any primary keys with this value");
        mediator.addCell(this);
    }

    ForeignKeyCell(Mediator mediator, Cell cell, PrimaryKeyCell pkCell) {
        super(mediator, cell.getName(), cell.getValue());
        setValue(pkCell.getValue());
        if (this.value == null)
            System.out.println("\nWarning! There isn`t any primary keys with this value: " + pkCell.getValue());
        mediator.addCell(this);
    }

    /**
     * send value to a cell
     *
     * @param value value
     * @param to    recipient
     */
    private void Send(Object value, Cell to) {
        mediator.Send(value, this, to);
    }

    /**
     * receive value from another cell
     *
     * @param value value from a cell
     * @param from  sender
     */
    void Receive(Object value, Cell from) {
        if (this.value != value)
            System.out.println("Value of " + this.name + " is changed from " + this.value + " to " + value);
        else
            System.out.println("Value of " + this.name + " isn't changed:" + this.value);
        this.value = value;

    }

    /**
     * set value of the cell
     *
     * @param value primary key cell
     */
    public void setValue(Object value) {
        this.Send(value, null);
    }

}
