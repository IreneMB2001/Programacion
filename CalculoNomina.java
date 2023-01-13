/*CalculoNomina.java
*Programa que calcula la nomina desglosada de un empleado.
*@Irene Martin
*/
import java.util.Scanner;

public class CalculoNomina {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.println (" Introduzca el cargo del empleado: ");
    System.out.println (" 1 - Programador Junior");
    System.out.println (" 2 - Programador Senior");
    System.out.println (" 3 - Jefe de proyecto");
    System.out.print (" Cargo: ");
    int cargo= s.nextInt();
    System.out.print (" Cuantos dias ha estado de viaje visitando clientes?: ");
    int diasViaje= s.nextInt();
    System.out.print (" Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil= s.nextInt();
    
    //Sentencia condicional del sueldo base dependiendo del cargo//
    double sueldoBase= 0;
    
    switch (cargo) {
      case 1: //sueldo base del programador junior//
        sueldoBase= 950;
        break;
      case 2:
        sueldoBase= 1200;
        break;
      case 3:
        sueldoBase= 1600;
        break;
      default:
        sueldoBase= 0;
        System.out.println(" - El sueldo base es incorrecto");
   }
   
    //Sentencia condicional Estado Civil para el IRPF//
    double irpf= 0;
    switch (estadoCivil) {
      case 1: //Soltero//
        irpf= 0.25;
        break;
      case 2: //Casado//
        irpf= 0.20;
        break;
      default:
        irpf= 0;
        System.out.println(" - El estado civil es incorrecto");
    }
    
    //Calculo de dietas e IRPF//
    double sueldoDieta= diasViaje*30; //30 euros extras por dia de viaje//
    double sueldoBruto= sueldoBase+sueldoDieta; //sueldo sin impuestos//
    double cantidadIrpf= sueldoBruto*irpf; //cuanto es el IRPF//
    double sueldoNeto= sueldoBruto-cantidadIrpf; //Sueldo total del empleado//
    
    //Nomina desglosada//
    if ((sueldoBase==0) && (irpf==0)) {
      System.out.println(" - Error en el calculo de datos.");
    } else {
      System.out.println(" ");
      System.out.println("------------------------------------------------------");
      System.out.printf(" Sueldo Base:  %20.2f\n", sueldoBase);
      System.out.printf(" dietas: (%-3sdias)  %15.2f\n", diasViaje, sueldoDieta);
      System.out.println("------------------------------------------------------");
      System.out.printf(" Sueldo Bruto:  %19.2f\n", +sueldoBruto);
      System.out.printf(" Retencion IRPF: (%-5.2f)   %8.2f\n", irpf, cantidadIrpf);
      System.out.println("------------------------------------------------------");
      System.out.printf(" Sueldo Neto:  %20.2f\n", +sueldoNeto);
      System.out.println("------------------------------------------------------");
    }   
  }
}
