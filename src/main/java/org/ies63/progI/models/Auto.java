package org.ies63.progI.models;

import org.ies63.progI.enums.Marca;

import java.util.Objects;

public class Auto implements Comparable {

  private String patente;
  private String color;
  private int anio;
  private int kilometraje;
  private String modelo;
  private Marca marca;

  //sobrecarga de métodos constructores
  // constructor
  public Auto(String patente) {
    this.patente = patente;
  }

  public Auto(String patente, String color, int anio, int kilometraje,
              String modelo, Marca marca) {
    this.patente = patente;
    this.color = color;
    this.anio = anio;
    this.kilometraje = kilometraje;
    this.modelo = modelo;
    this.marca = marca;
  }

  /// / Getters y Setters
  public String getPatente() {
    return patente;
  }

  public void setPatente(String patente) {
    this.patente = patente;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public int getKilometraje() {
    return kilometraje;
  }

  public void setKilometraje(int kilometraje) {
    this.kilometraje = kilometraje;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public Marca getMarca() {
    return marca;
  }

  public void setMarca(Marca marca) {
    this.marca = marca;
  }

  @Override
  public String toString() {
    return "Auto: " +
        " patente='" + patente + '\'' +
        ", color='" + color + '\'' +
        ", anio=" + anio +
        ", kilometraje=" + kilometraje +
        ", modelo='" + modelo + '\'' +
        ", marca=" + marca + ".";
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Auto auto = (Auto) o;
    return Objects.equals(patente, auto.patente) &&
            Objects.equals(modelo, auto.modelo) &&
              marca == auto.marca;
  }

  @Override
  public int hashCode() {
    return Objects.hash(patente, modelo, marca);
  }

  @Override
  public int compareTo(Object o) {
    // Comparar por año y luego por kilometraje
      // EL ENTERO QUE DEVUELVE PUEDE SER:  -1:menor  0: igual   1: mayor
    Auto auto = (Auto) o;
    int resultado= Integer.compare(this.anio, auto.anio);
    if(resultado==0){
      resultado = Integer.compare(this.kilometraje, auto.kilometraje);
    }
    return resultado;
  }
}
