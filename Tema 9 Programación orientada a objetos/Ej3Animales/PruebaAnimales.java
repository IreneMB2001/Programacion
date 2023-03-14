package Ej3Animales;
/* PruebaAnimales.java
 * Prueba de la clase Animal con sus diferentes subclases
 * @Irene Martín
 */
import java.util.Scanner;

public class PruebaAnimales {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);

    //Declaración de variables//
    String comida="";

    //Declaración de objetos//
    //Recordar que la alimentación tiene que ser --> carne, pescado, bichos, pienso o alpiste//
    Pinguino pingu = new Pinguino(Sexo.macho, 2, "pescado", "plumas blancas y negras", "pico pequeño y naranja");
    Gato lucifer = new Gato(Sexo.hembra, 4, "pescado", "negro y blanco", "48 km", "maligno");
    Perro canuto = new Perro(Sexo.macho, 8, "pienso", "liso y negro", "52 km", "Husky Siberiano");
    Perro blanquita = new Perro(Sexo.hembra, 8, "pienso", "liso y blanco", "52 km", "Pomerania");
    Canario piolin = new Canario(Sexo.macho, 3, "alpiste", "plumas amarillas y blancas", "pico pequeño y blanco");
    Lagarto charizard = new Lagarto(Sexo.macho, 4, "bichos", "piel con escamas", false, false, "verde");

    //Prueba de los métodos//
    System.out.println();
    System.out.println("Cuántos animales hemos creado?");
    System.out.println("En total han sido creados "+ Animal.getAnimalesCreados()+ " animales\n");
    System.out.print("Vamos a darle de comer a pingu, elige entre : ");
    System.out.println(" carne, pescado, bichos, pienso, alpiste");
    System.out.print("elección --> ");
    comida=s.next();
    pingu.comer(comida);
    System.out.println();
    System.out.println("Canuto, que sonido puedes hacer?");
    canuto.hacerSonido();
    System.out.println();
    System.out.println("Canuto, puedes amamantar a tus crías?");
    canuto.darDeMamar();
    System.out.println("Vale vale, entonces Blanquita, tu puedes amamantar a tus crías?");
    blanquita.darDeMamar();
    System.out.println();
    System.out.println("Blanquita, acabo de captar un movimiento extraño, puedes rastrear qué puede ser?");
    blanquita.rastrear();
    System.out.println();
    System.out.println("Eh Lucifer, que estás haciendo ahí arriba?");
    lucifer.escalar();
    System.out.println();
    System.out.println("Oye pingu, puedes volar?");
    pingu.desplazarse();
    System.out.println();
    System.out.println("Pingu, mira esa colina de allí");
    pingu.deslizarse();
    System.out.println();
    System.out.println("Puedo ver tus alas piolin?");
    piolin.extenderAlas();
    System.out.println();
    System.out.println("Cántame algo piolin");
    piolin.cantar();
    System.out.println();
    System.out.println("Charizard, dónde estás?");
    charizard.camuflarse();
    System.out.println();
    System.out.println("Bzzzzz bzzzz");
    charizard.cazar();
    System.out.println();
    System.out.println("Piolin, que estás haciendo con ese nido?");
    piolin.ponerHuevos();
    System.out.println();
    System.out.println("Ven aquí Lucifer, quiero darte mimos");
    lucifer.ronronear();
  }
}
