package com.lab111.labwork5_Mediator;

/**
 * interface Mediator
 */
public interface Mediator {
    /**
     * send message with value from one cell to another
     *
     * @param value a value for sending
     * @param from  sender
     * @param to    recipient
     */
    void Send(Object value, Cell from, Cell to);

    /**
     * add PrimaryKeyCell to list
     *
     * @param cell a new one cell
     */
    void addCell(PrimaryKeyCell cell);

    /**
     * add ForeignKeyCell to list
     *
     * @param cell a new one cell
     */
    void addCell(ForeignKeyCell cell);

    /**
     * get pkCell from the list
     *
     * @param name  name of cell
     * @param value value of cell
     * @return PrimaryKeyCell
     */
    PrimaryKeyCell getPKCell(String name, Object value);


    /**
     * get fkCell from the list
     *
     * @param name  name of cell
     * @param value value of cell
     * @return ForeignKeyCell
     */
    ForeignKeyCell getFKCell(String name, Object value);
}
