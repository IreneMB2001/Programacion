package ArraysDeObjetos.TareaC9_3.Ej2Astros;

public class Satélite extends Astro {
  //Atributos de instancia//
  private double distanciaPlaneta;
  private int órbitaPlanetaria;
  private String planetaPertenece;

  //Constructor//
  public Satélite(String nombre, double masa, double radioE, double tempMedia, double gravedad, 
  double diámetroM, int rotación, double distanciaM, double distanciaP, int órbitaP, String planetaPertenece){
    super(nombre, masa, radioE, tempMedia, gravedad, diámetroM, rotación, distanciaM);
    this.distanciaPlaneta=distanciaP;
    this.órbitaPlanetaria=órbitaP;
    this.planetaPertenece=planetaPertenece;
  }

  //Métodos//
  //falta averiguar como conectar satélites con planetas//
  @Override
  public void muestra(){
    super.muestra();
    System.out.println("|    Distancia al Planeta    | " + this.distanciaPlaneta);
    System.out.println("|----------------------------|---------------------------");
    System.out.println("|      Órbita planetaria     | " + this.órbitaPlanetaria);
    System.out.println("|----------------------------|---------------------------");
    System.out.println("|  Planeta al que pertenece  | " + this.planetaPertenece);
    System.out.println("|----------------------------|---------------------------");
  }

  //Getters//
  public double getDistanciaPlaneta(){
    return this.distanciaPlaneta;
  }
  public int getÓrbitaPlanetaria(){
    return this.órbitaPlanetaria;
  }
  public String getPlanetaPertene(){
    return this.planetaPertenece;
  }

  //setters//
  public void setDistanciaSol(double distancia){
    this.distanciaPlaneta=distancia;
  }
  public void setÓrbitaSol (int órbitaPlanetaria){
    this.órbitaPlanetaria=órbitaPlanetaria;
  }
  public void setTieneSatélites(String planeta){
    this.planetaPertenece=planeta;
  }
}
