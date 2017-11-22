package com.lab111.labwork5_Mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * row in relational table
 */
public class Row {

    /**
     * map of cells in the row
     */
    private Map <String, Cell> cells = new HashMap <>();

    void addCell(Cell cell) {
        cells.put(cell.getName(), cell);
    }

    Cell getCell(String key) {
        return cells.get(key);
    }

    void deleteCell(String name){
    cells.remove(name);
    }
}

