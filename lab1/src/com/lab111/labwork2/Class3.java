package com.lab111.labwork2;

public class Class3 implements Interface3 {
    private Class2 m_Class2;

    Class3() {
    }

    @Override
    public void method1() {
        System.out.println("Class3; Method1");
    }

    @Override
    public void method2() {
        System.out.println("Class3; Method2");
    }

    @Override
    public void method3() {
        System.out.println("Class3; Method3");
    }

}//end Class3