package dambi.moviesrestapi.models;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository {
    /**
     * Datu-basean gordetako film guztiak eskuratzen ditu.
     *
     * @return List<Movie> Film guztiak bilduko den zerrenda.
     */
    List<Movie> findAll();
    
    /**
     * Filma bat aurkitzen du bere izenarekin.
     *
     * @param title Bilatu nahi den filmaaren izena.
     * @return Movie Aurkitutako filma edo null ez bada aurkitzen.
     */
    Movie findByTitle(String title);
    
    //Crew findByJob(String job);
    
    /**
     * Film berri bat datu-basean gehitzen du.
     *
     * @param movie Film berria gordetzeko objektua.
     * @return Movie Gordetutako filma.
     */

    Movie save(Movie title);
    
    /**
     * Filma datu-basean ezabatzen du izenarekin.
     *
     * @param title Ezabatu nahi den filmaaren izena.
     * @return long Ezabatutako film kopurua.
     */
    long delete(String title);
}
