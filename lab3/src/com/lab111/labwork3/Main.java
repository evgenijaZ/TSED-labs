package com.lab111.labwork3;

public class Main {

    public static void main(String[] args) {

        FileObject file1 = new File(1, "file1");
        FileObject file2 = new File(2, "file2");
        FileObject file3 = new File(3, "file3");


        FileObject catalogue1 = new Catalogue("catalogue1");
        FileObject catalogue2 = new Catalogue("catalogue2");
        FileObject catalogue3 = new Catalogue("catalogue3");


        catalogue1.add(file1);
        catalogue1.add(file2);
        file1.add(file3);

        catalogue1.print("");


    }
}
