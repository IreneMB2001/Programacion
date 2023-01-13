/*Cuestionario10Preguntas.java
*Programa que realiza un cuestionario de 10 preguntas y despues te dice la calificacion obtenida.
*@Irene Martin
*/
import java.util.Scanner; //declaramos el Scanner//

public class Cuestionario10Preguntas {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in); //Creamos el objeto Scanner, llamado s// 
    
    int puntuacion=0; //declaramos la variable int puntuacion, que sera nuestro contador de puntos. Se inicia a 0.//
    
    System.out.println (" "); //Imprime un hueco en blanco para que el texto quede mas separado//
    
    System.out.print (" Vamos a realizar un cuestionario de 10 preguntas sobre la asignatura, ");
    System.out.println ("(responde: a, b, c o d) ");
    
    System.out.println (" ");
    
    //Pregunta 1----------------------------------------------------------------------------------------------------------//
    System.out.println (" Pregunta 1: En que se basaban las computadoras de la primera generacion?");
    
    System.out.println (" a: tubos de vacio");
    
    System.out.println (" b: transistores");
    
    System.out.println (" b: tarjetas perforadas");
   
    System.out.println (" b: circuitos integrados");
   
    System.out.print (" respuesta: ");
    String respuesta1= s.nextLine(); //variable String que recoge el dato introducido por teclado//
    respuesta1= respuesta1.toLowerCase(); //convierte el dato de la variable en minuscula para que sea valida la respuesta//
    
    //condicion if//   
    if (respuesta1.equals("a")) {
      puntuacion++; //suma 1 a la variable puntuacion//
      System.out.println (" ");
      System.out.println (" Muy bien, respuesta correcta!");
    } else {
      System.out.println (" ");
      System.out.println (" Ups, respuesta incorrecta");
    }
    
    System.out.println (" ");
    
    //Pregunta2-----------------------------------------------------------------------------------------------------------//
    System.out.println (" Pregunta 2: Que significa System.out.println?");
    
    System.out.println (" a: Instruccion que imprime una frase en pantalla.");
    
    System.out.println (" b: Instruccion que imprime una frase en pantalla con salto de linea.");
    
    System.out.println (" b: Instruccion que recoge datos por teclado.");
   
    System.out.println (" c: Instruccion que permite formatear la salida que se va a mostrar por pantalla.");
   
    System.out.print (" respuesta: ");
    String respuesta2= s.nextLine(); //variable String que recoge el dato introducido por teclado//
    respuesta2= respuesta2.toLowerCase(); //convierte el dato de la variable en minuscula para que sea valida la respuesta//
    
    //condicion if//
    if (respuesta2.equals("b")) {
      puntuacion++; //suma 1 a la variable puntuacion//
      System.out.println (" ");
      System.out.println (" Muy bien, respuesta correcta!");
    } else {
      System.out.println (" ");
      System.out.println (" Ups, respuesta incorrecta");
    }
    
    System.out.println (" ");
    
    //Pregunta3----------------------------------------------------------------------------------------------------------//
    System.out.println (" Pregunta 3: Que significa la etiqueta <h1>?");
    
    System.out.println (" a: Etiqueta de html que muestra un parrafo.");
    
    System.out.println (" b: Etiqueta de html que muestra un encabezado de nivel 1.");
    
    System.out.println (" b: Etiqueta de html que muestra un encabezado de nivel 2.");
   
    System.out.println (" c: Etiqueta de html que crea una tabla.");
   
    System.out.print (" respuesta: ");
    String respuesta3= s.nextLine(); //variable String que recoge el dato introducido por teclado//
    respuesta3= respuesta3.toLowerCase(); //convierte el dato de la variable en minuscula para que sea valida la respuesta//

    //condicion if//
    if (respuesta3.equals("b")) {
      puntuacion++; //suma 1 a la variable puntuacion//
      System.out.println (" ");
      System.out.println (" Muy bien, respuesta correcta!");
    } else {
      System.out.println (" ");
      System.out.println (" Ups, respuesta incorrecta");
    }
    
    System.out.println (" ");
    
    //Pregunta4-----------------------------------------------------------------------------------------------------------//
    System.out.println (" Pregunta 4: Un entorno integrado de desarrollo esta compuesto por: ");
    
    System.out.println (" a: Editor de codigo y traductor.");
    
    System.out.println (" b: Editor de codigo, compilador e interfaz de comandos.");
    
    System.out.println (" c: Editor de codigo, compilador, interprete, depurador e interfaz grafica.");
   
    System.out.println (" d: Interfaz grafica, editor de codigo y depurador");
   
    System.out.print (" respuesta: ");
    String respuesta4= s.nextLine(); //variable String que recoge el dato introducido por teclado//
    respuesta4= respuesta4.toLowerCase(); //convierte el dato de la variable en minuscula para que sea valida la respuesta//

    //condicion if//
    if (respuesta4.equals("c")) {
      puntuacion++; //suma 1 a la variable puntuacion//
      System.out.println (" ");
      System.out.println (" Muy bien, respuesta correcta!");
    } else {
      System.out.println (" ");
      System.out.println (" Ups, respuesta incorrecta");
    }
    
    System.out.println (" ");
    
    //Pregunta5--------------------------------------------------------------------------------------------------------------//
    System.out.println (" Pregunta 5: En que consiste la fase de Disenio del Ciclo de Vida del Software? ");
    
    System.out.println (" a: Escritura del codigo, depuracion, traduccion, etc.");
    
    System.out.println (" b: Instalacion y comprobacion del funcionamiento.");
    
    System.out.println (" c: Definir requisitos y comprender el problema a solucionar.");
   
    System.out.println (" d: Creacion de la estructura del algoritmo.");
   
    System.out.print (" respuesta: ");
    String respuesta5= s.nextLine(); //variable String que recoge el dato introducido por teclado//
    respuesta5= respuesta5.toLowerCase(); //convierte el dato de la variable en minuscula para que sea valida la respuesta//

    //condicion if//
    if (respuesta5.equals("d")) {
      puntuacion++; //suma 1 a la variable puntuacion//
      System.out.println (" ");
      System.out.println (" Muy bien, respuesta correcta!");
    } else {
      System.out.println (" ");
      System.out.println (" Ups, respuesta incorrecta");
    }
    
    System.out.println (" ");
    
    //Pregunta6-----------------------------------------------------------------------------------------------------------//
    System.out.println (" Pregunta 6: Que es un algoritmo? ");
    
    System.out.println (" a: Conjunto ordenado y finito de operaciones que resuelven un problema.");
    
    System.out.println (" b: Conjunto ordenado e infinito de operaciones que resuelven un problema.");
    
    System.out.println (" c: Conjunto desordenado y finito de operaciones que resuelven un problema.");
   
    System.out.println (" d: Conjunto desordenado e infinito de operaciones que resuelven un problema.");
   
    System.out.print (" respuesta: ");
    String respuesta6= s.nextLine(); //variable String que recoge el dato introducido por teclado//
    respuesta6= respuesta6.toLowerCase(); //convierte el dato de la variable en minuscula para que sea valida la respuesta//

    //condicion if//
    if (respuesta6.equals("a")) {
      puntuacion++; //suma 1 a la variable puntuacion//
      System.out.println (" ");
      System.out.println (" Muy bien, respuesta correcta!");
    } else {
      System.out.println (" ");
      System.out.println (" Ups, respuesta incorrecta");
    }
    
    System.out.println (" ");
    
    //Pregunta7-----------------------------------------------------------------------------------------------------------//
    System.out.println (" Pregunta 7: Que es una clave primaria? ");
    
    System.out.println (" a: Objeto para agregar funciones a una tabla.");
    
    System.out.println (" b: Llave que relaciona dos entidades entre si.");
    
    System.out.println (" c: Sentencia para recuperar datos especificos de una tabla.");
   
    System.out.println (" d: Campo o un conjunto de campos que identifican de forma unica un registro.");
   
    System.out.print (" respuesta: ");
    String respuesta7= s.nextLine(); //variable String que recoge el dato introducido por teclado//
    respuesta7= respuesta7.toLowerCase(); //convierte el dato de la variable en minuscula para que sea valida la respuesta//

    //condicion if//
    if (respuesta7.equals("d")) {
      puntuacion++; //suma 1 a la variable puntuacion//
      System.out.println (" ");
      System.out.println (" Muy bien, respuesta correcta!");
    } else {
      System.out.println (" ");
      System.out.println (" Ups, respuesta incorrecta");
    }
    
    System.out.println (" ");
    
    //Pregunta8-------------------------------------------------------------------------------------------------------------//
    System.out.println (" Pregunta 8: Que es el hardware? ");
    
    System.out.println (" a: Es lo logico y no tangible de un ordenador.");
    
    System.out.println (" b: Son todos los componentes fisicos que conforman la maquina en su conjunto.");
    
    System.out.println (" c: El el procesador, que contiene la ALU y la Unidad de control.");
   
    System.out.println (" d: Constituye todos los elementos de entrada y salida.");
   
    System.out.print (" respuesta: ");
    String respuesta8= s.nextLine(); //variable String que recoge el dato introducido por teclado//
    respuesta8= respuesta8.toLowerCase(); //convierte el dato de la variable en minuscula para que sea valida la respuesta//

    //condicion if//
    if (respuesta8.equals("b")) {
      puntuacion++; //suma 1 a la variable puntuacion//
      System.out.println (" ");
      System.out.println (" Muy bien, respuesta correcta!");
    } else {
      System.out.println (" ");
      System.out.println (" Ups, respuesta incorrecta");
    }
           
    System.out.println (" ");
    
    //Pregunta9-------------------------------------------------------------------------------------------------------------//
    System.out.println (" Pregunta 9: Que son los lenguajes de alto nivel? ");
    
    System.out.println (" a: Lenguajes que dependen del hardware y son complejos para el entendimiento humano.");
    
    System.out.println (" b: Son los lenguajes binario y ensamblador.");
    
    System.out.println (" c: Lenguajes independientes del hardware y mas cercanos al lenguaje humano.");
   
    System.out.println (" d: Son traductores que transforman el programa en un lenguaje entendible para la maquina.");
   
    System.out.print (" respuesta: ");
    String respuesta9= s.nextLine(); //variable String que recoge el dato introducido por teclado//
    respuesta9= respuesta9.toLowerCase(); //convierte el dato de la variable en minuscula para que sea valida la respuesta//

    //condicion if//
    if (respuesta9.equals("c")) {
      puntuacion++; //suma 1 a la variable puntuacion//
      System.out.println (" ");
      System.out.println (" Muy bien, respuesta correcta!");
    } else {
      System.out.println (" ");
      System.out.println (" Ups, respuesta incorrecta");
    }
               
    System.out.println (" ");
    
    //Pregunta10-------------------------------------------------------------------------------------------------------------//
    System.out.println (" Pregunta 10: Cuales de estos lenguajes de programacion no esta orientado a objetos? ");
    
    System.out.println (" a: Java.");
    
    System.out.println (" b: Pascal.");
    
    System.out.println (" c: C++.");
   
    System.out.println (" d: Delphi.");
   
    System.out.print (" respuesta: ");
    String respuesta10= s.nextLine(); //variable String que recoge el dato introducido por teclado//
    respuesta10= respuesta10.toLowerCase(); //convierte el dato de la variable en minuscula para que sea valida la respuesta//

    //condicion if//
    if (respuesta10.equals("b")) {
      puntuacion++; //suma 1 a la variable puntuacion//
      System.out.println (" ");
      System.out.println (" Muy bien, respuesta correcta!");
    } else {
      System.out.println (" ");
      System.out.println (" Ups, respuesta incorrecta");
    }
  
    //Puntuacion final ---------------------------------------------------------------------------------------------------//
    System.out.println (" ");
    System.out.println (" Has sacado en total: " + puntuacion+ " puntos.");
  }
}
