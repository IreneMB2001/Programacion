/*ej20_28ArrayFunciones.java
*Programa que almacena funciones matematicas implementando arrays
*@Irene Martin
*/
import java.util.Scanner;
public class ej20_28ArrayFunciones {
//////////////////////////////////////funciones////////////////////////////////////////////
  //Funcion generar Array aleatorio segun un tamanio, maximo y minimo aleatorio//
  public static int[] generaArrayInt(int t, int minimo, int maximo) {
    /*
    * Genera un Array segun un tamanio (t) ademas de un maximo y un minimo para establecer los valores aleatorios.
    *
    * @param t int que sera el tamanio del array que se genere
    * @param minimo int numero minimo que pueden tener los valores del array
    * @param maximo int numero maximo que pueden tener los valores del array
    * @return int[] array num de tamanio t formado por numeros aleatorios entre minimo y maximo
    */
    int[] num= new int[t];

    for (int i=0; i<t; i++) { 
      num[i]=(int)(Math.random()*(maximo+1-minimo) +minimo); //El rango de aleatorios es la diferencia entre el maximo(+1 para que se incluya)
    }                                                       //y el minimo. Ademas los numeros aleatorios empezaran por el minimo(+minimo)
    return num;
  }

  //Funcion devolver el minimo del Array//
  public static int minimoArrayInt (int x[]) {
    /*
    * Devuelve el valor minimo de un array establecido.
    *
    * @param int x[] array del que se quiere saber el valor minimo
    * @return int minimo averiguado del array
    */
    int minimo=Integer.MAX_VALUE; 
    for (int n=0; n<x.length; n++) {     

      if(x[n]<minimo) {
        minimo=x[n];
      }
    }
    return minimo;
  }

  //Funcion devolver el maximo del Array//
  public static int maximoArrayInt (int x[]) {
    /*
    * Devuelve el valor maximo de un array establecido.
    *
    * @param int x[] array del que se quiere saber el valor maximo
    * @return int maximo averiguado del array
    */
    int maximo=Integer.MIN_VALUE; 
    for (int n=0; n<x.length; n++) {     

      if(x[n]>maximo) {
        maximo=x[n];
      }
    }
    return maximo;
  }

  //Funcion devolver media del Array//
  public static double mediaArrayInt (int x[]) {
    /*
    * Devuelve la media de los valores de un array establecido.
    *
    * @param int x[] array del que se quiere saber la media
    * @return double media generada de los valores del array
    */
    double suma=0;
    for (int n=0; n<x.length; n++) {     
      suma=suma+(double)x[n];
    }
    double media=suma/x.length;
    return media;
  }

  //Funcion para saber si un numero esta o no dentro del Array//
  public static boolean estaEnArrayInt (int num, int x[]) {
    /*
    * Devuelve true si el numero introducido esta en el array establecido y false si no.
    * 
    * @param int num es el numero que se quiere comprobar
    * @param int x[] array que se quiere recorrer para saber si el numero esta o no
    * @return boolean true(esta) o false(no esta)
    */
    for (int n=0; n<x.length; n++) { 
      if(num==x[n]) {
        return true;
      }
    }
    return false;
  }

  //Funcion para saber la posicion en la que se encuentra un numero del Array//
  public static String posicionEnArray (int num, int x[]) {
    /*
    * Devuelve la posicion o las posiciones en las que se encuentra un numero de un array establecido.
    * 
    * @param int num es el numero del que se quiere saber la posicion
    * @param int x[] array que se quiere recorrer para saber la posicion del numero
    * @return String con la serie de posiciones que tiene el numero
    */
    String posiciones= "";
    int n=0;
    while(n<x.length) { 
      if(num==x[n]) {
        posiciones=posiciones+n+" ";
      }
      n++;
    }
    return posiciones;
  }

  //Funcion voltear el Array//
  public static int [] volteaArrayInt (int x[]) {
    /*
    * De un array original establecido devuelve otro array pero volteado.
    * 
    * @param int x[] array que se quiere voltear
    * @return int [] array volteado
    */
    int[] volteado= new int[x.length]; //longitud del array original//
    int i=(x.length-1);
    for (int n=0; n<x.length; n++) { 
      volteado[i]=x[n]; //la posicion primera del array original pasara a ser la ultima del nuevo array
      i--;
    }
    return volteado;
  }

  //Funcion rota array n posiciones a la derecha//
  public static int [] rotaDerechaArrayInt(int x[], int n) {
    /*
    * De un array original establecido devuelve otro array pero con n posiciones rotado a la derecha.
    * 
    * @param int x[] array que se quiere rotar a la derecha
    * @param int n numero de posiciones que se quiere rotar
    * @return int [] array rotado
    */
    int[] rotado=new int[x.length];

    //Metemos en el nuevo array los valores del primero//
    for (int i=0; i<x.length; i++) {
      rotado[i]=x[i];
    }
    while (n>0) { //El bucle se mantendrá hasta que se agoten las posiciones
      int nuevo = rotado[rotado.length-1]; //La ultima posicion original se almacena en una variable//
      for (int i=(rotado.length-1); i>0; i--) { //Como la ultima posicion ocupara la primera, los valores seran el de la posicion anterior//
        rotado[i]= rotado[i-1];
      }
      rotado[0]= nuevo; //La ultima posicion original pasa a ser la posicion 0//
      n--;
    }
    return rotado;
  }

  //Funcion rota array n posiciones a la izquierda//
  public static int [] rotaIzquierdaArrayInt(int x[], int n) {
    /*
    * De un array original establecido devuelve otro array pero con n posiciones rotado a la izquierda.
    * 
    * @param int x[] array que se quiere rotar a la izquierda
    * @param int n numero de posiciones que se quiere rotar
    * @return int [] array rotado
    */
    int[] rotado=new int[x.length];

    //Metemos en el nuevo array los valores del primero//
    for (int i=0; i<x.length; i++) {
      rotado[i]=x[i];
    }
    while (n>0) { //El bucle se mantendrá hasta que se agoten las posiciones
      int nuevo = rotado[0]; //Es como rotar a la derecha pero esta vez se suma y se empieza por el principio
      for (int i=0; i<(rotado.length-1); i++) { 
        rotado[i]= rotado[i+1];
      }
      rotado[rotado.length-1]= nuevo; 
      n--;
    }
    return rotado;
  }

//////////////////////////////////////main//////////////////////////////////////////////
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println ();
    
    System.out.print (" Introduzca el tamanio de su array: ");
    int t=s.nextInt();
    System.out.println (" Ahora introduzca un maximo y un minimo para establecer los valores:");
    System.out.print (" Maximo --> ");
    int maxValor=s.nextInt();
    System.out.print (" Minimo --> ");
    int minValor=s.nextInt();
    int[] array=generaArrayInt(t, minValor, maxValor);
    for (int i=0; i<t; i++) { 
      System.out.print(" "+array[i]+ " |");
    }
    System.out.println("\n");
    System.out.println(" Cual es el minimo del array generado? --> " +minimoArrayInt(array));
    System.out.println(" Cual es el maximo del array generado? --> " +maximoArrayInt(array));
    System.out.printf("%-3s %3.2f ", " Cual es la media del array generado?  -->" , mediaArrayInt(array));
    System.out.println("\n");
    System.out.print(" Introduce un numero para comprobar si esta o no dentro del array: ");
    int num=s.nextInt();
    System.out.print(" Esta el numero " +num+ " dentro del Array? -->" );
    if (estaEnArrayInt(num, array)) {
      System.out.println (" Si\n");
    } else {
      System.out.println (" No\n");
    }
    System.out.print(" Introduce uno de los numeros del Array para saber su posicion/es: ");
    num=s.nextInt();
    System.out.print(" El numero " +num+ " se encuentra en la posicion/es --> " +posicionEnArray(num, array));
    System.out.println("\n");
    System.out.println(" Si volteamos el array quedaria de la siguiente manera: ");
    int[] volteado=volteaArrayInt(array);
    for (int i=0; i<t; i++) { 
      System.out.print(" "+volteado[i]+ " |");
    }
    System.out.println("\n");
    System.out.print(" Cuantas posiciones quieres mover el Array a la derecha? --> ");
    int posiciones=s.nextInt();
    int[] rotadoDerecha=rotaDerechaArrayInt(array, posiciones);
    for (int i=0; i<t; i++) { 
      System.out.print(" "+rotadoDerecha[i]+ " |");
    }
    System.out.println();
    System.out.print(" Cuantas posiciones quieres mover el Array a la izquierda? --> ");
    int posiciones2=s.nextInt();
    int[] rotadoIzquierda=rotaIzquierdaArrayInt(array, posiciones2);
    for (int i=0; i<t; i++) { 
      System.out.print(" "+rotadoIzquierda[i]+ " |");
    }
  }
}


  
