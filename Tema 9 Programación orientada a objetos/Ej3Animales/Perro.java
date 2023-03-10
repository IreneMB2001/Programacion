package Ej3Animales;
/* Perro.java
 * Subclase de "Mamífero" llamada "Perro"
 * @Irene Martín
 */
public class Perro extends Mamífero {
  //Atributos//
  private String raza;

  //Constructor//
  public Perro(Sexo sexo, int edad, String alimentación, String pelaje, String velocidad, String raza) {
    super(sexo, edad, alimentación, pelaje, velocidad);
    this.raza=raza;
  }

  //Métodos//
  @Override
  public void hacerSonido() {
    System.out.println("Soy un perro y hago guau guau   (/(* T *)\\)");
  }
  public void rastrear() {
    System.out.println("Snif snif snif, mmm percibo algo .... ARDILLA!! (/(O` T ´O)\\)");
  }
  public void darLaPatita() {
    System.out.println("toma, aquí tienes mi patita (/(^ T ^)\\)");
  }
}
