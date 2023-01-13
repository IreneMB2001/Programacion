/*NacimientoCorrespondeHoroscopo.java
*Programa que te pregunta tu dia y mes de nacimiento y te dice cual es tu horoscopo.
*@Irene Martin
*/
import java.util.Scanner;

public class NacimientoCorrespondeHoroscopo {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.println (" Dame tu dia y mes de nacimiento, te dire cual es tu horoscopo: ");
    
    System.out.print (" Dia: ");
    int dia= s.nextInt();
    System.out.print (" Mes: ");
    int mes= s.nextInt();
    
    String nombreMes;
    
    //Sentencia condicional//
    switch (mes) {
      case 1:
        nombreMes= "Enero";
        if (dia>=1 && dia<=19) {
          System.out.println (" Tu horoscopo es : capricornio");
        } else if (dia>=20 && dia<=31) {
          System.out.println (" Tu horoscopo es : Acuario");
        }
        break;
      case 2:
        nombreMes= "Febrero";
        if (dia>=1 && dia<=18) {
          System.out.println (" Tu horoscopo es : Acuario");
        } else if (dia>=19 && dia<=28) {
          System.out.println (" Tu horoscopo es : Piscis");
        }
        break;
      case 3:
        nombreMes= "Marzo";
        if (dia>=1 && dia<=20) {
          System.out.println (" Tu horoscopo es : Piscis");
        } else if (dia>=21 && dia<=31) {
          System.out.println (" Tu horoscopo es : Aries");
        }
        break;
      case 4:
        nombreMes= "Abril";
        if (dia>=1 && dia<=19) {
          System.out.println (" Tu horoscopo es : Aries");
        } else if (dia>=20 && dia<=30) {
          System.out.println (" Tu horoscopo es : Tauro");
        }
        break;
      case 5:
        nombreMes= "Mayo";
        if (dia>=1 && dia<=20) {
          System.out.println (" Tu horoscopo es : Tauro");
        } else if (dia>=21 && dia<=31) {
          System.out.println (" Tu horoscopo es : Geminis");
        }
        break;
      case 6:
        nombreMes= "Junio";
        if (dia>=1 && dia<=20) {
          System.out.println (" Tu horoscopo es : Geminis");
        } else if (dia>=21 && dia<=30) {
          System.out.println (" Tu horoscopo es : Cancer");
        }
        break;
      case 7:
        nombreMes= "Julio";
        if (dia>=1 && dia<=22) {
          System.out.println (" Tu horoscopo es : Cancer");
        } else if (dia>=22 && dia<=31) {
          System.out.println (" Tu horoscopo es : Leo");
        }
        break;
      case 8:
        nombreMes= "Agosto";
        if (dia>=1 && dia<=22) {
          System.out.println (" Tu horoscopo es : Leo");
        } else if (dia>=23 && dia<=31) {
          System.out.println (" Tu horoscopo es : Virgo");
        }
        break;
      case 9:
        nombreMes= "Septiembre";
        if (dia>=1 && dia<=22) {
          System.out.println (" Tu horoscopo es : Virgo");
        } else if (dia>=23 && dia<=30) {
          System.out.println (" Tu horoscopo es : Libra");
        }
        break;
      case 10:
        nombreMes= "Octubre";
        if (dia>=1 && dia<=22) {
          System.out.println (" Tu horoscopo es : Libra");
        } else if (dia>=23 && dia<=31) {
          System.out.println (" Tu horoscopo es : Escorpio");
        }
        break;
      case 11:
        nombreMes= "Noviembre";
        if (dia>=1 && dia<=21) {
          System.out.println (" Tu horoscopo es : Escorpio");
        } else if (dia>=22 && dia<=30) {
          System.out.println (" Tu horoscopo es : Sagitario");
        }
        break;
      case 12:
        nombreMes= "Diciembre";
        if (dia>=1 && dia<=21) {
          System.out.println (" Tu horoscopo es : Sagitario");
        } else if (dia>=22 && dia<=31) {
          System.out.println (" Tu horoscopo es : Capricornio");
        }
        break;
      default:
        nombreMes= "Error";
        System.out.println (" "+ nombreMes + " : Esta fecha no es valida");
    }
  }
}
