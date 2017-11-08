package com.lab111.labwork8;

import java.util.ArrayList;
import java.util.Formatter;

public class ValueMap {

    private static ValueMap instance;
    private ArrayList <Point> values;

    private ValueMap() {
        values = new ArrayList <>();
    }

    static ValueMap getInstance() {
        if (instance == null)
            instance = new ValueMap();
        return instance;
    }

    void addValue(Point value) {
        values.add(value);
    }

    public void removeValue (Point value){
        values.remove(value);
    }

    void plot(){
        for(Point value: values){
            Formatter formatterLine = new Formatter();
            formatterLine.format("%.1f;\t%.1f",value.getX(),value.getY());
            System.out.println(formatterLine);
        }
    }
}
