package com.lab111.labwork2;

/**
 * Class2; Implements Interface2, has override method method2()
 * that prints name of class and name of method
 * @author Zubrich Evgeniia
 */
public class Class2 implements Interface2 {
    /**
     * Constructor to initialize Class3
     */
    public Class2() {
    }

    /**
     * Override method from Interface2
     * Prints name of the class ("Class2") and name of the method("Method2")
     */
    @Override
    public void method2() {
        System.out.println("Class2; Method2");
    }

}//end Class2