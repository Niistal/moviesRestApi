package dambi.moviesrestapi.models;

public class Cast {
    
    private int cast_id;
    private String character;
    private String credit_id;
    private int gender;
    private int id;
    private String name;
    private int order;

    public Cast() {

    }
    
    /**
     * Parametrorik duen eraikitzailea.
     *
     * @param cast_id   Aktorearen identifikadorea.
     * @param character Pertsonaiaren izena.
     * @param credit_id Kredituaren identifikadorea.
     * @param gender    Generoa.
     * @param id        Identifikadorea.
     * @param name      Aktorearen izena.
     * @param order     Ordena.
     */

    public Cast(int cast_id, String character, String credit_id, int gender, int id, String name, int order) {
        this.cast_id = cast_id;
        this.character = character;
        this.credit_id = credit_id;
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.order = order;
    }
    
    /**
     * Aktorearen identifikadorea itzultzen du.
     *
     * @return int Aktorearen identifikadorea.
     */
    public int getCast_id() {
        return cast_id;
    }
            
    /**
     * Aktorearen identifikadorea ezartzen du.
     *
     * @param cast_id Aktorearen identifikadorea.
     */
    public void setCast_id(int cast_id) {
        this.cast_id = cast_id;
    }
    
    /**
     * Pertsonaiaren izena itzultzen du.
     *
     * @return String Pertsonaiaren izena.
     */
    public String getCharacter() {
        return character;
    }
    
    /**
     * Pertsonaiaren izena ezartzen du.
     *
     * @param character Pertsonaiaren izena.
     */
    public void setCharacter(String character) {
        this.character = character;
    }
    
    /**
     * Kredituaren identifikadorea itzultzen du.
     *
     * @return String Kredituaren identifikadorea.
     */

    public String getCredit_id() {
        return credit_id;
    }

    /**
     * Kredituaren identifikadorea ezartzen du.
     *
     * @param credit_id Kredituaren identifikadorea.
     */
    public void setCredit_id(String credit_id) {
        this.credit_id = credit_id;
    }
    
    /**
     * Generoa itzultzen du.
     *
     * @return int Generoa.
     */

    public int getGender() {
        return gender;
    }
    
    /**
     * Generoa ezartzen du.
     *
     * @param gender Generoa.
     */
    public void setGender(int gender) {
        this.gender = gender;
    }
    
    /**
     * Identifikadorea itzultzen du.
     *
     * @return int Identifikadorea.
     */
    public int getId() {
        return id;
    }

    /**
     * Identifikadorea ezartzen du.
     *
     * @param id Identifikadorea.
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Aktorearen izena itzultzen du.
     *
     * @return String Aktorearen izena.
     */
    public String getName() {
        return name;
    }

    /**
     * Aktorearen izena ezartzen du.
     *
     * @param name Aktorearen izena.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Ordena itzultzen du.
     *
     * @return int Ordena.
     */
    public int getOrder() {
        return order;
    }

    /**
     * Ordena ezartzen du.
     *
     * @param order Ordena.
     */
    public void setOrder(int order) {
        this.order = order;
    }
    
    /**
     * Objetuaren testu-representazioa itzultzen du.
     *
     * @return String Objetuaren testu-representazioa.
     */
    @Override
    public String toString() {
        return "Cast [cast_id=" + cast_id + ", character=" + character + ", credit_id=" + credit_id + ", gender="
                + gender + ", id=" + id + ", name=" + name + ", order=" + order + "]";
    }

}
