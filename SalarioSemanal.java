/*SalarioSemanal.java
*Programa que calcula el salario semanal de un empleado en base a las horas trabajadas (12 euros la hora) leidas por teclado.
*@Irene Martin
*/

import java.util.Scanner; //declaramos el Scanner//

public class SalarioSemanal { 
  public static void main (String [] args) {
    Scanner s = new Scanner(System.in); //creamos el objeto Scanner y quedará abreviado con una s.//
    
    System.out.print ("\n"); //Salto de linea para que el texto no quede pegado hacia arriba de la ventana.//
    
    System.out.println (" Calculo de tu salario semanal:\n");
    System.out.print (" Dime cuantas horas trabajas al dia por favor: ");
    double horas = s.nextDouble(); //variable double que almacena las horas leidas//
    
 
    double horasSemanales = horas * 5; //variable double que calcula  las horas semanales (5 dias, sin contar sabado y domingo)//
    System.out.println (" Tus horas semanales son: " + horasSemanales + " horas.");
    //Se imprime en pantalla el resultado de las horas semanales//
    
    double salarioSemanal = horasSemanales * 12; //variable double que calcula el salario semanal (12 euros la hora)//
    System.out.println (" Como el salario se calcula a 12 euros la hora, tu salario es de: " + salarioSemanal + " euros.");
    //Se imprime en pantalla el resultado del salario semanal//
		
	}
}
