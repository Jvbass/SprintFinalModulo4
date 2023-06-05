package sprintModuleFour.entity;

/**
 * 
 * Clase que representa una capacitación en el sistema.
 * 
 */
public class Training {
    private String id;
    private String day;
    private String hour;
    private String place;
    private String duration;
    private int attendees;

    private int rutCustomer;

    /**
     * Constructor vacío de la clase Training.
     */
    public Training() {
    }

    /**
     * Constructor de la clase Training con parámetros.
     * @param id          El ID de la capacitación.
     * @param day         El día de la capacitación.
     * @param hour        La hora de la capacitación.
     * @param place       El lugar de la capacitación.
     * @param duration    La duración de la capacitación.
     * @param attendees   El número de asistentes a la capacitación.
     * @param rutCustomer El RUT del cliente asociado a la capacitación.
     */
    public Training(String id, String day, String hour, String place, String duration, int attendees, int rutCustomer) {
        this.id = id;
        this.day = day;
        this.hour = hour;
        this.place = place;
        this.duration = duration;
        this.attendees = attendees;
        this.rutCustomer = rutCustomer;
    }

    /**
     * Obtiene el ID de la capacitación.
     * @return El ID de la capacitación.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID de la capacitación.
     * @param id El ID de la capacitación.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el día de la capacitación.
     * @return El día de la capacitación.
     */
    public String getDay() {
        return day;
    }

    /**
     * Establece el día de la capacitación.
     * @param day El día de la capacitación.
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Obtiene la hora de la capacitación.
     * @return La hora de la capacitación.
     */
    public String getHour() {
        return hour;
    }

    /**
     * Establece la hora de la capacitación.
     * @param hour La hora de la capacitación.
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     * Obtiene el lugar de la capacitación.
     * @return El lugar de la capacitación.
     */
    public String getPlace() {
        return place;
    }

    /**
     * Establece el lugar de la capacitación.
     * @param place El lugar de la capacitación.
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * Obtiene la duración de la capacitación.
     * @return La duración de la capacitación.
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Establece la duración de la capacitación.
     * @param duration La duración de la capacitación.
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * Obtiene el número de asistentes a la capacitación.
     * @return El número de asistentes a la capacitación.
     */
    public int getAttendees() {
        return attendees;
    }

    /**
     * Establece el número de asistentes a la capacitación.
     * @param attendees El número de asistentes a la capacitación.
     */
    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }

    /**
     * Muestra los detalles de la capacitación en la consola.
     */
    public void showDetails(){
        System.out.println("La Capacitacion sera en " + this.place + ", a las " + this.hour + ", del dia " + this.day +
                " y con una duracion de " + this.duration + ". Rut cliente asociado:" + this.rutCustomer);
    }
}
