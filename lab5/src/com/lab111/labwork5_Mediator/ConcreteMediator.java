package com.lab111.labwork5_Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    /**
     * list of primary keys
     */
    private List <PrimaryKeyCell> pkCells = new ArrayList <>();

    /**
     * list of foreign key cells
     */
    private List <ForeignKeyCell> fkCells = new ArrayList <>();

    /**
     * add PrimaryKeyCell to list
     *
     * @param cell a new one cell
     */
    @Override
    public void addCell(PrimaryKeyCell cell) {
        pkCells.add(cell);
    }

    /**
     * add ForeignKeyCell to list
     *
     * @param cell a new one cell
     */
    @Override
    public void addCell(ForeignKeyCell cell) {
        fkCells.add(cell);
    }

    /**
     * get pkCell from the list
     *
     * @param name  name of cell
     * @param value value of cell
     * @return PrimaryKeyCell
     */
    @Override
    public PrimaryKeyCell getPKCell(String name, Object value) {
        for (PrimaryKeyCell pkCell : pkCells) {
            if (pkCell.getName().equals(name) && pkCell.getValue() == value)
                return pkCell;
        }
        return null;
    }

    /**
     * send message with value from one cell to another
     *
     * @param value a value for sending
     * @param from  sender
     * @param to    recipient
     */
    @Override
    public void Send(Object value, Cell from, Cell to) {
        if (from instanceof ForeignKeyCell) {
            if (to == null)
                for (PrimaryKeyCell pkCell : pkCells) {
                    pkCell.Receive(value, from);
                }
        } else if (from instanceof PrimaryKeyCell) {
            if (to == null) {
                for (ForeignKeyCell fkCell : fkCells) {
                    fkCell.Receive(value, from);
                }
            } else {
                if (value != null) ((ForeignKeyCell) to).Receive(value, from);
            }
        } else
            System.out.println("Invalid type of cell");
    }
}
