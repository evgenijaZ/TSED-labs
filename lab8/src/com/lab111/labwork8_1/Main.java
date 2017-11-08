package com.lab111.labwork8_1;

public class Main {

    public static void main(String[] args) {

        String stringExpression = "+ - x 2 z";
        Context context = Context.getInstance(stringExpression);
        context.setVariables("x", 5);
        context.setVariables("y", 4);
        context.setVariables("z", 6);

        context.print();

    }
}
