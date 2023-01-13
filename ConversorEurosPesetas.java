/*ConversorEurosPesetas.java
*Programa que muestra en pantalla un conversor de euros a pesetas, almacenando la cantidad de pesetas en una variable.
*@Irene Martin
*/

public class ConversorEurosPesetas {
	public static void main (String [] args) {
		int pesetas= 3328;
		System.out.println (" Tenemos " +pesetas+ " pesetas");
		
		double euros = 0.0060;
		System.out.println (" 1 peseta equivale a " +euros+ " euros");
		
		double conversion= (double) pesetas * (double) euros;
		
		System.out.println (" Las " +pesetas+ " pesetas equivalen a " +conversion+ " euros");
		
		
	}
}
