package com.lab111.labwork6;

interface Visitor {
    double visit(HardDrive hdd);

    double visit(CPU cpu);

    double visit(VideoCard videoCard);
}