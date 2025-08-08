package org.ies63.progI.collections;

import org.ies63.progI.enums.Marca;
import org.ies63.progI.models.Auto;

import java.util.Set;
import java.util.TreeSet;

public class EjTreeSet {


  public static void main(String[] args) {

    Auto auto1 = new Auto("AB123JV", "Rojo", 2020, 14000, "Focus", Marca.FORD);
    Auto auto2 = new Auto("AG012BB", "Azul", 2024, 15000, "C3", Marca.CITROEN);
    Auto auto3 = new Auto("AA123KK", "Negro", 2022, 130000, "C4", Marca.CITROEN);
    Auto auto4 = new Auto("AB123LL", "Gris", 2023, 125000, "Ecosport", Marca.FORD);
    Auto auto5 = new Auto("AB123NN", "Blanco", 2023, 125000, "Gol", Marca.VW);
    Auto auto6 = new Auto("AA123NN", "Gris", 2020, 150000, "Corolla", Marca.TOYOTA);
    Auto auto7 = new Auto("AG124AA", "Rojo", 2024, 25000, "Yaris", Marca.TOYOTA);

    /// crear un TreeSet
    Set<Auto> treeSetAutos= new TreeSet<>();
    treeSetAutos.add(auto1);
    treeSetAutos.add(auto2);
    treeSetAutos.add(auto3);
    treeSetAutos.add(auto4);
    treeSetAutos.add(auto5);
    treeSetAutos.add(auto6);
    treeSetAutos.add(auto6);
    treeSetAutos.add(auto7);

//    Set<Auto> treeSetAutos=  Set.of(auto1,auto2,auto3,auto4,auto5,auto6,auto7);

     for(Auto auto: treeSetAutos){
         System.out.println(auto.toString());
     }

  }


}
