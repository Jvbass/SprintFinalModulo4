package sprintModuleFour.service;

import sprintModuleFour.entity.Administrative;
import sprintModuleFour.entity.Customer;
import sprintModuleFour.entity.Professional;
import sprintModuleFour.entity.User;
import sprintModuleFour.entity.Training;
import sprintModuleFour.service.Advisory;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Clase que representa un contenedor para almacenar usuarios y capacitaciones.
 *
 */
public class Container {
    private List<Advisory> listAdvisory = new ArrayList<>();
    private List<Training> listTraining = new ArrayList<>();

    /**
     * Constructor vacío de la clase Container.
     */
    public Container() {
    }

    /**
     * Constructor de la clase Container.
     * 
     * @param listAdvisory Lista de objetos que implementan la interface Advisory (cliente, administrativo y profesional)
     * @param listTraining Lista de capacitaciones
     */
    public Container(List<Advisory> listAdvisory, List<Training> listTraining) {
        this.listAdvisory = listAdvisory;
        this.listTraining = listTraining;
    }

    /**
     * Obtiene la lista de objetos que implementan la interface Advisory
     * 
     * @return La lista de objetos que implementan la interface Advisory
     */
    public List<Advisory> getListAdvisory() {
        return listAdvisory;
    }

    /**
     * Establece la lista de Advisory.
     * 
     * @param listAdvisory  La lista de Advisory.
     */
    public void setListAdvisory(List<Advisory> listAdvisory) {
        this.listAdvisory = listAdvisory;
    }

    /**
     * Obtiene la lista de capacitaciones.
     * 
     * @return Obtiene la lista de capacitaciones.
     */
    public List<Training> getListTraining() {
        return listTraining;
    }

    /**
     * Establece la lista de capacitaciones.
     * 
     * @param listTraining  La lista de capacitaciones.
     */
    public void setListTraining(List<Training> listTraining) {
        this.listTraining = listTraining;
    }

    /**
     * Almacena un cliente en la lista Advisory.
     * 
     * @param customer El cliente a almacenar.
     */
    public void storeCustomer(Customer customer){
        listAdvisory.add(customer);
    }

    /**
     * Almacena un profesional en la lista Advisory.
     * 
     * @param professional  El profesional a almacenar.
     */
    public void storeProfessional(Professional professional){ 
    	listAdvisory.add(professional); 
    	}

    /**
     * Almacena un administrativo en la lista Advisory.

     * 
     * @param administrative  El administrativo a almacenar.
     */
    public void storeAdministrative(Administrative administrative){
        listAdvisory.add(administrative);
    }

    /**
     * Almacena una capacitación en la lista de capacitaciones.
     * 
     * @param training  La capacitación a almacenar.
     */
    public void storeTraining(Training training){
        listTraining.add(training);
    }

    /**
     * Elimina un usuario de la lista Advisory según su rut.
     * 
     * @param rut El rut del usuario a eliminar.
     */
    public void deleteUser(int rut){
        if(listAdvisory.removeIf(advisory -> advisory instanceof User && ((User) advisory).getRut() == rut)){
            System.out.println("Usuario eliminado");
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    /**
     * Lista todos los usuarios registrados en la lista Advisory.
     */
    public void listUsers(){
        if(listAdvisory.isEmpty()) System.out.println("No hay usuarios registrados");
        else {
            for (Advisory advisory : listAdvisory) {
                if (advisory instanceof User) {
                    User user = (User) advisory;
                    System.out.println("---------------------------------");
                    System.out.println("Nombres: " + user.getNames() );
                    System.out.println("Apellidos: "+ user.getLastNames());
                    System.out.println("Fecha de nacimiento: " + user.getBirthDate());
                    System.out.println("Rut: " + user.getRut());
                    System.out.println("---------------------------------");
                }
            }
        }
    }

    /**
     * Lista los usuarios de un tipo específico. Devuelve los datos del objeto usuario mas los datos especificos de cada tipo de usuario.
     * 
     * 
     * @param type El tipo de usuario a listar.
     * @param typeClass nombre de la clase que corresponde al tipo de usuario que queremos enlistar
     */
    public void listUsersByType(String type) {
        String typeToLowerCase = type.toLowerCase();
        String typeClass = null;
        
        //asignamos a typeClass el nombre de la Clase segun el tipo de usuario que queremos listar
        if (typeToLowerCase.equals("cliente")) {
            typeClass = "Customer";
        } else if (typeToLowerCase.equals("profesional")) {
            typeClass = "Professional";
        } else if (typeToLowerCase.equals("administrativo")) {
            typeClass = "Administrative";
        } else {
            System.out.println("Tipo de usuario no válido");
            return;
        }
        //imprimimos tipo de usuario
        System.out.println("Usuarios de tipo " + typeToLowerCase + ":");

        //recorremos la lista listAdvisory con el ciclo for each, asignamos a advisory el objeto recorrido
        for (Advisory advisory : listAdvisory) {
        	//con advisory.getClass().getSimpleName() obtenemos como String el nombre de la clase instanciada en el objeto recorrido
        	if (advisory.getClass().getSimpleName().equals(typeClass)) {
                System.out.println("_____________________________");
                
               //asignamos el nombre del tipo de usuario a userType segun el nombre de la clase instanciada del objeto recorrido
                String userType = "";
                if (advisory instanceof Customer) {
                    userType = "Cliente";
                } else if (advisory instanceof Professional) {
                    userType = "Profesional";
                } else if (advisory instanceof Administrative) {
                    userType = "Administrativo";
                }

                //imprimimos el nombre del tipo de usuario
                System.out.println("Tipo: " + userType);

                //imprimimos los datos comunes de la clase Usuario
                User user = (User) advisory;
                System.out.println("Nombres: " + user.getNames());
                System.out.println("Apellidos: " + user.getLastNames());
                System.out.println("Fecha de nacimiento: " + user.getBirthDate());
                System.out.println("RUT: " + user.getRut());

                //si la instancia del objeto recorrido corresponde a la clase Customer imprimimos los datos propios de la clase Customer
                if (advisory instanceof Customer) {
                    Customer customer = (Customer) advisory;
                    System.out.println("Teléfono: " + customer.getPhone());
                    System.out.println("AFP: " + customer.getAfp());
                    System.out.println("Sistema de salud: " + (customer.getHealthcareSystem() == 1 ? "Fonasa" : "Isapre"));
                    System.out.println("Dirección: " + customer.getAddress());
                    System.out.println("Comuna: " + customer.getComuna());
                 //si la instancia del objeto recorrido corresponde a la clase Professional imprimimos los datos propios de la clase Professional                    
                } else if (advisory instanceof Professional) {
                    Professional professional = (Professional) advisory;
                    System.out.println("Título: " + professional.getDegree());
                    System.out.println("Fecha de ingreso: " + professional.getDateOfAdmission());
                 //si la instancia del objeto recorrido corresponde a la clase Administrative imprimimos los datos propios de la clase Administrative
                } else if (advisory instanceof Administrative) {
                    Administrative administrative = (Administrative) advisory;
                    System.out.println("Área: " + administrative.getArea());
                    System.out.println("Experiencia: " + administrative.getExperience());
                }
            }
        }
        System.out.println("_____________________________");
    }

    /**
     * Lista todas las capacitaciones almacenadas en la lista de capacitaciones.
     * @return Lista de capacitaciones
     */
    public void listTrainings(){
        for(Training training : listTraining){
            System.out.println("Capacitacion: " + training + " Cliente: " + training.getClass().getName().equals("Customer"));
        }
    }

    /**
     * Muestra los detalles de una capacitación específica.
     * 
     * @param training  La capacitación de la cual se mostrarán los detalles.
     * @return Detalles de una capacitacion
     */
    public void showTrainings(Training training){
        for(Training training1 : listTraining){
            training1.showDetails();
        }
    }
}
