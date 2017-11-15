package com.lab111.labwork6;


public class HardDrive implements StructureElement {
    private double capacity_Gb;
    private double averageSeekTime_ms;
    private int spindleSpeed_rpm;
    private double freeCapacity_Gb;

    HardDrive(double capacity_Gb, double averageSeekTime_ms, int spindleSpeed_rpm) {
        this.capacity_Gb = capacity_Gb;
        this.averageSeekTime_ms = averageSeekTime_ms;
        this.spindleSpeed_rpm = spindleSpeed_rpm;
        freeCapacity_Gb = capacity_Gb;
    }

    void writeOnDisc(double amountOfInformation_Gb) {
        if (freeCapacity_Gb - amountOfInformation_Gb < 0) {
            System.out.println("There is no free space on disk");
            return;
        }
        this.freeCapacity_Gb -= amountOfInformation_Gb;
    }

    void deleteFromDisc(double amountOfInformation_Gb) {
        if (amountOfInformation_Gb >= freeCapacity_Gb) {
            freeCapacity_Gb = capacity_Gb;
            System.out.println("The disc is empty");
        }
        this.freeCapacity_Gb += amountOfInformation_Gb;
    }

    void formatDisc(){
        freeCapacity_Gb = capacity_Gb;
        System.out.println("The disc is empty");
    }

    int getSpindleSpeed_rpm() {
        return spindleSpeed_rpm;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
