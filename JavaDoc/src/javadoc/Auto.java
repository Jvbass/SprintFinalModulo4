package javadoc;
/**
 * 
 * @author J PinoC
 *
 *Clase Auto que representa un auto que es un tipo de vehiculo
 */

public class Auto extends Vehiculo {

/**
 * Numero puertas del auto
 */
	private int numeroPuertas;
	
/**
 * Constructor para crear una nueva instancia de auto
 * @param marca Marca del auto
 * @param modelo Modelo del auto
 * @param numeroPuertas Número de puertas del auto
*/
	public Auto(String marca, String modelo, int numeroPuertas) {
		super(marca, modelo);
		this.numeroPuertas = numeroPuertas;
	}
	
	
	/**
	 * Muestra los detalles del auto, incluyendo la marca, modelo y numero de puertas
	 *@return Una cadena texto
	 */
	@Override
	public String mostrarDetalles() {
		return super.mostrarDetalles() + ", numero de puertas: "+ numeroPuertas;
	}
	
}
