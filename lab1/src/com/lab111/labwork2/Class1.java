package com.lab111.labwork2;

/**
 * Class1; Implements Interface1, extends Class3; has override methods method1()
 * and method3() that print name of the class and name of the method
 *
 * @author Zubrich Evgeniia
 */
public class Class1 extends Class3 implements Interface1 {
    public Interface1 getInterface1() {
        return interface1;
    }

    public void setInterface1(Interface1 interface1) {
        this.interface1 = interface1;
    }

    public Interface2 getInterface2() {
        return interface2;
    }

    public void setInterface2(Interface2 interface2) {
        this.interface2 = interface2;
    }

    /**
     * Reference to Interface1
     */
    Interface1 interface1;

    /**
     * Reference to Interface2
     */
    Interface2 interface2;

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
     * Override method from Interface3
     * Prints name of the class ("Class1") and name of the method("Method3")
     */
    @Override
    public void method3() {
        System.out.println("Class1; Method3");
    }

}//end Class1