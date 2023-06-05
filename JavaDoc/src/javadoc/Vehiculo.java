package javadoc;
//escribimos /+*+*+enter
/**
 * 
 * author J PinoC
 * 
 *Clase base Vehiculo para representar un vehiculo generico
 */

public class Vehiculo {
	/**
	 * Marca del vehiculo, "Toyota", "Ford"
	 */
	protected String marca;
	/**
	 * Modelo de vehiculo, por ejemplo "Hilux", "Mustang"
	 */
	protected String modelo;
	
	//alt +shift+j
	/**
	 * Constructor para crear una instancia de Vehiculo
	 * 
	 * @param marca Marca del vehiculo
	 * @param modelo Modelo del Vehículo
	 */
	public Vehiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	/**
	 * Muestra la marca y el modelo del Vehículo
	 * 
	 * @return Una cadena de texto con la marca y modelo del vehiculo
	 */
	public String mostrarDetalles() {
		return "Marca: " + marca + ", Modelo:" + modelo;
	}
	
	
}
