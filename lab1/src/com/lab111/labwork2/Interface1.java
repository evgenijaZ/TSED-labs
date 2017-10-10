package com.lab111.labwork2;

/**
 * Interface Interface1; aggregates Class1; has method1()
 * @author Zubrich Evgeniia
 */
public interface Interface1 extends Interface3 {
    /**
     * instance of a class Class1
     */
    public Class1 m_Class1 = new Class1();
    /**
     * Prints name of an implemented class and name of the method
     */
    public void method1();

}