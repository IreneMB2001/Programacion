package Ej7ExpoCochesModificado;
/* Zona.java
 * Creación de la clase Zona para la gestión de entradas de Expocoches Campanillas
 * Se necesitarán los atributos y métdos necesarios para la venta y control de entradas
 * @Irene Martin
 */
public class Zona {
  private int entradasPorVender;

  public Zona(int n){
    entradasPorVender = n;
  }
  public int getEntradasPorVender() {
    return entradasPorVender;
  }
  /**
  * Vende un número de entradas.
  * Comprueba si quedan entradas libres antes de realizar la venta.
  *
  * @param n número de entradas a vender
  */
  public void vender(int n) {
    if (this.entradasPorVender == 0) {
      System.out.println("Lo siento, las entradas para esa zona están agotadas.");
    } else if (this.entradasPorVender < n) {
      System.out.println("Sólo me quedan " + this.entradasPorVender + " entradas para esa zona.");
    }
    if (this.entradasPorVender >= n) {
      entradasPorVender -= n; //se restan las entradas disponibles menos el numero de entradas que se van a vender
      System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
    }
  }
}
    