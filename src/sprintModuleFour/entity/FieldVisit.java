package sprintModuleFour.entity;

import java.util.List;

/**
 * 
 * Clase que representa una visita en terreno en el sistema.
 * 
 */
public class FieldVisit {
    private String identification;
    private String day;
    private String hour;
    private String place;
    private String comments;

    List<Review> reviewList;

    /**
     * Constructor vacío de la clase FieldVisit.
     */
    public FieldVisit() {
    }

    /**
     * Constructor de la clase FieldVisit con parámetros.
     * 
     * @param identification La identificación de la visita en terreno.
     * @param day El día de la visita en terreno.
     * @param hour La hora de la visita en terreno.
     * @param place El lugar de la visita en terreno.
     * @param comments Los comentarios de la visita en terreno.
     */
    public FieldVisit(String identification, String day, String hour, String place, String comments) {
        this.identification = identification;
        this.day = day;
        this.hour = hour;
        this.place = place;
        this.comments = comments;
    }

    /**
     * Obtiene la identificación de la visita en terreno.
     * @return La identificación de la visita en terreno.
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * Establece la identificación de la visita en terreno.
     * @param identification La identificación de la visita en terreno.
     */
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /**
     * Obtiene el día de la visita en terreno.
     * @return El día de la visita en terreno.
     */
    public String getDay() {
        return day;
    }

    /**
     * Establece el día de la visita en terreno
     * @param day El día de la visita en terreno
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Obtiene la hora de la visita en terreno
     * @return La hora de la visita en terreno
     */
    public String getHour() {
        return hour;
    }

    /**
     * Establece la hora de la visita en terreno
     * @param hour La hora de visita en terreno
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     * Obtiene el lugar de la visita en terreno
     * @return El lugar de la visita en terreno
     */
    public String getPlace() {
        return place;
    }

    /**
     * Establece el lugar de la visita en terreno
     * @param place El lugar de la visita en terreno
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * Obtiene los comentarios de la visita en terreno
     * @return Los comentarios de la visita en terreno
     */
    public String getComments() {
        return comments;
    }

    /**
     * Establece los comentarios de la visita en terreno
     * @param comments Los comentarios de la visita en terreno
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * Devuelve una representación en cadena de la visita en terreno
     * @return La representación en cadena de la visita en terreno.
     */
    @Override
    public String toString() {
        return "FieldVisit{" +
                "identification='" + identification + '\'' +
                ", day='" + day + '\'' +
                ", hour='" + hour + '\'' +
                ", place='" + place + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
