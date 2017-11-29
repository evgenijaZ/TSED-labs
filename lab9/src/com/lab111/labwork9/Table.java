package com.lab111.labwork9;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private String name;
    private PrimaryKeyField primaryKeyField = null;
    private List <Field> fields = null;

    public Table(String name) {
        fields = new ArrayList <>();
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(name).append('\n')
                .append("===============================").append("\n")
                .append(primaryKeyField.toString()).append("\n");
        for (Field field : fields) {
            result.append(field.toString()).append("\n");
        }
        result.append("===============================").append("\n");
        return result.toString();
    }

    public void setPrimaryKeyField(PrimaryKeyField primaryKeyField) {
        this.primaryKeyField = primaryKeyField;
    }

    public void addField(Field field) {
        fields.add(field);
    }

    public void addForeignKeyField(ForeignKeyField foreignKeyField) {
        fields.add(foreignKeyField);
    }
}
