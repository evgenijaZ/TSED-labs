package com.lab111.labwork6;

/**
 * interface StructureElement
 */
public interface StructureElement {
    /**
     * accept visitor
     *
     * @param visitor implementor of the interface Visitor
     * @return the result of the visiting
     */
    double accept(Visitor visitor);
}
