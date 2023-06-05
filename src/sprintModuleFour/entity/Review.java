package sprintModuleFour.entity;

/**
 * 
 * Clase que representa una revisión en el sistema.
 * 
 */
public class Review {
    private String identificationRev;
    private String identificationVisit;
    private String revisionName;
    private String detail;
    private Integer state;

    /**
     * Constructor vacío de la clase Review.
     */
    public Review() {
    }

    /**
     * Constructor de la clase Review con parámetros.
     * 
     * @param identificationRev La identificación de la revisión.
     * @param identificationVisit La identificación de la visita asociada a la revisión.
     * @param revisionName El nombre de la revisión.
     * @param detail El detalle de la revisión.
     * @param state El estado de la revisión.
     */
    public Review(String identificationRev, String identificationVisit, String revisionName, String detail, Integer state) {
        this.identificationRev = identificationRev;
        this.identificationVisit = identificationVisit;
        this.revisionName = revisionName;
        this.detail = detail;
        this.state = state;
    }

    /**
     * Obtiene la identificación de la revisión.
     * @return La identificación de la revisión.
     */
    public String getIdentificationRev() {
        return identificationRev;
    }

    /**
     * Establece la identificación de la revisión.
     * @param identificationRev La identificación de la revisión.
     */
    public void setIdentificationRev(String identificationRev) {
        this.identificationRev = identificationRev;
    }

    /**
     * Obtiene la identificación de la visita asociada a la revisión.
     * @return La identificación de la visita asociada a la revisión.
     */
    public String getIdentificationVisit() {
        return identificationVisit;
    }

    /**
     * Establece la identificación de la visita asociada a la revisión.
     * @param identificationVisit La identificación de la visita asociada a la revisión.
     */
    public void setIdentificationVisit(String identificationVisit) {
        this.identificationVisit = identificationVisit;
    }

    /**
     * Obtiene el nombre de la revisión.
     * @return El nombre de la revisión.
     */
    public String getRevisionName() {
        return revisionName;
    }

    /**
     * Establece el nombre de la revisión.
     * @param revisionName El nombre de la revisión.
     */
    public void setRevisionName(String revisionName) {
        this.revisionName = revisionName;
    }

    /**
     * Obtiene el detalle de la revisión.
     * @return El detalle de la revisión.
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Establece el detalle de la revisión.
     * @param detail El detalle de la revisión.
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * Obtiene el estado de la revisión.
     * @return El estado de la revisión.
     */
    public Integer getState() {
        return state;
    }

    /**
     * Establece el estado de la revisión.
     * @param state El estado de la revisión.
     */
    public void setState(Integer state) {
        this.state = state;
    }
}
