package com.lab111.labwork6;

public class CPU implements StructureElement {
    private int bitRate_bit = 32;
    private double clockSpeed_GHz;
    private double cacheMemory_Kb;
    private int numberOfCores;
    private int loadedCores;
    private double freeCacheMemory_Kb;

    public CPU(int bitRate_bit, double clockSpeed_GHz, double cacheMemory_Kb, int numberOfCores) {
        if(bitRate_bit==32||bitRate_bit==64)
            this.bitRate_bit = bitRate_bit;
        else System.out.println("Invalid bit rate");
        this.clockSpeed_GHz = clockSpeed_GHz;
        this.cacheMemory_Kb = cacheMemory_Kb;
        this.numberOfCores = numberOfCores;
        loadedCores = this.numberOfCores;
        freeCacheMemory_Kb = this.cacheMemory_Kb;

    }

    void loadCores(int numberOfCores) {
        if (numberOfCores > this.numberOfCores || numberOfCores <= 0) {
            System.out.println("The number of cores to load must be between 1 and " + this.numberOfCores);
            return;
        }
        loadedCores = numberOfCores;
    }

    void executeProcess(double amountOfInformation_Gb, int bitRate_bit){
        if(this.bitRate_bit>bitRate_bit) {
            System.out.println("It is impossible to start a process of this bit depth");
            return;
        }
        if(this.freeCacheMemory_Kb<amountOfInformation_Gb) {
            System.out.println("There is no free cache in the CPU");
            return;
        }
        freeCacheMemory_Kb -= amountOfInformation_Gb;
    }

    public int getBitRate_bit() {
        return bitRate_bit;
    }

    double getClockSpeed_GHz() {
        return clockSpeed_GHz;
    }

    public void setCacheMemory_Kb(double cacheMemory_Kb) {
        this.cacheMemory_Kb = cacheMemory_Kb;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public int getLoadedCores() {
        return loadedCores;
    }

    public double getFreeCacheMemory_Kb() {
        return freeCacheMemory_Kb;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
