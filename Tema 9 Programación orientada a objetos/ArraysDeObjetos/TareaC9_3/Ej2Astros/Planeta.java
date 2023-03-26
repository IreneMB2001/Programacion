package ArraysDeObjetos.TareaC9_3.Ej2Astros;


public class Planeta extends Astro {

  //Atributos de instancia//
  private double distanciaSol;
  private int órbitaSol;
  private boolean tieneSatélites;
  private boolean tieneAnillos;

  //Constructor//
  public Planeta(String nombre, double masa, double radioE, double tempMedia, double gravedad, 
  double diámetroM, int rotación, double distanciaM, double distanciaSol, int órbitaSol, boolean tieneSatélites, boolean tieneAnillos){
    super(nombre, masa, radioE, tempMedia, gravedad, diámetroM, rotación, distanciaM);
    this.distanciaSol=distanciaSol;
    this.órbitaSol=órbitaSol;
    this.tieneSatélites=tieneSatélites;
    this.tieneAnillos=tieneAnillos;
  }

  //Métodos//
  //falta averiguar como conectar satélites con planetas//
  @Override
  public void muestra(){
    super.muestra();
    System.out.println("|   Distancia al Sol  | " + this.distanciaSol);
    System.out.println("|---------------------|---------------------------");
    System.out.println("|    Órbita al Sol    | " + this.órbitaSol);
    System.out.println("|---------------------|---------------------------");
    System.out.println("|  ¿Tiene satélites?  | " + this.tieneSatélites);
    System.out.println("|---------------------|---------------------------");
    System.out.println("|   ¿Tiene anillos?   | " + this.tieneAnillos);
    System.out.println("|---------------------|---------------------------");


  }

  //Getters//
  public double getDistanciaSol(){
    return this.distanciaSol;
  }
  public int getÓrbitaSol(){
    return this.órbitaSol;
  }
  public boolean getTieneSatélites(){
    return this.tieneSatélites;
  }
  public boolean getTieneAnillos(){
    return this.tieneAnillos;
  }

  //setters//
  public void setDistanciaSol(double distancia){
    this.distanciaSol=distancia;
  }
  public void setÓrbitaSol (int órbitaSol){
    this.órbitaSol=órbitaSol;
  }
  public void setTieneSatélites(boolean tiene){
    this.tieneSatélites=tiene;
  }
  public void setTieneAnillos(boolean tiene){
    this.tieneAnillos=tiene;
  }

}
