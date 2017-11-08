package com.lab111.labwork8_1;

/**
 * An algebraic expression
 */
public interface Expression {
    /**
     * This method interprets and evaluates the value of an expression based on the context
     * @param context current state
     * @return result
     */
    int interpret(Context context);
}
