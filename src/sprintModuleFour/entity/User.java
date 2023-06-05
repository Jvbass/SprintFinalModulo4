package sprintModuleFour.entity;

import sprintModuleFour.service.Advisory;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa a un usuario.
 * Implementa la interfaz Advisory.
 */
public class User implements Advisory {
    private String names;
    private String lastNames;
    private String birthDate;
    private int rut;

    /**
     * Constructor por defecto de la clase User.
     */
    public User() {
    }

    /**
     * Constructor de la clase User.
     * @param names Nombres del usuario.
     * @param lastNames Apellidos del usuario.
     * @param birthDate Fecha de nacimiento del usuario.
     * @param rut Rut del usuario.
     */
    public User(String names, String lastNames, String birthDate, int rut) {
        this.names = names;
        this.lastNames = lastNames;
        this.birthDate = birthDate;
        this.rut = rut;
    }

    /**
     * Obtiene los nombres del usuario.
     * @return Los nombres del usuario.
     */
    public String getNames() {
        return names;
    }

    /**
     * Establece los nombres del usuario.
     * @param names Los nombres del usuario.
     */
    public void setNames(String names) {
        this.names = names;
    }

    /**
     * Obtiene los apellidos del usuario.
     * @return Los apellidos del usuario.
     */
    public String getLastNames() {
        return lastNames;
    }

    /**
     * Establece los apellidos del usuario.
     * @param lastNames Los apellidos del usuario.
     */
    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    /**
     * Obtiene la fecha de nacimiento del usuario.
     * @return La fecha de nacimiento del usuario.
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Establece la fecha de nacimiento del usuario.
     * @param birthDate La fecha de nacimiento del usuario.
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Obtiene el rut del usuario.
     * @return El rut del usuario.
     */
    public int getRut() {
        return rut;
    }

    /**
     * Establece el rut del usuario.
     * @param rut El rut del usuario.
     */
    public void setRut(int rut) {
        this.rut = rut;
    }

    /**
     * Analiza los datos del usuario.
     * Imprime en pantalla el nombre y apellido del usuario.
     */
    @Override
    public void analyzeUser() {
        System.out.println("Nombres: " + this.names + ", apellidos: " + this.lastNames);
    }

    /**
     * Devuelve el objeto usuario en forma de cadena de texto.
     * @return El objeto user en forma de cadena de texto.
     */
    @Override
    public String toString() {
        return "User{" +
                "names='" + names + '\'' +
                ", lastNames='" + lastNames + '\'' +
                ", birthDate=" + birthDate +
                ", rut='" + rut + '\'' +
                '}';
    }

    /**
     * Calcula la edad del usuario.
     * Imprime en consola la edad del usuario.
     */
    public void showAge() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(this.birthDate, fmt);
        LocalDate now = LocalDate.now();
        Period period = Period.between(date, now);
        int age = period.getYears();
        System.out.println("El usuario tiene " + age + " años.");
    }
}

