package com.lab111.labwork5_Mediator;

public class PrimaryKeyCell extends Cell {

    PrimaryKeyCell(Mediator mediator, String name, Object value) {
        super(mediator, name, value);
        if (mediator != null) mediator.addCell(this);
    }

    PrimaryKeyCell(Mediator mediator, Cell cell) {
        super(mediator, cell.getName(), cell.getValue());
        //  mediator.addCell(this);
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
        if (this.value == value)
            this.Send(value, from);
        else
            this.Send(null, from);
    }

    /**
     * set value of the cell
     *
     * @param value primary key cell
     */
    public void setValue(Object value) {
        this.Send(value, null);
        this.value = value;
    }

}
