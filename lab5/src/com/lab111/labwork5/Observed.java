package com.lab111.labwork5;

/**
 * observed class
 */
public interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
