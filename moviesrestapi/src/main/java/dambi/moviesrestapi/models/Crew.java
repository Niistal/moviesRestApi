package dambi.moviesrestapi.models;

public class Crew {
    
    private String credit_id;
    private String department;
    private int gender;
    private int id;
    private String job;
    private String name;
    
    public Crew() {
    }
    
    /**
     * Parametrorik duen eraikitzailea.
     *
     * @param credit_id  Kredituaren identifikadorea.
     * @param department Taldearen departamentua.
     * @param gender     Generoa.
     * @param id         Identifikadorea.
     * @param job        Lan-postua.
     * @param name       Izena.
     */
    public Crew(String credit_id, String department, int gender, int id, String job, String name) {
        this.credit_id = credit_id;
        this.department = department;
        this.gender = gender;
        this.id = id;
        this.job = job;
        this.name = name;
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
     * Taldearen departamentua itzultzen du.
     *
     * @return String Taldearen departamentua.
     */

    public String getDepartment() {
        return department;
    }
    
    /**
     * Taldearen departamentua ezartzen du.
     *
     * @param department Taldearen departamentua.
     */
    public void setDepartment(String department) {
        this.department = department;
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
     * Lan-postua itzultzen du.
     *
     * @return String Lan-postua.
     */
    public String getJob() {
        return job;
    }
    
    /**
     * Lan-postua ezartzen du.
     *
     * @param job Lan-postua.
     */
    public void setJob(String job) {
        this.job = job;
    }
    
    /**
     * Izena itzultzen du.
     *
     * @return String Izena.
     */
    public String getName() {
        return name;
    }
    
    /**
     *Izena ezartzen du.
     *
     * @param name Izena.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Objetuaren testu-representazioa itzultzen du.
     *
     * @return String Objetuaren testu-representazioa.
     */
    @Override
    public String toString() {
        return "Crew [credit_id=" + credit_id + ", department=" + department + ", gender=" + gender + ", id=" + id
                + ", job=" + job + ", name=" + name + "]";
    }

}
