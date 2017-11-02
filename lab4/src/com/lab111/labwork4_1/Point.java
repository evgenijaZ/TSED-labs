package com.lab111.labwork4_1;

public class Point {
    /**
     * An abscissa
     */
    private double x;
    /**
     * An ordinate
     */
    private double y;

    /**
     * Constructor initializes coordinates
     *
     * @param x an abscissa
     * @param y an ordinate
     */
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return an abscissa
     */
    double getX() {
        return x;
    }

    /**
     * @return an ordinate
     */
    double getY() {
        return y;
    }

    /**
     * Sets new values for coordinates
     *
     * @param x new value of x
     * @param Y new value of y
     */
    void setXY(double x, double Y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Override method equals()
     *
     * @param obj value to compare
     * @return true if equal
     */
    @Override
    public boolean equals(Object obj) {
        return ((obj.getClass().equals(this.getClass())) && ((Point) obj).getX() == this.x && ((Point) obj).getY() == this.y);
    }
}
