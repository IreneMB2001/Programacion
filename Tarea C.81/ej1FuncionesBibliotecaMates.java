/*ej1FuncionesBibliotecaMates.java
*Programa que almacena funciones matematicas
*@Irene Martin
*/
import java.util.Scanner;
public class ej1FuncionesBibliotecaMates {
//////////////////////////////////////funciones////////////////////////////////////////////
  //Funcion voltear numero//
  public static int voltea (int i) {
    /*
    * Segun un numero entero i la funcion devuelve el numero pero volteado.
    * 
    * @param int i numero que se quiere voltear
    * @return int [] numero volteado
    */
    //Declaracion de variables//
    int cifra=0;
    String volteadoS="";

    //Bucle para poner el numero al reves//
    while (i>0) {
      cifra=i%10;
      volteadoS= volteadoS+cifra; 
      i=i/10;
    }
    int volteado= Integer.parseInt(volteadoS);
    return volteado;
  }

  //Funcion es capicua o no//
  public static boolean capicua (int i) {
    /*
    * Comprueba si un numero establecido es capicua o no.
    * 
    * @param int i numero que se quiere comprobar
    * @return boolean (true) si es capicua y (false) si no lo es
    */
    int v = voltea(i);
    if (v==i) {
      return true;
    } 
    return false;
  }

  //Funcion es Primo o no//
  public static boolean esPrimo (int p) {
    /*
    * Comprueba si un numero establecido es primo o no.
    * 
    * @param int i numero que se quiere comprobar
    * @return boolean (true) si es primo y (false) si no lo es
    */
    int contador=0; 
    for (int i=1; i<=p; i++) { //El bucle termina cuando el incremento llega al valor del numero//
      int resto=p%i; //Se hace el resto del numero con el numero incrementado//
      if (resto==0) {
        contador++;
      }
    }
    if (contador==2) { //Un numero primo solo es divisible entre si mismo y 1 (El resto es 0 solo 2 veces)//
      return true;
    } 
    return false;
  }

  //Funcion siguiente Primo//
  public static int siguientePrimo (int p) {
    /*
    * Segun un numero establecido se busca el siguiente numero que seria primo
    * 
    * @param int p numero que se pasa como parametro para averiguar el siguiente primo
    * @return int p siguiente primo
    */
    while (!esPrimo(++p)) {}; //mientras que no sea primo se incrementa el numero hasta que lo sea

    return p;
  }

  //Funcion numero de digitos// 
  public static int digitos (int i) {
    /*
    * Segun un numero establecido se cuenta el numero de digitos que tiene
    * 
    * @param int i numero del que se quiere saber la cantidad de digitos
    * @return int contador de digitos del numero
    */
    int contador=0;
    while (i!=0) { //hay que hacer un bucle para que cuando el numero se divida entre 10 tiene que llegar a 0 para pararse//
      i=i/10; //El numero de cifras equivale al numero de veces que el numero se divide entre 10.//
      contador++; //cada vez que el numero se divida entre 10 el contador suma 1 para averiguar el numero de digitos.//
    }
    return contador;
  }

  //Funcion devolver posicion n// 
  public static int digitoN (int i, int n) {
    /*
    * Segun un numero establecido y una posicion n se averigua cual es el digito que pertenece a dicha posicion
    * 
    * @param int i numero que se quiere recorrer hasta dar con el digito deseado
    * @return int digito al que le corresponde la posicion establecida
    */
    for (int c=digitos(i); c>n; c--) {
      i = i/10;
    }
    return (int)i%10;
  }

  //Funcion potencia// 
  public static int potencia (int base, int exponente) {
    /*
    * Segun una base y un exponente se calcula la potencia resultante
    * 
    * @param base int que se quiere elevar.
    * @param exponente int para saber a cuanto elevar la base.
    * @return int elevado con la potencia resultante.
    */
    int elevado=1;
    for (int i=1; i<=exponente; i++) {
      elevado= elevado*base;
    }
    return elevado;
  }

  //Funcion quita n digitos por detras// 
  public static int quitaPorDetras (int i, int n) {
    /*
    * Devuelve un numero establecido pero con n digitos quitados por detras
    * 
    * @param int i numero que se quiere modificar
    * @param int n numero de digitos que se quieren quitar por detras
    * @return int con el numero modificado
    */
    return i/(int)potencia(10,n); //el 10 se eleva al numero de digitos que se quieren quitar
  }

  //Funcion quita n digitos por delante//
  public static long quitaPorDelante(int i, int n) {
    /*
    * Devuelve un numero establecido pero con n digitos quitados por delante
    * 
    * @param int i numero que se quiere modificar
    * @param int n numero de digitos que se quieren quitar por delante
    * @return int con el numero modificado
    */
    i = voltea(quitaPorDetras(voltea(i), n)); //voltea el numero original y quita los digitos y despues lo vuelve a voltear
    return i;
  }
//////////////////////////////////////main//////////////////////////////////////////////
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println ();
    
    System.out.print (" Por favor, introduzca un numero: ");
    int num=s.nextInt();
    System.out.println (" El numero al reves es: " +voltea(num));
    
    System.out.println(" Numero de digitos --> " +digitos(num));
    System.out.println();

    System.out.print(" Es el numero introducido capicua? -->");
    if (capicua(num)) {
      System.out.println (" Si");
    } else {
      System.out.println (" No");
    } 

    System.out.print(" Es el numero introducido primo? -->");
    if (esPrimo(num)) {
      System.out.println (" Si");
    } else {
      System.out.println (" No");
    }
    System.out.println(" Cual seria el siguiente numero primo? --> " +siguientePrimo(num));

    System.out.print (" Introduce un exponente para hacer la potencia del numero: ");
    int exponente=s.nextInt();
    while (exponente<0) {
      System.out.print(" El exponente no puede ser negativo, escriba un numero positivo: ");
      exponente=s.nextInt();
    }
    System.out.println (" "+num+ "^" +exponente+ " = " +potencia(num, exponente)); 
 
    System.out.print (" Ahora introduce la posicion del digito que quieres obtener: ");
    int n=s.nextInt();
    System.out.println (" El digito de la posicion " +n+ " es: " +digitoN(num, n));

    System.out.print (" Cuantos digitos quieres quitarle al numero por detras? --> ");
    int quitarDetras=s.nextInt();
    System.out.println (" Numero - " +quitarDetras+ " digitos por detras = " +quitaPorDetras(num, quitarDetras));

    System.out.print (" Cuantos digitos quieres quitarle al numero por delante? --> ");
    int quitarDelante=s.nextInt();
    System.out.println (" Numero - " +quitarDelante+ " digitos por delante= " +quitaPorDelante(num, quitarDelante));
  }
}


