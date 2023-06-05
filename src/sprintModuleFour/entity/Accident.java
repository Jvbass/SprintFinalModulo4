package sprintModuleFour.entity;

/**
 * 
 * Clase que representa un accidente en el sistema.
 * 
 */
public class Accident {
    private String identification;
    private String day;
    private String hour;
    private String place;
    private String origin;
    private String consequences;

    /**
     * Constructor vacío de la clase Accident.
     */
    public Accident() {
    }

    /**
     * Constructor de la clase Accident con parámetros.
     * 
     * @param identification La identificación del accidente.
     * @param day El día del accidente.
     * @param hour La hora del accidente.
     * @param place El lugar del accidente.
     * @param origin El origen del accidente.
     * @param consequences Las consecuencias del accidente.
     */
    public Accident(String identification, String day, String hour, String place, String origin, String consequences) {
        this.identification = identification;
        this.day = day;
        this.hour = hour;
        this.place = place;
        this.origin = origin;
        this.consequences = consequences;
    }

    /**
     * Obtiene la identificación del accidente.
     * @return La identificación del accidente.
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * Establece la identificación del accidente.
     * @param identification La identificación del accidente.
     */
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /**
     * Obtiene el día del accidente.
     * @return El día del accidente.
     */
    public String getDay() {
        return day;
    }

    /**
     * Establece el día del accidente.
     * @param day El día del accidente.
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Obtiene la hora del accidente.
     * @return La hora del accidente.
     */
    public String getHour() {
        return hour;
    }

    /**
     * Establece la hora del accidente.
     * @param hour La hora del accidente.
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     * Obtiene el lugar del accidente.
     * @return El lugar del accidente.
     */
    public String getPlace() {
        return place;
    }

    /**
     * Establece el lugar del accidente.
     * @param place El lugar del accidente.
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * Obtiene el origen del accidente.
     * @return El origen del accidente.
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Establece el origen del accidente.
     * @param origin El origen del accidente.
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Obtiene las consecuencias del accidente.
     * @return Las consecuencias del accidente.
     */
    public String getConsequences() {
        return consequences;
    }

    /**
     * Establece las consecuencias del accidente.
     * @param consequences Las consecuencias del accidente.
     */
    public void setConsequences(String consequences) {
        this.consequences = consequences;
    }

    /**
     * Devuelve una representación en cadena del accidente.
     * @return La representación en cadena del accidente.
     */
    @Override
    public String toString() {
        return "Accident{" +
                "identification='" + identification + '\'' +
                ", day='" + day + '\'' +
                ", hour='" + hour + '\'' +
                ", place='" + place + '\'' +
                ", origin='" + origin + '\'' +
                ", consequences='" + consequences + '\'' +
                '}';
    }
}
