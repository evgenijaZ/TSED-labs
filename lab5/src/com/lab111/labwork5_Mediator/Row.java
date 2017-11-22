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

    /**
     * add cell
     *
     * @param cell new one cell in map
     */
    void addCell(Cell cell) {
        cells.put(cell.getName(), cell);
    }

    /**
     * get cell by name
     *
     * @param key name of a cell
     * @return the cell
     */
    Cell getCell(String key) {
        return cells.get(key);
    }

    /**
     * delete cell by name
     *
     * @param name name of the cell
     */
    void deleteCell(String name) {
        cells.remove(name);
    }
}

