package javadoc;

public class Camion extends Vehiculo {
  
  private double capacidadCarga;
  
  public Camion(String marca, String modelo, double capacidadCarga) {
    super(marca, modelo);
    this.capacidadCarga = capacidadCarga;
  }
  
  
  public String mostrarDetalles() {
    return super.mostrarDetalles() + ", Capacidad de carga: " + capacidadCarga;
  }
 
  
}