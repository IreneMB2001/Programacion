package Ej3Animales;
/* Ave.java
 * Subclase de "Animal" llamada "Ave", siendo una extensión de la clase principal
 * @Irene Martín
 */
public class Ave extends Animal {
  //Atributos de animal//
  private String plumaje; 
  private String tipoDePico;
  
  //Constructor//
  public Ave (Sexo sexo, int edad, String alimentación, String plumaje, String pico) {
      super(sexo, edad, alimentación); //hace una llamada a los atributos y métodos de la clase principal
      this.plumaje=plumaje;
      this.tipoDePico=pico;
  }

  //Métodos del ave//
  public void picotear() {
    System.out.println("Pico pico pico (\\(*>/)");
  }
  public void extenderAlas() {
    System.out.println("Mira que alas tan bonitas tengo");

    System.out.println("  (\\(*>/)");
    System.out.println("    ( )");
    System.out.println("   _| |_");
  }

  public void ponerHuevos() {
    System.out.println("Ya es hora de darle la bienvenida a mis huevecitos");
    System.out.println("        (*>              ");
    System.out.println("       /)_)               ");
    System.out.println("      O O O                ");
    System.out.println("     XXXXXXX              ");
  }

  
//con el polimorfismo tenemos un mismo metodo pero de diferentes maneras, hay que utilizar override, por ejemplo desplazarse pero el pajaro vuela
  @Override   
  public void desplazarse() {
    System.out.println("Soy un ave y me desplazo volando  (\\(*>/)");  
  }

  public void hacerSonido() {
    System.out.println("Soy un ave y hago pio pio  (\\(*< /)");  
  }





}
