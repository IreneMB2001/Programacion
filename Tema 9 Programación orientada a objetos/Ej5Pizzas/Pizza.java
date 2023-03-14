package Ej5Pizzas;
/* Pizza.java
 * Creación de la clase Pizza con sus atributos y métodos necesarios para la gestión de pedidos de pizzas
 * Se necesita saber el tamaño: mediana o familiar
 * También el tipo: margarita, cuatro quesos o funghi; y su estado: pedida o servida
 * Se debe almacenar información sobre el número total de pizzas pedidas y servidas
 * Cuando se crea una nueva pizza su estado por defecto es "pedida"
 * @Irene Martín
 */
public class Pizza {
  //Atributos de la clase//
  private static int totalPedidas = 0; //contador de pizzas pedidas
  private static int totalServidas = 0; //contador de pizzas servidas

  //Atributos de instancia//
  private String tamaño;
  private String estado;
  private String tipo;

  public Pizza(String tipo, String tamaño) {
    this.tamaño = tamaño;
    this.estado = "pedida"; //La pizza tendrá por defecto el estado de "pedida"
    this.tipo = tipo;
    Pizza.totalPedidas++; //cada vez que se añada una nueva pizza se incrementará el contador
  }

  //Métodos//
  public String toString() {
  /* Con el método toString podemos establecer qué y cómo queremos que se muestre el objeto cuando le hagamos un print
   * @param return tipo de pizza(this.tipo), tamaño de la pizza(this.tamaño) y estado de la pizza(this.estado)
   */
    return "pizza " +this.tipo+ " " +this.tamaño+ " --> " +this.estado;
  }
  public static int getTotalPedidas() {
  /*Método que devuelve el valor del contador de total de pizzas pedidas
   * @param return atributo de clase Pizza.totalPedidas
   */
    return Pizza.totalPedidas;
  }

  public void sirve() {
    /* Método para servir las pizzas: cambia el estado de "pedida" a "servida"
     * @param void
     */
    if (this.estado.equals("pedida")) { //tiene que tener el estado de pedida, sino significa que ha sido servida
      this.estado = "servida"; //cambiamos el estado de la pizza de "pedida" a "servida"
      Pizza.totalServidas++; //cada vez que se sirva una pizza se incrementará el contador
    } else {
      System.out.println("Esa pizza ya se ha servido");
    }
  }
  public static int getTotalServidas() {
  /* Método que devuelve el valor del contador de total de pizzas servidas
   * @param return atributo de clase Pizza.totalPedidas
   */
    return Pizza.totalServidas; 
  }

}
