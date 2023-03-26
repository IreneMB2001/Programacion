package ArraysDeObjetos.TareaC9_3.Ej2Astros;

public abstract class Astro {

  //Atributos de la clase//
  private static int numCuerpos = 0;

  //Atributos de instancia//
  private String nombre;
  private double masa;
  private double radioEcuatorial;
  private double temperaturaMedia;
  private double gravedad;
  private double diámetroMedio;
  private int períodoRotación;
  private double distanciaMedia;

  //Constructor//
  public Astro(String nombre, double masa, double radioE, double tempMedia, double gravedad, double diámetroM, int rotación, double distanciaM){
    this.nombre=nombre;
    this.masa=masa;
    this.radioEcuatorial=radioE;
    this.temperaturaMedia=tempMedia;
    this.gravedad=gravedad;
    this.diámetroMedio=diámetroM;
    this.períodoRotación=rotación;
    this.distanciaMedia=distanciaM;
    numCuerpos++;
  }

  //Métodos//
  public void muestra(){
    System.out.println("                 ,");
    System.out.println("               \\ : /");
    System.out.println("           `. __/ \\__ .'");
    System.out.println("           _ _\\     /_ _");
    System.out.println("              /_   _\\");
    System.out.println("            .'  \\ /  `.");
    System.out.println("               / :  \\ ");
    System.out.println("                 '");
    System.out.println("--------------------------------------------------");
    System.out.println(" INFORMACIÓN SOBRE EL ASTRO");
    System.out.println("--------------------------------------------------");
    System.out.println("|       Nombre        | " + this.nombre);
    System.out.println("|---------------------|---------------------------");
    System.out.println("|        Masa         | " + this.masa);
    System.out.println("|---------------------|---------------------------");
    System.out.println("|  Temperatura media  | " + this.temperaturaMedia);
    System.out.println("|---------------------|---------------------------");
    System.out.println("|      gravedad       | " + this.gravedad);
    System.out.println("|---------------------|---------------------------");
    System.out.println("|   Diámetro medio    | " + this.diámetroMedio);
    System.out.println("|---------------------|---------------------------");
    System.out.println("|   Radio ecuatorial  | " + this.radioEcuatorial);
    System.out.println("|---------------------|---------------------------");
    System.out.println("|   Distancia media   | " + this.distanciaMedia);
    System.out.println("|---------------------|---------------------------");
    System.out.println("| Período de rotación | " + this.períodoRotación);
    System.out.println("|---------------------|---------------------------");
  }

  //Getters//
  public String getNombre(){
    return this.nombre;
  }
  public double getMasa(){
    return this.masa;
  }
  public double getTemperaturaMedia(){
    return this.temperaturaMedia;
  }
  public double getGravedad(){
    return this.gravedad;
  }
  public double getDiámetroMedio(){
    return this.diámetroMedio;
  }
  public double getRadioEcuatorial(){
    return this.radioEcuatorial;
  }
  public double getDistanciaMedia(){
    return this.distanciaMedia;
  }
  public int getPeríodoRotación(){
    return this.períodoRotación;
  }
  public static int getNumCuerpos(){
    return Astro.numCuerpos;
  }


  //Setters//
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public void setMasa(double masa){
    this.masa=masa;
  }
  public void setTemperaturaMedia(double tempMedia){
    this.temperaturaMedia=tempMedia;
  }
  public void setGravedad(double gravedad){
    this.gravedad=gravedad;
  }
  public void setDiámetroMedio(double diámetroM){
    this.diámetroMedio=diámetroM;
  }
  public void setRadioEcuatorial(double radioE){
    this.radioEcuatorial=radioE;
  }
  public void setDistanciaMedia(int distanciaM){
    this.distanciaMedia=distanciaM;
  }
  public void setPeríodoRotación(int rotación){
    this.períodoRotación=rotación;
  }


}
