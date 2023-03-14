package Ej3Animales;
/* Gato.java
 * Subclase de "Mamífero" llamada "Gato"
 * @Irene Martín
 */
public class Gato extends Mamífero {
  //Atributos//
  private String personalidad;
  
  //Constructor//
  public Gato(Sexo sexo, int edad, String alimentación, String pelaje, String velocidad, String personalidad) {
    super(sexo, edad, alimentación, pelaje, velocidad);
    this.personalidad=personalidad;
  }
  
  //Métodos//
  @Override
  public void hacerSonido() {
    System.out.println("                               /\\  /\\");  
    System.out.println("Soy un gatito y hago miauuuu  (=* T *=)");  
  }
  public void ronronear() {
    System.out.println("                      /\\   /\\");  
    System.out.println(" purrrr purr purrrr  (=^ T ^=)");  
  }
  public void escalar() {
    System.out.println("Soy un gatito intrépido al que le encanta escalar");  
    System.out.println("                              @@@@ "); 
    System.out.println("                            @@@@@@@@");  
    System.out.println("                          @@@@@@@@@@@@");  
    System.out.println("                           @@@@@@@@@@");  
    System.out.println("                      /\\   /\\ @@@@");  
    System.out.println("                     (=* T *=)|  |");  
    System.out.println("                   (  |     |D|  |");  
    System.out.println("                    \\ (_____|D|  |");  
    System.out.println("                              |  |");  
    System.out.println("                              |  |");  
    System.out.println("                             _|__|_");  
  }
}
