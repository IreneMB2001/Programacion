package misFunciones;
public class FunciArrays {
  //Funcion generar Array de tamaño t//
  public static int[] generaArrayInt (int t) {
  /*
  * Genera un Array según un tamaño (t) indicado de los primeros números naturales.
  *
  * @param t int que será el tamaño del array que se genere
  * @return int[] array formado por enteros de los primeros números naturales hasta llegar a t
  */
    int[] num= new int[t];

    for (int i=0; i<t; i++) { 
      num[i]=i+1; 
    }
    return num;
  }

  //Funcion devolver suma del Array//
  public static int sumaArrayInt (int x[]) {
  /*
  * Suma los valores de un array introducido.
  *
  * @param int x[] array del cual se sumarán los valores
  * @return int suma total de todos los valores que componen el array
  */
    int suma=0;
    for (int n=0; n<x.length; n++) {     
      suma=suma+x[n];
    }
    return suma;
  }


  //Funcion devolver media del Array//
  public static double mediaArrayInt (int x[]) {
  /*
  * Media de los valores de un array introducido.
  *
  * @param int x[] array del cual se realizará la media los valores
  * @return int media de los valores que componen el array
  */
    double suma=0;
    for (int n=0; n<x.length; n++) {     
      suma=suma+(double)x[n];
    }
    double media=suma/x.length;
    return media;
  }

  //Funcion devolver letra del DNI//
  public static String dimeNIF (int dni) {
    /*
    * Según el núnero del DNI que se introduce devuelve el NIF que le corresponde.
    *
    * @param int dni introducido para saber su NIF
    * @return letra string (NIF) que le corresponde al dni
    */
    int resto=dni%23;
    int t=22; 
    int[] num= new int[t]; //array con los números a los que equivale cada letra

    for (int i=0; i<t; i++) { 
      num[i]=i; 
    }
    //Se crea el array con las letras establecidas según cada número (la equivalencia está establecida por la posición)
    String[] letras={"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    String letra="";
    for (int i=0; i<t; i++) { 
      if (resto==num[i]) {
        letra=letras[i];
      } 
    }
    return letra;
  }
}
