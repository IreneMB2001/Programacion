/*MultiplicaNumerosLeidos.java
*Programa que pide dos numeros y muestra en pantalla el resultado de su multiplicacion.
*@Irene Martin
*/

public class MultiplicaNumerosLeidos {
	public static void main (String [] args) {
		String linea;
		
		System.out.print (" Dame un numero, por favor: ");
		linea = System.console().readLine();
		int primerNumero;
		primerNumero = Integer.parseInt( linea );
		
		
		System.out.print (" Introduce otro numero por favor: ");
		linea = System.console().readLine();
		int segundoNumero;
		segundoNumero = Integer.parseInt( linea );
		
		int mult;
		mult= primerNumero * segundoNumero;
		
		System.out.print (" El primer numero introducido es: " +primerNumero);
		System.out.println (", y el segundo numero es: " +segundoNumero);
		System.out.print (" La multiplicacion de ambos numeros es: " +mult);
		
	}
}
		

		
		
