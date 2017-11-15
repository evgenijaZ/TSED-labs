package com.lab111.labwork5;

import java.util.HashMap;
import java.util.Map;

class Row {
    private Map<String,Cell> cells = new HashMap <>();

    void addCell(Cell cell){
            cells.put(cell.getName(),cell);
    }

    Cell getCell(String key){
        return cells.get(key);
    }
}
