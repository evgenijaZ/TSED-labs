package com.lab111.labwork5_Mediator;

public class PrimaryKeyCell extends Cell {

    public PrimaryKeyCell(Mediator mediator, String name, Object value) {
        super(mediator, name, value);
        if (mediator!= null) mediator.addCell(this);
    }

    public PrimaryKeyCell(Mediator mediator, Cell cell){
        super(mediator, cell.getName(), cell.getValue());
      //  mediator.addCell(this);
    }

    public void Send(Object value, Cell to) {
        mediator.Send(value,this, to);
    }

    public void Receive(Object value, Cell from){
        if (this.value == value)
            this.Send(value, from);
        else
            this.Send(null, from);
    }


    public void setValue(Object value){
        this.Send(value, null);
        this.value = value;
    }

}
