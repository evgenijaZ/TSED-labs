package com.lab111.labwork8_1;

import java.util.HashMap;
import java.util.Map;

class Context {

    private static Context instance;
    private Map <String, Integer> variables = new HashMap <>();
    private String stringExpression = null;

    private Context(String stringExpression) {
        this.stringExpression = stringExpression;
    }

    static Context getInstance(String stringExpression) {
        if (instance == null)
            instance = new Context(stringExpression);
        return instance;
    }

    int getVariable(String name) {
        if (variables.containsKey(name))
            return variables.get(name);
        else {
            System.out.println("Unknown variable " + name);
            int defaultValue = 0;
            System.out.println("Warning: " + name + " was initialized by default value " + defaultValue);
            return defaultValue;
        }
    }

    void setVariables(String name, int value) {
        variables.put(name, value);
    }


    public String getStringExpression() {
        return stringExpression;
    }

    public void setStringExpression(String stringExpression) {
        this.stringExpression = stringExpression;
    }

    int getResult() {
        TokenReader tokenReader = new TokenReader();
        Expression expression = tokenReader.readToken(stringExpression);
        return expression.interpret(this);
    }

    void print() {
        System.out.println("Expression is: "+stringExpression);
        variables.forEach((key, value) -> System.out.println(key + " = " + value));
        System.out.println("Result is: "+getResult());
    }

}
