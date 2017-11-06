package com.lab111.labwork8;
import java.util.Formatter;
public class AlgebraicExpression {
    private double a;
    private double b;
    private double c;

    AlgebraicExpression(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double function (double x){
        return a*Math.pow(x,3)+b*Math.pow(x,2)+c;
    }

    public  void print(){
        Formatter formatterLine = new Formatter();
        formatterLine.format("(%.1f)*x^3+(%.1f)*x^2+(%.1f)*x",a,b,c);
        System.out.println(formatterLine);
    }
}
