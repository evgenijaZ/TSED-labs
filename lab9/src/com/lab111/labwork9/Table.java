package com.lab111.labwork9;

import java.util.List;

public class Table {
    private PrimaryKeyField primaryKeyField = null;
    private List<Field> fields = null;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(primaryKeyField.toString());
        for (Field field: fields) {
            result.append(field.toString());
        }
        return result.toString();
    }

    public void setPrimaryKeyField(PrimaryKeyField primaryKeyField) {
        this.primaryKeyField = primaryKeyField;
    }

    public void addField(Field field){
        fields.add(field);
    }

    public void addForeignKeyField(ForeignKeyField foreignKeyField){
        fields.add(foreignKeyField);
    }
}
