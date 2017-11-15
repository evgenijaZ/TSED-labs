package com.lab111.labwork6;

public class Main {

    public static void main(String[] args) {
        CPU cpu = new CPU(64, 3092.62, 1024, 4);
        VideoCard videoCard = new VideoCard(11.264);
        HardDrive hardDrive = new HardDrive(1024, 8, 7200);

        PowerMeter powerMeter = new PowerMeter();
        System.out.println(String.format("Total power: %.3f Watts", (powerMeter.getTotalPower(cpu, videoCard, hardDrive))));
    }
}
