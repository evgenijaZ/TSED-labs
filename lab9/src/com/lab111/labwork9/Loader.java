package com.lab111.labwork9;

import java.io.FileReader;
import java.io.IOException;

class Loader {
    /**
     * builder
     */
    private Builder builder;

    Loader(Builder builder) {
        this.builder = builder;
    }

    /**
     * read table properties from file and create new tables
     * @param path path to file
     */
    void buildTable(String path) {
        try (FileReader reader = new FileReader(path)) {
            int currentChar;
            while ((currentChar = reader.read()) != -1) {
                StringBuilder buffer = new StringBuilder();
                while ((char) currentChar != '{') {
                    buffer.append((char) currentChar);
                    currentChar = reader.read();
                }
                builder.createNewTable(buffer.toString());
                currentChar = reader.read();
                while ((char) currentChar != '}') {
                    buffer = new StringBuilder();
                    while ((char) currentChar != ' ') {
                        buffer.append((char) currentChar);
                        currentChar = reader.read();
                    }
                    currentChar = reader.read();
                    StringBuilder name = new StringBuilder();
                    while ((char) currentChar != ' ') {
                        name.append((char) currentChar);
                        currentChar = reader.read();
                    }
                    currentChar = reader.read();
                    StringBuilder type = new StringBuilder();
                    while ((char) currentChar != ';' && (char) currentChar != '}') {
                        type.append((char) currentChar);
                        currentChar = reader.read();
                    }
                    if ((char) currentChar == ';') currentChar = reader.read();
                    switch (buffer.toString()) {
                        case "RK":
                            builder.buildField(name.toString(), type.toString());
                            break;
                        case "PK":
                            builder.buildPrimaryKeyField(name.toString(), type.toString());
                            break;
                        case "FK":
                            builder.buildForeignKeyField(name.toString(), type.toString());
                            break;

                    }
                }
                System.out.println(builder.getTable().toString());
                currentChar = reader.read();
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println("Input/output exception");
            ex.printStackTrace();
            System.exit(1);
        }

    }
}
