package org.ies63.progI.collections;

import org.ies63.progI.enums.Marca;
import org.ies63.progI.models.Auto;

import java.util.*;

public class EjQueue {

  public static void main(String[] args) {
    Auto auto1 = new Auto("AB123JV", "Rojo", 2020, 14000, "Focus", Marca.FORD);
    Auto auto2 = new Auto("AG012BB", "Azul", 2024, 15000, "C3", Marca.CITROEN);
    Auto auto3 = new Auto("AA123KK", "Negro", 2022, 130000, "C4", Marca.CITROEN);
    Auto auto4 = new Auto("AB123LL", "Gris", 2023, 125000, "Ecosport", Marca.FORD);
    Auto auto5 = new Auto("AB123NN", "Blanco", 2023, 125000, "Gol", Marca.VW);
    Auto auto6 = new Auto("AA123NN", "Gris", 2020, 150000, "Corolla", Marca.TOYOTA);
    Auto auto7 = new Auto("AG124AA", "Rojo", 2024, 25000, "Yaris", Marca.TOYOTA);

 //
    //ArrayDeque <Auto> queueAutos = new ArrayDeque<>();

    PriorityQueue<Auto> queueAutos = new PriorityQueue<>(Collections.reverseOrder());

    // para agregar elementos  uso add (Collections)
    queueAutos.add(auto1);

    // para agregar elementos  uso offer (Queue)
    queueAutos.offer(auto2);
    queueAutos.offer(auto3);

    // agrego al principio de la cola
   // queueAutos.offerFirst(auto4);

    /// agrego al final de la cola
   // queueAutos.offerLast(auto5);
    queueAutos.offer(auto6);
    queueAutos.offer(auto7);

      /* NO SE PUEDE AGREGAR OBJETOS NULL
    Auto auto8=null;
    queueAutos.offer(auto8);
    */
    // toma el primer elemento de la cola
    System.out.println("Element:" + queueAutos.element().toString());

//    System.out.println("Peek Ultimo:" + queueAutos.peekLast().toString());
    System.out.println("Peek:" + queueAutos.peek().toString());
 //   System.out.println("Peek Primero:" + queueAutos.peekFirst().toString());

    // el primero que se agregó es el primero que se elimina
     while (!queueAutos.isEmpty())
     {  // poll saca elementos de la cola
        System.out.println("Elimino con Poll: " + queueAutos.poll().toString());
     }

    System.out.println("Esta vacia?" + queueAutos.isEmpty());
    /*
    for (Auto auto: queueAutos){
      System.out.println(auto.toString());
    }
  */
  }
}
