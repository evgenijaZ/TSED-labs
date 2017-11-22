package com.lab111.labwork5_Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    List <PrimaryKeyCell> pkCells = new ArrayList <>();
    List <ForeignKeyCell> fkCells = new ArrayList <>();
    @Override
    public void addCell(PrimaryKeyCell cell) {
        pkCells.add(cell);
    }
    @Override
    public void addCell(ForeignKeyCell cell) {
        fkCells.add(cell);
    }
    @Override
    public PrimaryKeyCell getPKCell(String name, Object value){
        for (PrimaryKeyCell pkCell: pkCells ) {
            if(pkCell.getName()==name && pkCell.getValue()==value)
                return pkCell;
        }
        return null;
    }
    @Override
    public void Send(Object value, Cell from, Cell to) {
        if (from instanceof ForeignKeyCell) {
            if (to == null)
                for (PrimaryKeyCell pkCell : pkCells) {
                    pkCell.Receive(value, from);
                }
            else {
                //
            }
        } else if (from instanceof PrimaryKeyCell) {
            if (to == null) {
                for (ForeignKeyCell fkCell : fkCells) {
                    fkCell.Receive(value, from);
                }
            }
            else {
                if (value != null)  ((ForeignKeyCell) to).Receive(value, from);
            }
        } else
            System.out.println("Invalid type of cell");
    }
}
