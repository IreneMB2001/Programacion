package ArraysDeObjetos.TareaC9_3.Ej3Mascotas;



public class Perro extends Mascota{
  //Atributos de la clase//
  private static int numPerros = 0;

  //Atributos de instancia//
  private String raza;
  private boolean pulgas;

  //Constructor//
  public Perro(int código, String nombre, int edad, String fechaNacimiento, String sexo, String raza, boolean pulgas){
    super(código, nombre, edad, fechaNacimiento, sexo);
    this.raza=raza;
    this.pulgas=pulgas;
    this.setTipo("Perro");
    numPerros++;
  }

  //Métodos//
  @Override
  public void muestra(){
    super.muestra();
    System.out.println("|         raza          | " + this.raza);
    System.out.println("|-----------------------|-----------------------");
    System.out.println("|     ¿Tiene Pulgas?    | " + this.pulgas);
    System.out.println("|-----------------------|-----------------------");


  }
  @Override
  public void habla(){
    System.out.println("Soy un perro y hago guau guau   (/(* T *)\\)");
  }

  @Override
  public void bajaMascota(){
    /* El método bajaArtículo elimina el artículo del array estableciendo todos sus datos a 0 o vacíos
     * @ param void
     */
    super.bajaMascota();
    this.raza="";
    this.pulgas=false;
  }

  //Getters//
  public String getRaza(){
    return this.raza;
  }
  public boolean getPulgas(){
    return this.pulgas;
  }
  public static int getNumPerros(){
    return Perro.numPerros;
  }

  //setters//
  public void setRaza(String raza){
    this.raza=raza;
  }
  public void setPulgas(boolean pulgas){
    this.pulgas=pulgas;
  }
    
}
