package com.lab111.labwork4_1;

import java.util.ArrayList;

public class Rectangle implements Composition {
    /**
     * Set of primitives
     */
    private ArrayList <Primitive> lines = new ArrayList <>();

    /**
     * Draws all primitives
     */
    @Override
    public void drawComposition() {
        if (lines.size() != 4) {
            System.out.println("The rectangle should consist of 4 straight lines");
            return;
        }
        for (Primitive primitive : lines)
            primitive.drawPrimitive();
    }

    /**
     * Adds a primitive to the rectangle
     *
     * @param primitive new item
     */
    public void add(Primitive primitive) {
        lines.add(primitive);
    }

    /**
     * Removes a primitive from the rectangle
     *
     * @param primitive is item to remove
     */
    public void remove(Primitive primitive) {
        lines.remove(primitive);
    }

}
