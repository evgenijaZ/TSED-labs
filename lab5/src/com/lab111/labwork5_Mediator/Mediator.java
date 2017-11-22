package com.lab111.labwork5_Mediator;

public interface Mediator {
    void Send(Object value, Cell from, Cell to);
    void addCell(PrimaryKeyCell cell);
    void addCell(ForeignKeyCell cell);
    PrimaryKeyCell getPKCell(String name, Object value);
}
