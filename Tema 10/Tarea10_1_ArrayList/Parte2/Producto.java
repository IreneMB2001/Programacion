package Tarea10_1_ArrayList.Parte2;
/* Producto.java
 * Clase que se implementará utilizando ArrayList
 * @ Author Irene Martín
 */
public class Producto {
  //Atributos de instancia//
  private String nombre;
  private int cantidad;

  //Constructor//
  public Producto(String nombre, int cantidad){
    this.nombre=nombre;
    this.cantidad=cantidad;
  }

  //Getters//
  public String getNombre(){
    return this.nombre;
  }
  public int getCantidad(){
    return this.cantidad;
  }

  //Setters//
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public void setCantidad(int cantidad){
    this.cantidad=cantidad;
  }

  //Métodos//
  public String toString(){
    return String.format( "%-12s --> %-3d unidades", nombre, cantidad);
  }
}
