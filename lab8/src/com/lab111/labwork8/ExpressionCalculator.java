package com.lab111.labwork8;

import java.util.ArrayList;

 class ExpressionCalculator {

    private ArrayList <AlgebraicExpression> expressions;

    ExpressionCalculator() {
        expressions = new ArrayList <>();
    }

    ExpressionCalculator(int countOfExpressions, int countOfPoints ) {
        expressions = new ArrayList <>();
        calculatePoints(countOfExpressions, countOfPoints);
    }

    private void addRandomExpressions(int countOfExpressions) {
        for (int i = 0; i < countOfExpressions; i++) {
            double a = Math.random() * 5 - 2.5;
            double b = Math.random() * 5 - 2.5;
            double c = Math.random() * 5 - 2.5;
            AlgebraicExpression expression = new AlgebraicExpression(a, b, c);
            expression.print();
            expressions.add(expression);
        }
    }

    void calculatePoints(int countOfExpressions, int countOfPoints) {
        ValueMap valueMap = ValueMap.getInstance();
        addRandomExpressions(countOfExpressions);
        for (AlgebraicExpression expression : expressions) {
            for (int i = 0; i < countOfPoints; i++) {
                double x = Math.random() * 10 - 5;
                double y = expression.function(x);
                valueMap.addValue(new Point(x, y));
            }

        }
        valueMap.plot();
    }


}
