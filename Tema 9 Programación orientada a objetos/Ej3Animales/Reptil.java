package Ej3Animales;
/* Reptil.java
 * Subclase de "Animal" llamada "Repil", siendo una extensión de la clase principal
 * @Irene Martín
*/
public class Reptil extends Animal{
  //Atributos de Reptil//
  private String TipoDePiel; 
  private boolean caparazón;
  private boolean venenoso;
  
  //Constructor//
  public Reptil (Sexo sexo, int edad, String alimentación, String piel, boolean caparazón, boolean veneno) {
    super(sexo, edad, alimentación); //hace una llamada a los atributos y métodos de la clase principal
    this.TipoDePiel=piel;
    this.caparazón=caparazón;
    this.venenoso=veneno;
  }

  //Métodos del Reptil//
  @Override   
  public void desplazarse() {
    System.out.println("Soy un reptil y me desplazo reptando");  
  }
  public boolean getCaparazon() {
    return this.caparazón;
  }
  public boolean getVenenoso() {
    return this.venenoso;
  }
}
