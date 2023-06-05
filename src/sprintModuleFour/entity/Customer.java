package sprintModuleFour.entity;

import java.util.List;

/**
 * 
 * Clase que representa una entidad Cliente en el sistema y hereda de la clase User.
 * 
 */
public class Customer extends User {
    private String phone;
    private String afp;
    private int healthcareSystem;
    private String address;
    private String comuna;
    private List<Training> listTraining;
    private List<Accident> listAccident;
    private List<FieldVisit> listFieldVisit;

    /**
     * Constructor vacio de Customer.
     */
    public Customer() {
    }

    /**
     * Constructor de la clase Customer.
     * @param names Nombres del cliente.
     * @param lastNames Apellidos del cliente.
     * @param birthDate Fecha de nacimiento del cliente.
     * @param rut Rut del cliente.
     * @param phone Teléfono del cliente.
     * @param afp AFP del cliente.
     * @param healthcareSystem Sistema de salud del cliente.
     * @param address Dirección del cliente.
     * @param comuna Comuna del cliente.
     */
    public Customer(String names, String lastNames, String birthDate, int rut, String phone, String afp,
                    int healthcareSystem, String address, String comuna) {
        super(names, lastNames, birthDate, rut);
        this.phone = phone;
        this.afp = afp;
        this.healthcareSystem = healthcareSystem;
        this.address = address;
        this.comuna = comuna;
    }

    /**
     * Constructor de Customer con listas asosiadas; listTraining, listAccident, listFieldVisit.
     * @param names Nombres del cliente.
     * @param lastNames Apellidos del cliente.
     * @param birthDate Fecha de nacimiento del cliente.
     * @param rut Rut del cliente.
     * @param phone Teléfono del cliente.
     * @param afp AFP del cliente.
     * @param healthcareSystem Sistema de salud del cliente.
     * @param address Dirección del cliente.
     * @param comuna Comuna del cliente.
     * @param listTraining Lista de capacitaciones del cliente.
     * @param listAccident Lista de accidentes del cliente.
     * @param listFieldVisit Lista de visitas de campo del cliente.
     */
    public Customer(String names, String lastNames, String birthDate, int rut, String phone, String afp,
                    int healthcareSystem, String address, String comuna, List<Training> listTraining,
                    List<Accident> listAccident, List<FieldVisit> listFieldVisit) {
        super(names, lastNames, birthDate, rut);
        this.phone = phone;
        this.afp = afp;
        this.healthcareSystem = healthcareSystem;
        this.address = address;
        this.comuna = comuna;
        this.listTraining = listTraining;
        this.listAccident = listAccident;
        this.listFieldVisit = listFieldVisit;
    }

    /**
     * Obtiene el teléfono del cliente.
     * @return El teléfono del cliente.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Establece el teléfono del cliente.
     * @param phone El teléfono del cliente.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Obtiene el AFP del cliente.
     * @return El AFP del cliente.
     */
    public String getAfp() {
        return afp;
    }

    /**
     * Establece el AFP del cliente.
     * @param afp El AFP del cliente.
     */
    public void setAfp(String afp) {
        this.afp = afp;
    }

    /**
     * Obtiene el sistema de salud del cliente.
     * @return El sistema de salud del cliente.
     */
    public int getHealthcareSystem() {
        return healthcareSystem;
    }

    /**
     * Establece el sistema de salud del cliente.
     * @param healthcareSystem El sistema de salud del cliente.
     */
    public void setHealthcareSystem(int healthcareSystem) {
        this.healthcareSystem = healthcareSystem;
    }

    /**
     * Obtiene la dirección del cliente.
     * @return La dirección del cliente.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Establece la dirección del cliente.
     * @param address La dirección del cliente.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Obtiene la comuna del cliente.
     * @return La comuna del cliente.
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Establece la comuna del cliente.
     * @param comuna La comuna del cliente.
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * Obtiene la lista de capacitaciones del cliente.
     * @return La lista de capacitaciones del cliente.
     */
    public List<Training> getListTraining() {
        return listTraining;
    }

    /**
     * Establece la lista de capacitaciones del cliente.
     * @param listTraining La lista de capacitaciones del cliente.
     */
    public void setListTraining(List<Training> listTraining) {
        this.listTraining = listTraining;
    }

    /**
     * Obtiene la lista de accidentes del cliente.
     * @return La lista de accidentes del cliente.
     */
    public List<Accident> getListAccident() {
        return listAccident;
    }

    /**
     * Establece la lista de accidentes del cliente.
     * @param listAccident La lista de accidentes del cliente.
     */
    public void setListAccident(List<Accident> listAccident) {
        this.listAccident = listAccident;
    }

    /**
     * Obtiene la lista de visitas de campo del cliente.
     * @return La lista de visitas de campo del cliente.
     */
    public List<FieldVisit> getListFieldVisit() {
        return listFieldVisit;
    }

    /**
     * Establece la lista de visitas de campo del cliente.
     * @param listFieldVisit La lista de visitas de campo del cliente.
     */
    public void setListFieldVisit(List<FieldVisit> listFieldVisit) {
        this.listFieldVisit = listFieldVisit;
    }

    /**
     * Devuelve el objeto Customer en forma de cadena de texto.
     * @return El objeto Customer en forma de cadena de texto.
     */
    @Override
    public String toString() {
        return "Customer{" +
                "Telefono = '" + phone + '\'' +
                ", AFP = '" + afp + '\'' +
                ", Direccion = '" + address + '\'' +
                ", comuna = '" + comuna + '\'' +
                ", Capacitaciones = " + listTraining +
                ", Accidentes = " + listAccident +
                ", Visitas = " + listFieldVisit +
                '}';
    }

    /**
     * Método que imprime la dirección y comuna del cliente.
     * @return Direccion y comuna del cliente
     */
    public void analyzeUser() {
        System.out.println("Direccion: " + this.address + " Comuna: " + this.comuna);
    }

    /**
     * Método que imprime el nombre completo del cliente en la consola.
     * @return Nombres y Apellidos
     */
    public void getFullName() {
        System.out.println("Nombre: " + this.getNames() + " Apellido: " + this.getLastNames());
    }

    /**
     * Método que imprime el sistema de salud del cliente segun opcion 1 o 2.
     * @return	Sistema salud del cliente.
     */
    public void getSistemaSalud(){
        if(this.healthcareSystem == 1) System.out.println("Sistema de salud: Fonasa");
        else System.out.println("Sistema de salud: Isapre");
    }
}
