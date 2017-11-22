package com.lab111.labwork7;

public class TypeTool implements GraphicTool {
    private String text;

    public TypeTool(String text) {
        this.text = text;
    }

    @Override
    public void rightClick(int x, int y) {
        System.out.println("Typed text \"" + text + "\" at position " + x + ";" + y);
    }

    @Override
    public void leftClick(int x, int y) {
        System.out.println("This action isn`t determined in type tool");
    }

    @Override
    public void dragAndDrop(int startX, int startY, int endX, int endY) {
        System.out.println("Typed text from position " + startX + ";" + startY + " to " + endX + ";" + endY);
    }
}
