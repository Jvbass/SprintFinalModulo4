package sprintModuleFour.entity;

import sprintModuleFour.entity.User;

/**
 * 
 * Clase que representa a un profesional, que es un tipo de usuario.
 * Hereda de la clase User.
 * 
 */

public class Professional extends User {
    private String degree;
    private String dateOfAdmission;

    /**
     * Constructor vacío de Professional.
     */
    public Professional() {
    }

    /**
     * Constructor de la clase Professional que recibe los datos del profesional.
     * 
     * @param names Los nombres del profesional.
     * @param lastNames Los apellidos del profesional.
     * @param birthDate La fecha de nacimiento del profesional.
     * @param rut El rut del profesional.
     * @param degree El título del profesional.
     * @param dateOfAdmission La fecha de ingreso del profesional.
     * 
     */
    public Professional(String names, String lastNames, String birthDate, int rut, String degree, String dateOfAdmission) {
        super(names, lastNames, birthDate, rut);
        this.degree = degree;
        this.dateOfAdmission = dateOfAdmission;
    }

    /**
     * Obtiene el título del profesional.
     * 
     * @return El título del profesional.
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Establece el título del profesional.
     * 
     * @param degree El título del profesional.
     * 
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * Obtiene la fecha de ingreso del profesional.
     * 
     * @return La fecha de ingreso del profesional.
     */
    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    /**
     * Establece la fecha de ingreso del profesional.
     * 
     * @param dateOfAdmission La fecha de ingreso del profesional.
     */
    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    /**
     * Sobrescribe el método analyzeUser de la clase User para mostrar los detalles del profesional.
     */
    @Override
    public void analyzeUser() {
        System.out.println("Nombres: " + this.getNames() + ", apellidos: " + this.getLastNames() +
                ", titulo: " + this.degree + ", fecha de ingreso: " + this.dateOfAdmission);
    }
}
