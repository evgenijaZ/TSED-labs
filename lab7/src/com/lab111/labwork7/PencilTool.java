package com.lab111.labwork7;

public class PencilTool implements GraphicTool {
    @Override
    public void rightClick(int x, int y) {
        System.out.println("Drawn dot at position " + x + ";" + y);
    }

    @Override
    public void leftClick(int x, int y) {
        System.out.println("The menu for changing the parameters of the pencil is displayed.");
    }

    @Override
    public void dragAndDrop(int startX, int startY, int endX, int endY) {
        System.out.println("Drawn line from position " + startX + ";" + startY + " to " + endX + ";" + endY);
    }
}
