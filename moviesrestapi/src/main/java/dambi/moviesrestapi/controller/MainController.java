package dambi.moviesrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dambi.moviesrestapi.models.Cast;
import dambi.moviesrestapi.models.Crew;
import dambi.moviesrestapi.models.Movie;
import dambi.moviesrestapi.models.MovieRepository;

@RestController
@RequestMapping(path = "/movies")
public class MainController {
    
    @Autowired
    private MovieRepository movieRepository;
    
    /**
     * Datu-basean gordetako film guztiak eskuratzen ditu.
     *
     * @return Iterable<Movie> Film guztiak bilduko den zerrenda.
     */
    @GetMapping(path = "/allmovies")
    public @ResponseBody Iterable<Movie> getMovies() {
        return movieRepository.findAll();
    }
    
    /**
     * Filma bat aurkitzen du bere izenarekin.
     *
     * @param title Bilatu nahi den filmaaren izena.
     * @return Movie Aurkitutako filma edo null ez bada aurkitzen.
     */
    @GetMapping(path = "/findmovie")
    public @ResponseBody Movie findMovie(@RequestParam String title) {
        return movieRepository.findByTitle(title);
    }
    
    /**
     * Film berri bat datu-basean gehitzen du.
     *
     * @param movie_id Filmaren identifikadore unikoa.
     * @param title    Filmaren izena.
     * @param cast     Aktoreen zerrenda.
     * @param crew     Produzioko taldeko kideen zerrenda.
     * @return String Film berria gehitu dela adierazten duen mezua.
     */
    @PostMapping(value = "/addmovie")
    public @ResponseBody String addMovie(@RequestParam int movie_id, @RequestParam String title,
            @RequestBody List<Cast> cast, @RequestBody List<Crew> crew) {
        Movie m = new Movie();
        m.setMovieId(movie_id);
        m.setTitle(title);
        m.setCast(cast);
        m.setCrew(crew);
        movieRepository.save(m);
        return "The movie has been added";
    }
    
    /**
     * Datu-basean dagoen film bat eguneratzen du.
     *
     * @param title    Eguneratu nahi den filmaaren izena.
     * @param movie_id Filma berriaren identifikadorea.
     * @param cast     Gehitu nahi den aktorea.
     * @param crew     Gehitu nahi den produzioko taldeko kidea.
     * @return ResponseEntity<Movie> Eguneratzearen emaitza adierazten duen HTTP
     *         erantzuna.
     */

    @PutMapping(value = "/updatemovie/{title}")
    public ResponseEntity<Movie> updateMovie(@PathVariable String title, @RequestParam int movie_id,
            @RequestBody Cast cast, @RequestBody Crew crew) {
        try {
            Movie m = movieRepository.findByTitle(title);
            m.setMovieId(movie_id);

            List<Cast> cast_members = m.getCast();
            cast_members.add(cast);

            List<Crew> crew_members = m.getCrew();
            crew_members.add(crew);

            movieRepository.save(m);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }
    
    /**
     * Filma datu-basean ezabatzen du izenarekin.
     *
     * @param title Ezabatu nahi den filmaaren izena.
     * @return ResponseEntity<Void> Ezabaketaren emaitza adierazten duen HTTP
     *         erantzuna.
     */

    @DeleteMapping(path = "/deletemovie/{title}")
    public ResponseEntity<Void> deletemovie(@PathVariable String title) {
        try {
            long zenbat = movieRepository.delete(title);
            System.out.println("pelicula ezabatu duzu🔆: " + zenbat);
            return ResponseEntity.ok().build();

        } catch (Exception ex) {
            System.out.println("Errorea " + title + " pelicula ezabatzerakoa ");
            return ResponseEntity.notFound().build();
        }

    }
}
