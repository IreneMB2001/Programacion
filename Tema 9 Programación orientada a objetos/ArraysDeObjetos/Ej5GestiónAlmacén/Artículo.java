package ArraysDeObjetos.Ej5GestiónAlmacén;
/* Artículo.java
 * Clase Artículo para la gestión y control de artículos de un almacén
 * De cada artículo se debe saber el código, la descripción, el precio de compra, el precio de venta y el stock
 * La entrada y salida de mercancía supone respectivamente el incremento y decremento de stock 
 * Hay que controlar que no se pueda sacar más mercancía de la que hay en el almacén
 * @Author Irene
 */
public class Artículo {
  //Atributos de instancia//
  private int codArtículo;
  private String descripción;
  private double precioCompra;
  private double precioVenta;
  private int stockUnidades;

  //Constructor//
  public Artículo(int codArtículo, String descripción, double precioCompra, double precioVenta, int stock ){
    this.codArtículo=codArtículo;
    this.descripción=descripción;
    this.precioCompra=precioCompra;
    this.precioVenta=precioVenta;
    this.stockUnidades=stock;
  }

  //Métodos//
  public void salidaUnidades(int número){
    /* El método salidaUnidades decrementa el número de stock de un determinado artículo
     * @ param int número de artículos que se desean sacar
     */
    if(stockUnidades>=número){
      System.out.println("Acaban de salir " +número+ " unidades del artículo " +this.codArtículo+ " del almacén");
      this.stockUnidades= this.stockUnidades-número;
    } else if (stockUnidades==0){
      System.out.println("El stock de este producto ya ha sido agotado");
    } else {
      System.out.println("El stock es insuficiente para realizar la salida. El artículo "
      +this.codArtículo+ " sólo tiene " +this.stockUnidades+ " unidades.");
    }
  }

  public int getCodArticulo(){
    return this.codArtículo;
  }

  public void bajaArtículo(){
    /* El método bajaArtículo elimina el artículo del array estableciendo todos sus datos a 0 o vacíos
     * @ param void
     */
    this.codArtículo=0;
    this.descripción="";
    this.precioCompra=0;
    this.precioVenta=0;
    this.stockUnidades=0;
  }

  public void entradaUnidades(int número){
    /* El método entradaUnidades incementa el número de stock de un determinado artículo
     * @ param int número de artículos que se desean añadir
     */
    System.out.println("Acaban de entrar " +número+ " unidades del artículo " +this.codArtículo+ "del almacén");
    this.stockUnidades= this.stockUnidades+número;
  }
  public void modificarCódigo(int nuevoCódigo){
    this.codArtículo=nuevoCódigo;
  }
  public void modificarDescripción(String nuevaDescripción){
    this.descripción=nuevaDescripción;
  }
  public void modificarPrecioCompra(double nuevoPrecioC){
    this.precioCompra=nuevoPrecioC;
  }
  public void modificarPrecioVenta(double nuevoPrecioV){
    this.precioVenta=nuevoPrecioV;
  }
  public String toString() {
    return "Articulo nº " + codArtículo + " --> " +descripción+ " ; PC --> " +precioCompra+ " euros ; PV --> " +precioVenta+ " euros ; Stock --> " +stockUnidades+ " unidades";
  }
}
