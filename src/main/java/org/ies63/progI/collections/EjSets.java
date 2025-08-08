package org.ies63.progI.collections;

import org.ies63.progI.enums.Marca;
import org.ies63.progI.models.Auto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EjSets {

  //psvm
  public static void main(String[] args) {

    Auto auto1 = new Auto("AB123JV", "Rojo", 2020, 14000, "Focus", Marca.FORD);
    Auto auto2 = new Auto("AG012BB", "Azul", 2024, 15000, "C3", Marca.CITROEN);
    Auto auto3 = new Auto("AA123KK", "Negro", 2022, 130000, "C4", Marca.CITROEN);
    Auto auto4 = new Auto("AB123LL", "Gris", 2023, 125000, "Ecosport", Marca.FORD);
    Auto auto5 = new Auto("AB123NN", "Blanco", 2023, 125000, "Gol", Marca.VW);
    Auto auto6 = new Auto("AA123NN", "Gris", 2020, 150000, "Corolla", Marca.TOYOTA);
    Auto auto7 = new Auto("AG124AA", "Rojo", 2024, 25000, "Yaris", Marca.TOYOTA);


    //creo Set
    Set<Auto> setAutos = new LinkedHashSet<Auto>();
    //agrego elementos con metodo add
    setAutos.add(auto7);
    setAutos.add(auto1);
    setAutos.add(auto2);
    setAutos.add(auto2);// no se agrega porque es repetido
    setAutos.add(auto3);
    setAutos.add(auto4);
    setAutos.add(auto5);
    setAutos.add(auto6);
    setAutos.add(auto7);// no se agrega porque es repetido

    /* NO se puede agregar null en HashSet
    Auto auto8=null;
    setAutos.add(auto8); // se agrega null una sola vez
    */

    mostrarSet("-----------Recorro el set con for-each", setAutos);

    System.out.println("------------recorro el set con iterator");
    Iterator<Auto> it = setAutos.iterator();
    while (it.hasNext()) {
      Auto a = it.next();
      System.out.println(a.toString());
    }
    // ver si contiene un elemento
    System.out.println("Esta el C3 en la lista? " + setAutos.contains(auto2));
    System.out.println("Tamaño del set : " + setAutos.size());
    setAutos.clear();  // elimina todos los elementos del set

    System.out.println("Tamaño del set luego de clear: " + setAutos.size());
    System.out.println("Está vacio el set?: " + setAutos.isEmpty());
    mostrarSet("-----------Recorro el set con for-each luego de clear", setAutos);

  }

  private static void mostrarSet(String msg, Set<Auto> setAutos) {
    //recorro  y muestro
    System.out.println(msg);
    for (Auto a : setAutos) {
      System.out.println(a.toString());
    }
  }

}
