package Ej3Animales;
/* Lagarto.java
 * Subclase de "Reptil" llamada "Lagarto"
 * @Irene Martín
 */
public class Lagarto extends Reptil {
  //Atributos//
  private String colorEscamas;

  //Constructor//
  public Lagarto(Sexo sexo, int edad, String alimentación, String piel, boolean caparazón, boolean veneno, String colorEscamas) {
      super(sexo, edad, alimentación, piel, caparazón, veneno);
      this.colorEscamas=colorEscamas;
  }
  //Métodos//
  public void camuflarse() {
    System.out.println("Acabo de camuflarme así que ahora no puedes verme ( /- o -\\ )");
  }
  public void cazar() {
    System.out.println("Uhhh mosca a la vista, ya eres mía!! (¬ w ¬) ");
  }
}
