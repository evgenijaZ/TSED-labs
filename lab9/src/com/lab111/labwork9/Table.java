package com.lab111.labwork9;

import java.util.ArrayList;
import java.util.List;

public class Table {
    /**
     * name of table
     */
    private String name;
    /**
     * primary key field
     */
    private PrimaryKeyField primaryKeyField = null;
    /**
     * list of fields in the table
     */
    private List <Field> fields = null;

    Table(String name) {
        fields = new ArrayList <>();
        this.name = name;
    }

    @Override
    public String toString() {
        if (primaryKeyField == null) {
            return ("PK is null in " + name);
        }
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
