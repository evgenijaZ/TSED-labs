package com.lab111.labwork7;

public class Main {
    public static void main(String[] args) {
	    Workspace workspace = new Workspace();
	    workspace.setPencilTool();
	    workspace.rightClick(5,85);
	    workspace.dragAndDrop(12,0,34,32);
	    workspace.setEyedropperTool();
	    workspace.rightClick(54, 67);
    }
}
