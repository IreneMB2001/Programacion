/*SalarioSemanalCondicion.java
*Programa que calcula el salario semanal de un empleado en base a las horas trabajadas pero con la condicion if segun cuantas horas son.
*@Irene Martin
*/

import java.util.Scanner; //declaramos el Scanner//

public class SalarioSemanalCondicion { 
  public static void main (String [] args) {
    Scanner s = new Scanner(System.in); //creamos el objeto Scanner, llamado s.//
    
    System.out.println (" ");//Imprime un hueco en blanco para que no quede el texto quede mas separado//
    
    System.out.println (" Calculo de tu salario semanal:\n");
    System.out.print (" Dime cuantas horas trabajas al dia por favor: ");
    double horas = s.nextDouble(); //variable double que almacena las horas leidas//
    
 
    double horasSemanales = horas * 5; //variable double que calcula  las horas semanales (5 dias, sin contar sabado y domingo)//
    System.out.println (" Tus horas semanales son: " + horasSemanales + " horas.");
    //Se imprime en pantalla el resultado de las horas semanales//
    
    if (horasSemanales<=40) {
      double salarioSemanal = horasSemanales * 12; //Las primeras 40 horas se pagan a 12 euros la hora//
      System.out.println (" Tu salario semanal es de: " + salarioSemanal + " euros.");
    } else {
      double salarioSemanal = horasSemanales * 16; //A partir de 41 horas se pagan a 16 euros la hora//
      System.out.println (" Tu salario semanal es de: " + salarioSemanal + " euros.");
    }		
  }
}
