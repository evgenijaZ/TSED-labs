package com.lab111.labwork4_1;

import java.util.Formatter;

public class Line implements Primitive {
    /**
     * The first point of strength line
     */
    private Point point1;
    /**
     * The last point of strength line
     */
    private Point point2;

    /**
     * Creates new line and initializes points
     *
     * @param x1 an abscissa of point1
     * @param y1 an ordinate of point1
     * @param x2 an abscissa of point2
     * @param y2 an ordinate of point2
     */
    Line(int x1, int y1, int x2, int y2) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }

    /**
     * @return point1
     */
    public Point getPoint1() {
        return point1;
    }

    /**
     * @return point2
     */
    public Point getPoint2() {
        return point2;
    }

    /**
     * Draws the line
     */
    @Override
    public void drawPrimitive() {
        Formatter formatterLine = new Formatter();
        formatterLine.format("The line is drawn with coordinates (%.1f; %.1f) (%.1f; %.1f)", point1.getX(), point1.getY(), point2.getX(), point2.getY());
        System.out.println(formatterLine);
    }
}
