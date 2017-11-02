package com.lab111.labwork4_1;

import java.util.ArrayList;

public class Adapter implements Composition {
    /**
     * Set of primitives
     */
    private ArrayList <Primitive> primitives = new ArrayList <>();
    /**
     * A monitor height to adaptation of coordinates
     */
    private double monitorHeight;
    /**
     * A monitor width to adaptation of coordinates
     */
    private double monitorWidth;

    /**
     * Creates a new object and initializes the screen dimensions
     *
     * @param height A monitor height
     * @param width  A monitor width
     */
    Adapter(double height, double width) {
        monitorHeight = height;
        monitorWidth = width;
    }

    /**
     * Adapts coordinates and draw all primitives
     */
    @Override
    public void drawComposition() {
        double x, y;
        for (Primitive primitive : primitives) {
            primitive.getPoint1().setXY(monitorHeight / 2 - primitive.getPoint1().getY(),
                    monitorWidth / 2 + primitive.getPoint1().getX());
            primitive.getPoint2().setXY(monitorHeight / 2 - primitive.getPoint2().getY(),
                    monitorWidth / 2 + primitive.getPoint2().getX());
            primitive.drawPrimitive();
        }
    }

    /**
     * Adds a primitive to composition
     *
     * @param primitive new item
     */
    @Override
    public void add(Primitive primitive) {
        primitives.add(primitive);
    }

    /**
     * Removes a primitive from composition
     *
     * @param primitive item to remove
     */
    @Override
    public void remove(Primitive primitive) {
        primitives.remove(primitive);

    }
}
