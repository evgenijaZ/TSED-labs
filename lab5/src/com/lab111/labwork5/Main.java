package com.lab111.labwork5;

public class Main {

    public static void main(String[] args) {
        RelationalTable binomialName = new RelationalTable("AnimalBinomialNames");
        RelationalTable family = new RelationalTable("AnimalFamilies");

        binomialName.addColumn("First Name", String.class);
        binomialName.addColumn("Last Name", String.class);
        binomialName.addColumn("idFamily", Integer.class);

        family.addColumn("FamilyName", String.class);

        family.setValue("FamilyName", 0,"Leporidae");
        family.setValue("FamilyName", 5,"Canninas");
        family.addPKColumn("id");


        binomialName.setValue("Last Name", 0,"Cuniculus");
        binomialName.setValue("First Name", 0,"Oryctolagus");
        binomialName.setFKValue("idFamily",0, family, "id", 5);



        binomialName.print();
        family.print();

        family.setValue("id", 5,"7");

        binomialName.print();
        family.print();


    }
}
