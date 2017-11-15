package com.lab111.labwork5;

/**
 * observed class
 */
public interface Observed {
    /**
     * add a new one Observer
     *
     * @param o new Observed
     */
    void addObserver(Observer o);

    /**
     * remove Observer
     *
     * @param o Observer to remove
     */
    void removeObserver(Observer o);

    /**
     * notify all subscribers
     */
    void notifyObservers();
}
