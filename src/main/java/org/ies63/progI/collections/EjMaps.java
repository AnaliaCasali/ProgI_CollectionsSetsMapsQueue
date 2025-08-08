package org.ies63.progI.collections;

import org.ies63.progI.enums.Marca;
import org.ies63.progI.models.Auto;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class EjMaps {
  public static void main(String[] args) {


    Auto auto1 = new Auto("AB123JV", "Rojo", 2020, 14000, "Focus", Marca.FORD);
    Auto auto2 = new Auto("AG012BB", "Azul", 2024, 15000, "C3", Marca.CITROEN);
    Auto auto3 = new Auto("AA123KK", "Negro", 2022, 130000, "C4", Marca.CITROEN);
    Auto auto4 = new Auto("AB123LL", "Gris", 2023, 125000, "Ecosport", Marca.FORD);
    Auto auto5 = new Auto("AB123NN", "Blanco", 2023, 125000, "Gol", Marca.VW);
    Auto auto6 = new Auto("AA123NN", "Gris", 2020, 150000, "Corolla", Marca.TOYOTA);
    Auto auto7 = new Auto("AG124AA", "Rojo", 2024, 25000, "Yaris", Marca.TOYOTA);

    ///  mapa de doble entrada: clave: Integer, Valor: List<Auto>
    // <clave, valor> las claves no  se pueden repetir, los valores pueden repetirse
    HashMap<Integer, List<Auto>> mapaAutosPorAnio = new HashMap<>();

    HashMap<String, Auto> mapaAutosPorPatente = new HashMap<>();

    // agrego con put
    mapaAutosPorPatente.put("AG012BB", auto2);
    mapaAutosPorPatente.put("AA123KK", auto3);
    mapaAutosPorPatente.put("AG124AA", auto7);

    // existe una clave en el mapa
    System.out.println("Esta el auto con patente AA123NN? ");
    System.out.println(mapaAutosPorPatente.containsKey("AA123NN"));


    // para ver si existe un auto esta en el mapa por patente
    System.out.println("Esta el auto2? ");
    System.out.println(mapaAutosPorPatente.containsValue(auto2));
    // obtener un auto por patente(clave)   y mostrarlo
    System.out.println(mapaAutosPorPatente.get("AG012BB").toString());

    // para recorrer el mapa (pares atributo-valor)
    // por cada put que use tengo una entrada en el mapa (1 par atributo-valor)
    //POR CADA ENTRADA DEL MAPA
    for (Entry<String, Auto> fila : mapaAutosPorPatente.entrySet()) {
      //PUEDO MOSTRAR EL ATRIBUTO : USO getKey()
          System.out.println("clave: Patente: " + fila.getKey());
       // PUEDO MOSTRAR EL VALOR
          System.out.println("El km del auto es: " + fila.getValue().getKilometraje());
    }

  }

}
