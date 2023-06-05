package javadoc;
/**
 * 
 * @author J PInoC
 *Clase main para ejecutar app
 */
public class Main {

	/**
	 * El metodo main es el punto de entrada para la ejecucion de la app
	 * En este metodo , creamos un auto y mostramos su detalle
	 * @param args Argumentos de linea  de comandos. No se utulizan para esta app
	 */
	
	public static void main(String[] args) {
//Crea un nuevo auto "toyota"
		Auto miauto = new Auto("Toyota", "Supra MK4", 4);
			
		System.out.println(miauto.mostrarDetalles());
	}
}
