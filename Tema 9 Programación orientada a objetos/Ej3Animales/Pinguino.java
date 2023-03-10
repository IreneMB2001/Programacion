package Ej3Animales;
/* Pinguino.java
 * Subclase de "Ave" llamada "Pinguino"
 * @Irene Martín
 */
public class Pinguino extends Ave {
  //Constructor//
  public Pinguino(Sexo sexo, int edad, String alimentación, String plumaje, String pico) {
    super(sexo, edad, alimentación, plumaje, pico);
  }
  //Métodos//
  @Override   
  public void desplazarse() {
    System.out.println("Como soy un pinguino no puedo volar, así que camino como los mamíferos");  
  }
  public void deslizarse() {
    System.out.println("Una colina de nieve! allá voy .... FIUNNNNNNN");  
    System.out.println("        /  W__W  \\ ");  
    System.out.println("       /  <(__)>  \\");
    System.out.println("      /   (^<>^)   \\");  
    System.out.println("     /              \\"); 
  }
}
  
