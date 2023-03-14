package Ej3Animales;
/* Mamífero.java
 * Subclase de "Animal" llamada "Mamífero", siendo una extensión de la clase principal
 * @Irene Martín
*/
public class Mamífero extends Animal {
  //Atributos//
  private String pelaje; 
  private String velocidad;
    
  //Constructor//
  public Mamífero (Sexo sexo, int edad, String alimentación, String pelaje, String velocidad) {
    super(sexo, edad, alimentación); //hace una llamada a los atributos y métodos de la clase principal
    this.pelaje=pelaje;
    this.velocidad=velocidad;
  }

  //Métodos del Mamífero//
  @Override   
  public void desplazarse() {
    System.out.println("Soy un mamífero y me desplazo caminando");  
  }
  public void hacerSonido() {
    System.out.println("Soy un mamífero y hago un sonido");  
  }
  public void darDeMamar() {
    if (this.getSexo()==Sexo.macho) {
      System.out.println ("Soy un macho, las hembras son las que dan de mamar");
    } else {
      System.out.println("                                                   /\\ /\\");  
      System.out.println("toma mi querida cría, aquí tienes un poco de leche (*w*) ");  
      System.out.println("                                                    uu_)/ "); 
    }
  }
}
