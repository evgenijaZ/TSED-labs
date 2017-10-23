package com.lab111.labwork3;

public class Main {

    public static void main(String[] args) {

        File file1 = new File(1);
        File file2 = new File(2);
        File file3 = new File(3);
        File file4 = new File(4);
        File file5 = new File(5);

        Catalogue catalogue1 = new Catalogue();
        Catalogue catalogue2 = new Catalogue();
        Catalogue catalogue3 = new Catalogue();
        Catalogue catalogue4 = new Catalogue();

        catalogue1.add(file1);
        catalogue1.add(file2);
        catalogue2.add(catalogue1);
        catalogue2.add(file3);
        catalogue4.add(catalogue2);
        catalogue4.add(catalogue3);
        catalogue4.add(file4);
        catalogue4.add(file5);

        catalogue4.size();




    }
}
