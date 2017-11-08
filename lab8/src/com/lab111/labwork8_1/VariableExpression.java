package com.lab111.labwork8_1;

/**
 * Terminal expression; a variable
 */
public class VariableExpression implements Expression {
    /**
     * name of the variable
     */
    private String name;

    VariableExpression(String name) {
        this.name = name;
    }

    /**
     * @param context current state
     * @return value of the variable from the context
     */
    @Override
    public int interpret(Context context) {
        return context.getVariable(name);
    }
}
