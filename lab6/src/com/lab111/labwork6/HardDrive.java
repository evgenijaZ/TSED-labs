package com.lab111.labwork6;


public class HardDrive implements StructureElement {
    private double capacity_Gb;
    private double averageSeekTime_ms;
    private int spindleSpeed_rpm;
    private double freeCapacity_Gb;

    /**
     * constructor
     *
     * @param capacity_Gb        capacity
     * @param averageSeekTime_ms average seek time
     * @param spindleSpeed_rpm   spindle speed
     */
    HardDrive(double capacity_Gb, double averageSeekTime_ms, int spindleSpeed_rpm) {
        this.capacity_Gb = capacity_Gb;
        this.averageSeekTime_ms = averageSeekTime_ms;
        this.spindleSpeed_rpm = spindleSpeed_rpm;
        freeCapacity_Gb = capacity_Gb;
    }

    /**
     * write something information on the disc
     *
     * @param amountOfInformation_Gb amount of information
     */
    void writeOnDisc(double amountOfInformation_Gb) {
        if (freeCapacity_Gb - amountOfInformation_Gb < 0) {
            System.out.println("There is no free space on disk");
            return;
        }
        this.freeCapacity_Gb -= amountOfInformation_Gb;
    }

    /**
     * free space on the disc
     *
     * @param amountOfInformation_Gb
     */
    void deleteFromDisc(double amountOfInformation_Gb) {
        if (amountOfInformation_Gb >= freeCapacity_Gb) {
            freeCapacity_Gb = capacity_Gb;
            System.out.println("The disc is empty");
        }
        this.freeCapacity_Gb += amountOfInformation_Gb;
    }

    /**
     * format the disc
     */
    void formatDisc() {
        freeCapacity_Gb = capacity_Gb;
        System.out.println("The disc is empty");
    }

    /**
     * get the spindle speed
     *
     * @return spindle speed in rpm
     */
    int getSpindleSpeed_rpm() {
        return spindleSpeed_rpm;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
