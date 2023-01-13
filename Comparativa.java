/*Comparativa.java
*Programa que calcula la suma del año de nacimiento de dos compañeros, si es mayor, menor, igual o diferente.
*Además también indica cual de las iniciales de ambos nombres es mayor
*En este caso el programa calcula mis datos y los de Cristina Delgado.
*@Irene Martín
*/

public class Comparativa {
	public static void main (String [] args) {
	int yearI;
	yearI=2001;
	int yearC;
	yearC=1999;
	int Suma;
	Suma=yearI + yearC;
	char inicialC;
	char inicialI;
	inicialC= 'C';
	inicialI= 'I';
	
	System.out.println ("La suma de los anios de Irene y Cristina es: " + Suma);
	System.out.println ("Cristina es mayor que Irene porque: " + yearC + "<" + yearI + "= " + (yearC < yearI));
	System.out.println ("Los anios de Cristina e Irene son diferentes porque: " + yearC + "!=" + yearI + "= " + (yearC != yearI));
	System.out.println ("La inicial de Cristina es menor que la de Irene porque: " + inicialC + "<" + inicialI + "= " + (inicialC<inicialI));
	} 
}
