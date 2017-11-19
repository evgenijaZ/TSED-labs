package com.lab111.labwork5_Mediator;

public class PrimaryKeyCell extends Cell {

    public PrimaryKeyCell(Mediator mediator, String name, Object value) {
        super(mediator, name, value);
    }

    public void send(String message){
        mediator.Send(message,this);
    }

    public void notify(String message){

    }
}
