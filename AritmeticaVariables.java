/*AritmeticaVariables.java
*Programa que muestra por pantalla la suma, resta, multiplicacion y division de las variables x e y.
*@Irene Martin
*/

public class AritmeticaVariables {
	public static void main (String [] args) {
		int x = 144;
		int y = 999;
		
		int suma= x + y;
		System.out.println (" Suma de " + x + " y " + y + ":");
		System.out.println (" Suma = " + suma + "\n");
		
		int resta= x - y;
		System.out.println (" Resta de " + x + " y " + y + ":");
		System.out.println (" Resta = " + resta + "\n");
		
		int mult= x * y;
		System.out.println (" Multiplicacion de " + x + " y " + y + ":");
		System.out.println (" Multiplicacion = " + mult + "\n");
		
		int div= y / x;
		System.out.println (" Division de " + y + " y " + x + ":");
		System.out.println (" Division = " + div + "\n");
		
		
	}
}
