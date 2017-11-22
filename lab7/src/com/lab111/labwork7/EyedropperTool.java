package com.lab111.labwork7;

import java.util.Random;

public class EyedropperTool implements GraphicTool {

    @Override
    public void draw(int x, int y) {
        Random random = new Random();
        int R = random.nextInt(256);
        int G = random.nextInt(256);
        int B = random.nextInt(256);
        System.out.println("Color at position " + x + " " + y + "is (" + R + "," + G + "," + B + ")");
    }
}
