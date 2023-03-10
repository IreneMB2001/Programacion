package Ej2Vehículos;
/* Bicicleta.java
 * Subclase de "Vehículo" llamada "Bicicleta", siendo una extensión de la clase principal
 * @Irene Martín
*/
public class Coche extends Vehículo { 
    //Atributos de coche//
    private String marca; 
    private String matrícula;
    private String color;
    private int caballos;
  
    public Coche(String marca, String matricula, String color, int caballos) {
      super(); //hace una llamada a los atributos y métodos de la clase principal
      this.marca=marca;
      this.matrícula=matricula;
      this.color=color;
      this.caballos=caballos;
    }
    
    //Métodos del coche//
  
    //Método "arrancar" mostrará por pantalla un mensaje de que se está realizando la acción
    public void arrancar() {
        System.out.println("Arrancando coche");
        System.out.println("         _______");
        System.out.println("     ___/___|___\\___");
        System.out.println("..../-@----------@--/  brummmmmmm\n");
    }


    //Método "quemarRuedas" mostrará por pantalla un mensaje de que se está realizando la acción
    public void quemarRuedas() {
        System.out.println("Quemando ruedas");
        System.out.println("         _______");
        System.out.println("     ___/___|___\\___");
        System.out.println("..**/-@----------@--/  fffsshshhhhhh\n");
    }

    //Método "tocarClaxon" mostrará por pantalla un mensaje de que se está realizando la acción
    public void tocarClaxon() {
        System.out.println("tocando claxon");
        System.out.println("         _______");
        System.out.println("     ___/___|___\\___");
        System.out.println("..../-@----------@--/  pi pi piiiii\n");
    }
}
  