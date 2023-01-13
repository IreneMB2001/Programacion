/*AritmeticaNumerosLeidos.java
*Programa que muestra en pantalla la resta, suma, multiplicacion y division de dos numeros introducidos por teclado.
*@Irene Martin
*/

public class ArtimeticaNumerosLeidos {
  public static void main (String [] args) {
    String linea;
    System.out.print (" Vamos a calcular algunas operaciones, para ello dame un numero: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
		
    System.out.print (" Ahora dame otro numero por favor: ");
    linea= System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
		
    System.out.print ("\n");
		
    int suma;
    suma= primerNumero + segundoNumero;
    System.out.println (" La suma de los dos numeros es: " +suma);
		
    int resta;
    resta= primerNumero - segundoNumero;
    System.out.println (" La resta de los dos numeros es: " +resta);
		
    int multiplicacion;
    multiplicacion= primerNumero * segundoNumero;
    System.out.println (" La multiplicacion de los dos numeros es: " +multiplicacion);
		
    double division; //Double division para que en el caso del primer numero ser menor que el segundo me divida con decimales.//
    division= (double)primerNumero/(double)segundoNumero;
    System.out.println (" La division de los dos numeros es: " +division); 
	
	}
}
