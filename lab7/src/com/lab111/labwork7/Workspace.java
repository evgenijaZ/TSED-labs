package com.lab111.labwork7;

public class Workspace {
    private GraphicTool currentTool;

    void setTool(GraphicTool tool) {
        currentTool = tool;
    }

    void rightClick(int x, int y) {
        currentTool.rightClick(x, y);
    }

    void leftClick(int x, int y) {
        currentTool.leftClick(x, y);
    }

    void dragAndDrop(int startX, int startY, int endX, int endY) {
        currentTool.dragAndDrop(startX, startY, endX, endY);
    }

    void setEyedropperTool(){
        currentTool = new EyedropperTool();
    }

    void setTypeTool(String text){
        currentTool = new TypeTool(text);
    }

    void setPencilTool(){
        currentTool = new PencilTool();
    }
}
