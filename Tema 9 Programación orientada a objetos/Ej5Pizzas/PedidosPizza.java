package Ej5Pizzas;
/* PedidosPizza.java
 * Prueba de la clase creada "Pizza" para el control de pizzas servidas y pedidas
 * @Irene Martín
 */
public class PedidosPizza {
  public static void main(String[] args) {
    //Declaración de objetos//
    Pizza p1 = new Pizza("margarita", "mediana");
    Pizza p2 = new Pizza("funghi", "familiar");
    p2.sirve();  
    Pizza p3 = new Pizza("cuatro quesos", "mediana");
    System.out.println();
    System.out.println("PEDIDOS PIZZAS");
    System.out.println("---------------------------------------");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println("---------------------------------------\n");
    System.out.println("Sirviendo la pizza 2...");
    p2.sirve(); //como la pizza p2 ya ha sido servida anteriormente, tendrá que salirnos un mensaje de "ya servida"
    System.out.println();
    System.out.println("RECUENTO PIZZAS");
    System.out.println("-----------------------");
    System.out.println("pedidas: " + Pizza.getTotalPedidas());
    System.out.println("servidas: " + Pizza.getTotalServidas());
    System.out.println("-----------------------");
  }
}

