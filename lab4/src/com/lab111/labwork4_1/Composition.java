package com.lab111.labwork4_1;

public interface Composition {
    /**
     * Draws all components of composition
     */
    void drawComposition();

    /**
     * Adds a primitive to composition
     *
     * @param primitive new item
     */
    void add(Primitive primitive);

    /**
     * Removes a primitive from composition
     *
     * @param primitive item to remove
     */
    void remove(Primitive primitive);
}
