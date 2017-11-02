package com.lab111.labwork4_1;

public interface Primitive {
    /**
     * Draws the primitive
     */
    void drawPrimitive();

    /**
     * @return the first coordinate of the primitive
     */
    Point getPoint1();

    /**
     * @return the last coordinate of the primitive
     */
    Point getPoint2();
}
