package misFunciones;
import misFunciones.Varias;
import java.util.Scanner;
public class Geometria {
  //Función calcular perímetro//
  public static double perimetroRectangulo(double ancho, double alto) {
    /*
    * Realiza el perímetro de un rectángulo ((2*ancho) + (2*alto)).
    *
    * @param double ancho
    * @param double alto
    * @return double perímetro del rectángulo
    */
    double perimetro=(Varias.multiplica(ancho, 2)+(Varias.multiplica(alto, 2)));
    return perimetro;
    }

  //Función calcular área//
  public static double areaRectangulo(double ancho, double alto) {
    /*
    * Realiza el área de un rectángulo (ancho*alto).
    *
    * @param double ancho
    * @param double alto
    * @return double área del rectángulo
    */
    double area=(Varias.multiplica(ancho, alto));
    return area;
  }
  
  //Función crear pirámide
  public static void CreaPiramide(int altura, String relleno) {
    /*
    * Pinta una pirámide según una altura y un relleno establecido.
    *
    * @param int altura
    * @param String relleno
    * @return void porque no devuelve un valor, sino que imprime la pirámide.
    */
        
    int planta=1; //Con la variable planta se cuentan las plantas que se van pintando, empezando por la planta 1//
    int totalBlanco=altura-1;   
      
    //Bucle general//
    while (planta <= altura) { //El bucle se mantiene mientras la planta sea inferior o igual a la altura establecida//
    //Bucle for para pintar el numero de blancas (espacios)//
      for (int b=1; b<=totalBlanco; b++) {
        System.out.print (" ");
      }
      //Bucle for para pintar el numero de rellenas//
      for (int r=1; r<=(2*planta-1); r++) {
        System.out.print (relleno);
      }
      totalBlanco--; //Una vez el bucle da una vuelta se disminuye el total de blancos a pintar para utilizar mas relleno//
      planta++; //Una vez el bucle da una vuelta se incrementa la planta para realizar la siguiente//
      System.out.println();
    }
  }

  //Funcion mostrar menu de opciones//
  public static int menu (){
    /*
    * Muestra un menú para elegir diferentes funciones geométricas y devuelve la opción elegida.
    * 
    * @return int elección elegida
    */
    Scanner s= new Scanner (System.in);  
    System.out.println(); 
    System.out.println(" Menú de funciones geométricas"); 
    System.out.println(" --------------------------------------------------------");         
    System.out.println(" 1.Circunferencia  2.Área   3.Volumen   4.Todas   5.Salir");  
    System.out.println(" --------------------------------------------------------");    
    System.out.print(" Elige una opción --> "); 
    String respuesta=s.next();
    respuesta=respuesta.toLowerCase();
    int eleccion=0;      
    switch (respuesta){
      case "circunferencia":
        eleccion=1;
        break;
      case "area":
        eleccion=2;
        break;
      case "volumen":
        eleccion=3;
        break;
      case "todas":
        eleccion=4;
        break;
      case "salir":
        eleccion=5;
        break;
      default:
        eleccion=0;
    }
    System.out.println(" Has elegido la opción " +eleccion+ "\n"); 
    return eleccion;
  }
  
  //Funcion pedir radio//
  public static double pideRadio (){
    /*
    * Función que pide que se introduzca un radio y devuelve dicho valor.
    *
    * @return double radio introducido.
    */
    Scanner s= new Scanner (System.in);  
    System.out.println(); 
    System.out.print(" Introduce el radio para realizar el calculo --> "); 
    double radio=s.nextDouble();
    return radio;
  }

  //Funcion calcular circunferencia//
  public static double circunferencia (double r){
    /*
    * Función que calcula la circunferencia según un radio r establecido.
    *
    * @param double r que será el radio según el cual se quiere calcular la circunferencia.
    * @return double longitud de la circunferencia.
    */
    System.out.print(" La circunferencia es --> "); 
    double pi;
    pi=3.14;
    double longitud;
    longitud=(2*pi)*r;
    return longitud;
  }

  //Funcion calcular área de un círculo//
  public static double areaCirculo (double r){
    /*
    * Función que calcula el área según un radio r establecido.
    *
    * @param double r que será el radio según el cual se quiere calcular el área.
    * @return double area de la circunferencia.
    */
    System.out.print(" El área es --> "); 
    double pi;
    pi=3.14;
    double area;
    area=pi*(r*r);
    return area;
  }

  //Funcion calcular volumen esfera//
  public static double volumen (double r){
    /*
    * Función que calcula el volumen según un radio r establecido.
    *
    * @param double r que será el radio según el cual se quiere calcular el volumen.
    * @return double volumen de la esfera.
    */
    System.out.print(" El volumen es --> "); 
    double pi;
    pi=3.14;
    double volumen;
    volumen=((4/3)*pi*(r*r*r));
    return volumen;
  }



}






