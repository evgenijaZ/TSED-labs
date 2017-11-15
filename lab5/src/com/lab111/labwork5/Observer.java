package com.lab111.labwork5;

/**
 * class observer
 */
public interface Observer {
    /**
     * handle event from Observed
     *
     * @param value new value
     */
    void handleEvent(Object value);
}
