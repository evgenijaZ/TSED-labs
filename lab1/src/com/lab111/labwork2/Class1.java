package com.lab111.labwork2;

/**
 * Class1; Implements Interface1, extends Class3; has override method method2()
 * that prints name of class and name of method
 * @author Zubrich Evgeniia
 */
public class Class1 extends Class3 implements Interface1 {
    /**
     * Constructor to initialize Class1
     */
    Class1() {
    }

    /**
     * Override method from Interface1
     * Prints name of the class ("Class1") and name of the method("Method1")
     */
    @Override
    public void method1() {
        System.out.println("Class1; Method1");
    }

    /**
     * Override method from Interface2
     * Prints name of the class ("Class1") and name of the method("Method2")
     */
    @Override
    public void method2() {
        System.out.println("Class1; Method2");
    }

    /**
     * Override method from Interface3
     * Prints name of the class ("Class1") and name of the method("Method3")
     */
    @Override
    public void method3() {
        System.out.println("Class1; Method3");
    }

}//end Class1