package ArraysDeObjetos.Ej1y2Gatos;
/* Animal.java
 * Clase abstracta "Animal" la cual es la clase principal y de donde saldrán las subclases 
 * @Author Irene Martín
 */
public abstract class Animal { 
  //Atributos de la clase Animal// //servirá para saber cuantos animales tenemos creados
  private static int animalesCreados = 0;
    
  //Atributos de instancia// 
  private Sexo sexo;
  private int edad;
    
  //Constructor//
  public Animal(String sexo, int edad) {
    this.sexo=setSexo(sexo);
    this.edad=edad;
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
  public void comer(int comida) {
    System.out.println("ñam ñam");
  }

  public void dormir() {
    System.out.println("Ahora mismo estoy durmiendo, ni se te ocurra molestarme ZZZZzzzz (- o -)");
  }
  public void desplazarse() {
    System.out.println("Soy un animal y me desplazo");  
  }
  //Setters//
  public Sexo setSexo(String sexo) {
    if(sexo.equals("macho")){
      return Sexo.macho;
    } else {
      return Sexo.hembra;
    } 
  }
  public void setEdad(int edad) {
    this.edad=edad;
  }
}
    