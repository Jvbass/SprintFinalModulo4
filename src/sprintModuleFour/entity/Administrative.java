package sprintModuleFour.entity;

import sprintModuleFour.entity.User;

/**
 * 
 * Clase que representa a un usuario administrativo en el sistema y hereda de la clase User.
 * 
 */
public class Administrative extends User {
    private String area;
    private String experience;

    /**
     * Constructor vacío de Administrative.
     */
    public Administrative() {
    }

    /**
     * Constructor de la clase Administrative con parámetros.
     * 
     * @param names Los nombres del usuario administrativo.
     * @param lastNames Los apellidos del usuario administrativo.
     * @param birthDate La fecha de nacimiento del usuario administrativo.
     * @param rut El RUT del usuario administrativo.
     * @param area El área de especialización del usuario administrativo.
     * @param experience La experiencia del usuario administrativo.
     */
    public Administrative(String names, String lastNames, String birthDate, int rut, String area, String experience) {
        super(names, lastNames, birthDate, rut);
        this.area = area;
        this.experience = experience;
    }

    /**
     * Obtiene el área de especialización del usuario administrativo.
     * @return El área de especialización del usuario administrativo.
     */
    public String getArea() {
        return area;
    }

    /**
     * Establece el área de especialización del usuario administrativo.
     * @param area El área de especialización del usuario administrativo.
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Obtiene la experiencia del usuario administrativo.
     * @return La experiencia del usuario administrativo.
     */
    public String getExperience() {
        return experience;
    }

    /**
     * Establece la experiencia del usuario administrativo.
     * @param experience La experiencia del usuario administrativo.
     */
    public void setExperience(String experience) {
        this.experience = experience;
    }

    /**
     * Devuelve una representación en cadena del usuario administrativo.
     * @return La representación en cadena del usuario administrativo.
     */
    @Override
    public String toString() {
        return "Administrative{" +
                "area='" + area + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }

    /**
     * Imprime el análisis del usuario administrativo.
     */
    @Override
    public void analyzeUser() {
        System.out.println("Nombres: " + this.getNames() + ", apellidos: " + this.getLastNames() +
                ", área: " + this.area + ", experiencia: " + this.experience);
    }
}
