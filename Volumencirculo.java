/*Volumencirculo.java
*Programa que calcula el volumen de una esfera con radio de 8.75cm.
*@Irene Martín
*/

public class Volumencirculo {
	public static void main (String [] args) {
	double radio;
	radio=8.75;
	double pi;
	pi=3.14;
	double area;
	double div;
	div= 4/3;
	double volumen;
	volumen=div*pi*(radio*radio*radio);
	System.out.println ("El volumen de una esfera de " + radio + " cm es de: " + volumen + " cm");
	} 
}
