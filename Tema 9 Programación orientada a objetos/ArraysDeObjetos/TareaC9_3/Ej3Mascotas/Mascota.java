package ArraysDeObjetos.TareaC9_3.Ej3Mascotas;



import ArraysDeObjetos.Ej1y2Gatos.Sexo;
public abstract class Mascota {
  //Atributos de la clase//
  private static int numMascotas = 0;

  //Atributos de instancia//
  private int código;
  private String nombre;
  private String tipo;
  private int edad;
  private String estado;
  private String fechaNacimiento;
  private Sexo sexo;

  //Constructor//
  public Mascota(int código, String nombre, int edad, String fechaNacimiento, String sexo){
    this.código=código;
    this.nombre=nombre;
    this.edad=edad;
    this.estado="vivo";
    this.fechaNacimiento=fechaNacimiento;
    this.sexo=setSexo(sexo);
    if (this.código!=0){
      numMascotas++;
    }
  }

  //Métodos//
  public void muestra(){
    System.out.println("------------------------------------------------");
    System.out.println(" INFORMACIÓN SOBRE LA MASCOTA");
    System.out.println("------------------------------------------------");
    System.out.println("|        Código         | " + this.código);
    System.out.println("|-----------------------|-----------------------");
    System.out.println("|        Nombre         | " + this.nombre);
    System.out.println("|-----------------------|-----------------------");
    System.out.println("|         tipo          | " + this.tipo);
    System.out.println("|-----------------------|-----------------------");
    System.out.println("|         edad          | " + this.edad);
    System.out.println("|-----------------------|-----------------------");
    System.out.println("|        estado         | " + this.estado);
    System.out.println("|-----------------------|-----------------------");
    System.out.println("|  fecha de nacimiento  | " + this.fechaNacimiento);
    System.out.println("|-----------------------|-----------------------");
    System.out.println("|         sexo          | " + this.sexo);
    System.out.println("|-----------------------|-----------------------");

  }

  public void cumpleaños(){
    this.edad++;
    System.out.println("Felicidades para " +this.nombre+ "!! Acaba de cumplir " +edad+ " añitos");
    System.out.println("                    O  O  O  ´     ");
    System.out.println("               *   _|__|__|_    ´    ");
    System.out.println("             `   _|*~*~*~*~*|_       ");
    System.out.println("         ´      |*~*~*~*~*~*~*|  *  ` ");
    System.out.println("           *   _|_____________|_`   * ");
  }
  public void morir(){
    if (this.estado=="vivo"){
      this.estado="fallecido";
      System.out.println("Oh no! Desafortunadamente " +this.nombre+ " acaba de fallecer :( ");
      System.out.println("RIP " +this.nombre+ ", siempre te recordaremos en nuestros corazones");
      System.out.println("                        .              ");
      System.out.println("                       -|-             ");
      System.out.println("                        |                ");
      System.out.println("                    .-'~~~`-.           ");
      System.out.println("                  .'         `.        ");
      System.out.println("                  |  R  I  P  |        ");
      System.out.println("                  |           |        ");
      System.out.println("                  |           |       ");
      System.out.println("                  |           |      ");
      System.out.println("              ^^^^^^^^^^^^^^^^^^^^  ");
    } else {
      System.out.println(this.nombre+ " ya había fallecido");
    }
  }

  public void habla(){
    System.out.println("Soy una mascota y reproduzco un sonido");
  }

  public void bajaMascota(){
    /* El método bajaArtículo elimina el artículo del array estableciendo todos sus datos a 0 o vacíos
     * @ param void
     */
    this.código=0;
    this.nombre="";
    this.tipo="";
    this.edad=0;
    this.estado="";
    this.fechaNacimiento="";
    this.sexo=null;
    Mascota.numMascotas--;
  }

  //Getters//
  public int getCódigo(){
    return this.código;
  }
  public String getNombre(){
    return this.nombre;
  }
  public String getTipo(){
    return this.tipo;
  }
  public int getEdad(){
    return this.edad;
  }
  public String getEstado(){
    return this.estado;
  }
  public String getFechaNacimiento(){
    return this.fechaNacimiento;
  }
  public static int getNumMascotas(){
    return Mascota.numMascotas;
  }
  public Sexo getSexo() {
    return this.sexo;
  }

  //Setters//
  public void setCódigo(int código){
    this.código=código;
  }
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public void setTipo(String tipo){
    this.tipo=tipo;
  }
  public void setEdad(int edad){
    this.edad=edad;
  }
  public void setEstado(String estado){
    this.estado=estado;
  }
  public void setFechaDeNacimiento(String nacimiento){
    this.fechaNacimiento=nacimiento;
  }
  public Sexo setSexo(String sexo) {
    if(sexo.equals("macho")){
      return Sexo.macho;
    } else {
      return Sexo.hembra;
    } 
  }
    
}
