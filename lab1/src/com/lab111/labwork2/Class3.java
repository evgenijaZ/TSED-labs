package com.lab111.labwork2;

/**
 * Class3; Implements Interface3, has override methods method2()
 * method3() that print name of class and name of method
 * Aggregates Class2;
 * @author Zubrich Evgeniia
 */
public class Class3 implements Interface3 {
    /**
     * variable for showing an aggregation;
     * instance of a class Class2
     */
    private Class2 m_Class2 = null;

    /**
     * Constructor to initialize Class3
     */
    Class3() {
    }

    /**
     * Override method from Interface2
     * Prints name of the class ("Class3") and name of the method("Method2")
     */
    @Override
    public void method2() {
        System.out.println("Class3; Method2");
    }

    /**
     * Override method from Interface3
     * Prints name of the class ("Class3") and name of the method("Method3")
     */
    @Override
    public void method3() {
        System.out.println("Class3; Method3");
    }

    /**
     * Sets m_Class2
     * @param v_Class2 new value for m_Class2
     */
    void setM_Class2(Class2 v_Class2){
        m_Class2 = v_Class2;
    }

    /**
     * Gets value of m_Class2
     * @return value of m_Class2
     */
    public Class2 getM_Class2() {
        return m_Class2;
    }

}//end Class3