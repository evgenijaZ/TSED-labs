package com.lab111.labwork6;

/**
 * visitor class; measures power
 */
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

    /**
     * total power of elements
     *
     * @param elements array of arguments (structure elements)
     * @return total power of all elements
     */
    double getTotalPower(StructureElement... elements) {
        double totalPower = 0;
        for (StructureElement element : elements) {
            totalPower += element.accept(this);
        }
        return totalPower;
    }
}
