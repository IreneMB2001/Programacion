/*Areacirculo.java
*Programa que calcula el area de una circunferencia con radio de 7,125.
*@Irene Martín
*/

public class Areacirculo {
	public static void main (String [] args) {
	double radio;
	radio=7.125;
	double pi;
	pi=3.14;
	double area;
	area=pi*(radio*radio);
	System.out.println ("El area de una circunferencia de " + radio + " cm es de: " + area + " cm");
	} 
}
