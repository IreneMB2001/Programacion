package Ej2Vehículos;
/* Vehículo.java
 * Clase abstracta "Vehículo" la cual es la clase principal y de donde saldrán las subclases 
 * @Irene Martín
*/
public abstract class Vehículo { 
  //Atributos de la clase Vehículo// //recordar que los atributos son privados
  private static int vehículosCreados = 0;
  private static int kmTotales = 0;

  //Atributos de instancia// 
  private int kmRecorridos;

  //Constructor//
  public Vehículo() {
    this.kmRecorridos = 0; //los kilómetros aumentarán cuando se utilize el método "recorre"
    vehículosCreados++; //cada vez que se cree un objeto el contador incrementará
  }

  //métodos// //recordar que los métodos son públicos
  public int getKmRecorridos() {
    return this.kmRecorridos;
  }
  public void desplazarse(int km) {
  /* El método "desplazarse" hace que el vehículo recorra una distancia determinada con el atributo kmRecorridos.
   * Para ello se establece dicho atributo propio (this) como un sumatorio en función de los km que se quiera recorrer.
   * También se establecerá la cuenta global de todos los kilómetros recorridos de todos los vehículos
   * @param int k kilómetros que va a recorre el vehículo
   */
    this.kmRecorridos = this.kmRecorridos+km;
    Vehículo.kmTotales = Vehículo.kmTotales+km;
  }

  //Corresponden al conjunto de vehículos, por eso no tienen this y son static//
  public static int getVehículosCreados() {
    return Vehículo.vehículosCreados;
  }
  public static int getKmTotales() {
    return Vehículo.kmTotales; 
  }
}
