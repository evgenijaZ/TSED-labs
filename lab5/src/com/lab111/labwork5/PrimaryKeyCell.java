package com.lab111.labwork5;

import java.util.ArrayList;
import java.util.List;

/**
 * a primary key cell
 */
public class PrimaryKeyCell extends Cell implements Observed {
    /**
     * list of observers (some foreign key cells)
     */
    private List <Observer> observers = new ArrayList <>();

    private Object type;
    private Object name;
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

    /**
     * add new Observer
     *
     * @param o new Observed
     */
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    /**
     * delete an Observer
     *
     * @param o Observer to remove
     */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * notify all subscribers about an updating of the value of primary key
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent(this.value);
        }
    }
}
