package ArraysDeObjetos.TareaC9_3.Ej3Mascotas;



public class Loro extends Ave {
  //Atributos de instancia//
  private String origen;
  private boolean hablaImita;

  //Constructor//
  public Loro(int código, String nombre, int edad, String fechaNacimiento, String sexo, String pico, boolean vuela, String origen, boolean hablaImita){
    super(código, nombre, edad, fechaNacimiento, sexo, pico, vuela);
    this.origen=origen;
    this.hablaImita=hablaImita;
    this.setTipo("Loro");
  }

  //Métodos//
  @Override
  public void muestra(){
    super.muestra();
    System.out.println("|         origen        | " + this.origen);
    System.out.println("|-----------------------|-----------------------");
    System.out.println("|     ¿Puede hablar?    | " + this.hablaImita);
    System.out.println("|-----------------------|-----------------------");

  }

  @Override
  public void volar(){
    if (this.getVuela()==true){
      System.out.println("Estoy volando fiunnnn");
      System.out.println("             __");
      System.out.println("            /'{>");
      System.out.println("        ____) (____");
      System.out.println("      //'--;   ;--'\\\\");
      System.out.println("     ///////\\_/\\\\\\\\\\\\\\");
      System.out.println("            m m");
    } else {
      System.out.println(this.getNombre()+" no puede volar");
    }
  }

  public void saluda(){
    if (this.hablaImita==true) {
    System.out.println("          _------.                                 ");
    System.out.println("        /   ,     \\_         O----------------------O   ");
    System.out.println("       /   /  /{}\\ |o\\__   <<|    HOLA    HOLA      |  ");
    System.out.println("      /    \\  `--' /-'  \\    O----------------------O     ");
    System.out.println("     |      \\      \\     |                              ");
    System.out.println("     |              |`-, |                             ");
    System.out.println("     /              /__/)/                                 ");
    System.out.println("    |              |                                      ");
    } else {
      System.out.println(this.getNombre()+" no puede imitar el habla humana");
    }
  }

  @Override
  public void habla(){
    System.out.println("          _------.                                 ");
    System.out.println("        /   ,     \\_          O----------------------O   ");
    System.out.println("       /   /  /{}\\ |o\\__   <<|    TRUAA  TRUAA      |  ");
    System.out.println("      /    \\  `--' /-'  \\    O----------------------O     ");
    System.out.println("     |      \\      \\     |                              ");
    System.out.println("     |              |`-, |                             ");
    System.out.println("     /              /__/)/                                 ");
    System.out.println("    |              |                                      ");
  }

  @Override
  public void bajaMascota(){
    /* El método bajaMascota elimina la mascota del array estableciendo todos sus datos a 0 o vacíos
     * @ param void
     */
    super.bajaMascota();
    this.origen="";
    this.hablaImita=false;
  }

  //Getters//
  public String getOrigen(){
    return this.origen;
  }
  public boolean getHablaImita(){
    return this.hablaImita;
  }
  
}
