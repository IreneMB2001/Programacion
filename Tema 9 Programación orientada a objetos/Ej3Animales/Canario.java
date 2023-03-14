package Ej3Animales;
/* Canario.java
 * Subclase de "Ave" llamada "Canario"
 * @Irene Martín
 */
public class Canario extends Ave {
  //Constructor//
  public Canario(Sexo sexo, int edad, String alimentación, String plumaje, String pico) {
    super(sexo, edad, alimentación, plumaje, pico);
  }
  //Métodos//
  public void cantar() {
    System.out.println("tralararari tralararara  (\\(*>/) o/` o/`");  
  }
}
