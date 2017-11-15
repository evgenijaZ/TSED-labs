package com.lab111.labwork6;

import java.util.Random;

/**
 * video card
 */
public class VideoCard implements StructureElement {
    private double degreeOfWorkload;
    private double memoryCapacity_Gb;

    /**
     * constructor
     *
     * @param memoryCapacity_Gb memory capacity
     */
    VideoCard(double memoryCapacity_Gb) {
        this.memoryCapacity_Gb = memoryCapacity_Gb;
    }

    /**
     * launch the video card
     */
    private void launchVideoCard() {
        Random random = new Random();
        degreeOfWorkload = random.nextDouble();
    }

    /**
     * degree of workload
     *
     * @return value of degree (0..1)
     */
    double getDegreeOfWorkload() {
        launchVideoCard();
        return degreeOfWorkload;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
