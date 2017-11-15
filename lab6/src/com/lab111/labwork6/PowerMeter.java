package com.lab111.labwork6;

public class PowerMeter implements Visitor {

    @Override
    public double visit(HardDrive hdd) {
        return hdd.getSpindleSpeed_rpm() / 1300;
    }

    @Override
    public double visit(CPU cpu) {
        return (cpu.getClockSpeed_GHz() / 0.1) * 0.8;
    }

    @Override
    public double visit(VideoCard videoCard) {
        return videoCard.getDegreeOfWorkload() * 110;
    }

    double getTotalPower(StructureElement... elements) {
        double totalPower = 0;
        for (StructureElement element : elements) {
            totalPower += element.accept(this);
        }
        return totalPower;

    }
}
