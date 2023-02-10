package misFunciones;
public class Varias {
  //Función de multiplicación//
  public static double multiplica(double a, double b) {
  /*
  * Realiza la multiplicación de 2 números.
  *
  * @param a primer número double que se multiplica
  * @param b segundo número double que se multiplica
  * @return double resultado de la multiplicación
  */
    double resultado=a*b;
    return resultado;
  }
  //Función devolver mínimo//
  public static int minimo(int a, int b) {
  /*
  * Compara 2 números para saber cuál es el mínimo.
  *
  * @param a primer número entero que se compara
  * @param b segundo número entero que se compara
  * @return el número entero que es mínimo
  */
    if (a<b) {
      return a;
    } 
    return b;
  }

  //Función negativo, positivo o cero//
  public static int dimeSigno(int a) {
  /*
  * Función que dice si un número es negativo, positivo o cero.
  *
  * @param a número entero que se introduce
  * @return -1 si el número es negativo, un 1 si es positivo
  * y un 0 si el número es 0.
  */
    if (a<0) {
      return -1;
    } else if (a>0) {
      return 1;
    }
    return 0;
  }

  //Función del sumatorio de 1 a N//
  public static int suma1aN(int n) {
    /*
    * Según el número introducido realiza un sumatorio desde 1 hasta el número introducido.
    *
    * @param n número entero introducido para realizar el sumatorio
    * @return int sumatorio desde 1 hasta n
    */

      int sumatorio=0;
      for (int i=1; i<=n; i++) {
        sumatorio=sumatorio+i;
      }
      return sumatorio;
  }

  //Función del factorial de 1 a N//
  public static int producto1aN(int n) {
    /*
    * Según el número introducido devuelve el producto de enteros desde 1 hasta el número.
    *
    * @param n número entero introducido para realizar el factorial
    * @return int factorial desde 1 hasta n
    */
  
      int factorial=1;
      for (int i=1; i<=n; i++) {
        factorial=factorial*i;
      }
      if (n==0) {
        return 0;
      }
      return factorial;
  }

  //Función del factorial de 1 a N//
  public static double intermedio1aN(int n) {
    /*
    * Según el número introducido devuelve el valor intermedio entre 1 y ese número.
    *
    * @param n número entero introducido.
    * @return double número intermedio entre 1 y n.
    */
  
    double intermedio=(double)n/2;
    if (n==0) {
      return 0;
    }
    return intermedio;
  }

  //Función devolver máximo//
  public static int maximo(int a, int b) {
    /*
    * Compara 2 números para saber cuál es el mayor.
    *
    * @param a primer número entero que se compara
    * @param b segundo número entero que se compara
    * @return el número entero que es máximo
    */
    if (a>b) {
      return a;
    } 
    return b;
  }

  public static void TablaMultiplicar(int n)  {
    /*
     * Según un numero n devuelve su tabla de multiplicar
     * 
     * @param n int que se quiere multiplicar
     * @ void imprime la tabla del número
     */
    int multiplicacion=1;
      
    //Bucle para hacer cada multiplicacion//
    for (int i=1; i<=10; i++) { 
      multiplicacion=n*i;
        System.out.printf (" %-1s * %-2s = %-5s\n", n, i, multiplicacion);
      } 
    }

  //Funcion es Primo o no//
  public static boolean esPrimo (int p) {
    /*
     * Según un numero p devuelve si es primo o no
     * 
     * @param p int del que se quiere saber si es primo o no
     * @ boolean que nos dirá si el número p es primo (true) o no primo (false)
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

  //Funcion potencia// 
  public static int potencia (int base, int exponente) {
    /*
     * Según una base entera y un exponente entero devuelve la potencia resultante.
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
}
