package com.lab111.labwork2;

/**
 * Class2; Implements Interface2, has override methods method1(), method2(),
 * method3()  that prints name of class and name of method
 * Aggregates Class3
 *
 * @author Zubrich Evgeniia
 */
public class Class2 implements Interface2 {
    /**
     * Instance of Class3
     */
    Class3 r_Class3 = new Class3();

    /**
     * Constructor to initialize Class2
     */
    public Class2() {
    }

    /**
     * Override method from Interface2
     * Prints name of the class ("Class2") and name of the method("Method1")
     */

    @Override
    public void method1() {
        System.out.println("Class2; Method1");
    }

    /**
     * Override method from Interface2
     * Prints name of the class ("Class2") and name of the method("Method2")
     */
    @Override
    public void method2() {
        System.out.println("Class2; Method2");
    }

    /**
     * Override method from Interface2
     * Prints name of the class ("Class2") and name of the method("Method3")
     */
    @Override
    public void method3() {
        System.out.println("Class2; Method3");
    }

}//end Class2