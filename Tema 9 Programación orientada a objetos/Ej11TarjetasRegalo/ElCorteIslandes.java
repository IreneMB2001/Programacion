package Ej11TarjetasRegalo;
/* ElCorteIslandes.java
 * Implementación de la clase TarjetaRegalo
 * @Irene Martín
 */
public class ElCorteIslandes {
  public static void main(String[] args) {
    //Declaración de objetos//
    TarjetaRegalo t1 = new TarjetaRegalo(100);
    TarjetaRegalo t2 = new TarjetaRegalo(120);

    //Se imprimen las dos tarjetas disponibles//
    System.out.println(t1);
    System.out.println(t2);

    //Se disminuye el saldo de las tarjetas con el método gastar//
    t1.gastar(45.90);
    t2.gastar(5);
    t2.gastar(200);
    t1.gastar(3.55);

    //Se imprime el resultado//
    System.out.println(t1);
    System.out.println(t2);

    //Se fusionan las dos tarjetas en una nueva//
    TarjetaRegalo t3 = t1.fusionarCon(t2);

    //Se imprime el resultado//
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
  }  
}
