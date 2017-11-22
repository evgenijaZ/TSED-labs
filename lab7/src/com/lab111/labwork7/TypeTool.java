package com.lab111.labwork7;

public class TypeTool implements GraphicTool {
    @Override
    public void rightClick(int x, int y) {
        System.out.println("Typed text at position " + x + " " + y);
    }

    @Override
    public void leftClick(int x, int y) {
        System.out.println("This action isn`t determined in type tool");
    }

    @Override
    public void dragAndDrop(int startX, int startY, int endX, int endY) {
        System.out.println("Typed text from position " + startX + " " + startY + " to " + endX + " " + endY);
    }
}
