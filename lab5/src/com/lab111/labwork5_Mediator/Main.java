package com.lab111.labwork5_Mediator;


public class Main {

    public static void main(String[] args) {
       Mediator mediator = new ConcreteMediator();
        Table binomialName = new Table("AnimalBinomialNames");
        Table family = new Table("AnimalFamilies");

        binomialName.addColumn("First Name");
        binomialName.addColumn("Last Name");
        binomialName.addColumn("idFamily");

        family.addColumn("FamilyName");

        family.setValue(mediator, "FamilyName", 0,"Leporidae");
        family.setValue(mediator,"FamilyName", 5,"Canninas");
        family.addPKColumn(mediator, "id");


        binomialName.setValue(mediator,"Last Name", 0,"Cuniculus");
        binomialName.setValue(mediator,"First Name", 0,"Oryctolagus");
        binomialName.setFKValue(mediator,"idFamily",0, family, "id", 0);


        binomialName.print();
        family.print();

        binomialName.setFKValue(mediator,"idFamily",0, family, "id", 5);

        binomialName.print();
        family.print();

//        family.deletePKCell(mediator, "id", 5);
//
//        binomialName.print();
//        family.print();

    }
}
