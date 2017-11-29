package com.lab111.labwork9;

public class Main {

    public static void main(String[] args) {
        Builder builder = new TableBuilder();
        Loader loader = new Loader(builder);
        loader.buildTable("file.txt");
    }
}
