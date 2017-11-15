package com.lab111.labwork6;

import java.util.Random;

public class VideoCard implements StructureElement {
    private double degreeOfWorkload;
    private double memoryCapacity_Gb;

    VideoCard(double memoryCapacity_Gb) {
        this.memoryCapacity_Gb = memoryCapacity_Gb;
    }

    private void launchVideoCard(){
        Random random = new Random();
        degreeOfWorkload = random.nextDouble();
    }

    double getDegreeOfWorkload() {
        launchVideoCard();
        return degreeOfWorkload;
    }

    @Override
    public double accept(Visitor visitor) {
       return visitor.visit(this);
    }
}
