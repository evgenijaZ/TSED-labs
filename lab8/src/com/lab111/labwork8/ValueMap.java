package com.lab111.labwork8;

import java.util.ArrayList;

public class ValueMap {

    private static ValueMap instance;
    private ArrayList <Point> values;

    private ValueMap() {
        values = new ArrayList <>();
    }

    public static ValueMap getInstance() {
        if (instance == null)
            instance = new ValueMap();
        return instance;
    }

    public void addValue(Point value) {
        values.add(value);
    }

    public void removeValue (Point value){
        values.remove(value);
    }
    
}
