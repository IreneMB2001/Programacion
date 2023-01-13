/*LeeNumeros.java
*Lectura de datos desde teclado
*/

public class LeeNumeros {
	public static void main (String [] args) {
	
		String linea; //Declara una variable llamada linea de tipo String que se encargará de almacenar los datos leidos por la consola.//
		
		System.out.print (" Por favor, introduce un numero: "); //System.out.print no da el salto de linea al contrario que System.out.println//
		linea= System.console().readLine(); //le indica a la consola que lea el dato//
		int primerNumero; //Será la variable que almacene el primer numero leido por la consola.// 
		primerNumero = Integer.parseInt( linea ); //la variable primerNumero transforma la variable String en un Int//
		
		System.out.print (" Introduce otro, por favor: ");
		linea= System.console().readLine(); //le indica a la consola que lea el segundo dato//
		int segundoNumero; //Será la variable que almacene el segundo numero leido//
		segundoNumero = Integer.parseInt( linea );  //la variable segundoNumero transforma la variable String en un Int//
		
		int total; //Se declara la variable de la operacion como un int//
		total = (2* primerNumero) + segundoNumero; //la variable  almacena el calculo del doble del primer numero mas el segundo//
		
		System.out.print (" El primer numero introducido es: " +primerNumero); //Se imprime el valor de ambos numeros leidos//
		System.out.println (" y el segundo es: " +segundoNumero); //Al utilizar en la primera liea un System.out.print, esta segunda aparecerá en la misma linea//
		
		System.out.print (" El doble del primer numero mas el segundo es: ");
		System.out.print (total); //Se imprime el resultado de la operacion//
		
	}
}
	
