package com.lab111.labwork5;

import java.util.ArrayList;
import java.util.List;

public class PrimaryKeyCell extends Cell implements Observed {
    private List <Observer> observers = new ArrayList <>();
    private Object value;

    PrimaryKeyCell(String name, Class type, Object value) {
        super(name, type, value);
        this.name = name;
        this.type = type;
        this.value = value;
    }

    PrimaryKeyCell(Cell cell) {
        super(cell.getName(), cell.getType(), cell.getValue());
        this.name = cell.getName();
        this.type = cell.getType();
        this.value = cell.getValue();
    }

    @Override
    Object getValue() {
        return value;
    }

    @Override
    public void setValue(Object value) {
        this.value = value;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent(this.value);
        }
    }


}
