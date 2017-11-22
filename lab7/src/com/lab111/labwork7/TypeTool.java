package com.lab111.labwork7;

public class TypeTool implements GraphicTool {
    @Override
    public void rightClick(int x, int y) {
        System.out.println("Typed text at position " + x + " " + y);
    }
}
