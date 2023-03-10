package Ej3Animales;
/* Animal.java
 * Clase abstracta "Animal" la cual es la clase principal y de donde saldrán las subclases 
 * @Irene Martín
 */
public abstract class Animal { 
  //Atributos de la clase Animal// //servirá para saber cuantos animales tenemos creados
  private static int animalesCreados = 0;
  
  //Atributos de instancia// 
  private Sexo sexo;
  private int edad;
  private String alimentación;
  
  //Constructor//
  public Animal(Sexo sexo, int edad, String alimentación) {
    this.sexo=sexo;
    this.edad=edad;
    this.alimentación=alimentación;
    animalesCreados++;
  }

  //métodos// //recordar que los métodos son públicos

  //Si preguntamos por los siguientes atributos del animal nos devolverá su valor en el main//
  public Sexo getSexo() {
    return this.sexo;
  }
  public int getEdad() {
    return this.edad;
  }
  public static int getAnimalesCreados() {
    /* Método para saber cuantos animales han sido creados
     * @return Animal.animalesCreados
     */
    return Animal.animalesCreados; 
  }
  public void comer(String comida) {
    /* La comida sólo podrá ser "carne, pescado, bichos, pienso"
     * @param int comida que se le va a ofrecer al animal
     * @return void
     */
    if (alimentación.equals(comida)) {
      System.out.println("mmm, que rico (^ w ^)");
    } else {
      System.out.println("puaj quita, esa comida no me gusta (o` _ ´o) ");
    }
  }
  public void dormir() {
    System.out.println("Ahora mismo estoy durmiendo, ni se te ocurra molestarme ZZZZzzzz (- o -)");
  }
  public void desplazarse() {
    System.out.println("Soy un animal y me desplazo");  
  }
}
  