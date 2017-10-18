package com.lab111.labwork2;

/**
 * Class3; Implements Interface3, has override method3()
 * that print name of class and name of method
 *
 * @author Zubrich Evgeniia
 */
public class Class3 implements Interface3 {

    /**
     * Constructor to initialize Class3
     */
    Class3() {
    }

    /**
     * Override method from Interface3
     * Prints name of the class ("Class3") and name of the method("Method3")
     */
    @Override
    public void method3() {
        System.out.println("Class3; Method3");
    }

}//end Class3