package dambi.moviesrestapi.models;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "movie")
public class Movie {
    
    private int movieId;
    private String title;
    private List<Cast> cast;
    private List<Crew> crew;
    
    public Movie() {
    }
    
    /**
     * Parametrorik duen eraikitzailea.
     *
     * @param movieId Filmaren identifikadorea.
     * @param title   Filmaren izena.
     * @param cast    Filmaren aktoreen zerrenda.
     * @param crew    Filmaren produzioko taldeko kideen zerrenda.
     */
    public Movie(int movieId, String title, List<Cast> cast, List<Crew> crew) {
        
        this.movieId = movieId;
        this.title = title;
        this.cast = cast;
        this.crew = crew;
    }
    
    /**
     * Filmaren identifikadorea itzultzen du.
     *
     * @return int Filmaren identifikadorea.
     */
    public int getMovieId() {
        return movieId;
    }
    
    /**
     * Filmaren identifikadorea ezartzen du.
     *
     * @param movieId Filmaren identifikadorea.
     */
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    
    /**
     * Filmaren izena itzultzen du.
     *
     * @return String Filmaren izena.
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Filmaren izena ezartzen du.
     *
     * @param title Filmaren izena.
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * Filmaren aktoreen zerrenda itzultzen du.
     *
     * @return List<Cast> Filmaren aktoreen zerrenda.
     */
    public List<Cast> getCast() {
        return cast;
    }
    
    /**
     * Filmaren aktoreen zerrenda ezartzen du.
     *
     * @param cast Filmaren aktoreen zerrenda.
     */
    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }
    
    /**
     * Filmaren produzioko taldeko kideen zerrenda itzultzen du.
     *
     * @return List<Crew> Filmaren produzioko taldeko kideen zerrenda.
     */
    public List<Crew> getCrew() {
        return crew;
    }
    
    /**
     * Filmaren produzioko taldeko kideen zerrenda ezartzen du.
     *
     * @param crew Filmaren produzioko taldeko kideen zerrenda.
     */
    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }
    
    /**
     * Filmaren testu-representazioa itzultzen du.
     *
     * @return String Filmaren testu-representazioa.
     */
    @Override
    public String toString() {
        return "Movie [movieId=" + movieId + ", title=" + title + ", cast=" + cast + ", crew=" + crew + "]";
    }

}
