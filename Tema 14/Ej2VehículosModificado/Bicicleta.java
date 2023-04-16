package Ej2VehículosModificado;
/* Bicicleta.java
 * Subclase de "Vehículo" llamada "Bicicleta", siendo una extensión de la clase principal
 * @Irene Martín
*/
public class Bicicleta extends Vehículo { 
  //Atributos de Bicicleta//
  private int piñones; //Número de piñones que tendrá la bicicleta
  private String color;
  private String marca;

  public Bicicleta(String color, String marca, int piñones) {
    super(); //hace una llamada a los atributos y métodos de la clase principal
    this.color=color;
    this.marca=marca;
    this.piñones=piñones;
  }
  
  //Métodos de la bicicleta//

  //Método "hacerCaballito" mostrará por pantalla un mensaje de que se está realizando la acción
  public void hacerCaballito() {
    System.out.println("Haciendo el caballito");
    System.out.println("                  T  ");
    System.out.println("    -__T        -/(@)   ");
    System.out.println("..(@)-/(@) ... (@)      \n");
  }
}
