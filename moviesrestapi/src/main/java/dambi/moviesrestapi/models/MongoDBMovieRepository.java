package dambi.moviesrestapi.models;

import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

import jakarta.annotation.PostConstruct;

@Repository
public class MongoDBMovieRepository implements MovieRepository {
    
    @Autowired
    private MongoClient client;
    private MongoCollection<Movie> movieCollection;

    /**
     * Inizializazioa: MongoDB kolekzioa kargatzen da.
     */

    @PostConstruct
    void init() {
        movieCollection = client.getDatabase("movies").getCollection("movie", Movie.class);
    }
    
    /**
     * Datu-basean gordetako film guztiak eskuratzen ditu.
     *
     * @return List<Movie> Film guztiak bilduko den zerrenda.
     */
    @Override
    public List<Movie> findAll() {
        return movieCollection.find().into(new ArrayList<>());
    }
    
    /**
     * Filma bat aurkitzen du bere izenarekin.
     *
     * @param title Bilatu nahi den filmaaren izena.
     * @return Movie Aurkitutako filma edo null ez bada aurkitzen.
     */
    @Override
    public Movie findByTitle(String title) {
        return movieCollection.find(eq("title", title)).first();
    }
    
    /**
     * Film berri bat datu-basean gehitzen du.
     *
     * @param movie Film berria gordetzeko objektua.
     * @return Movie Gordetutako filma.
     */
    @Override
    public Movie save(Movie movie) {
        movieCollection.insertOne(movie);
        return movie;
    }
    
    /**
     * Filma datu-basean ezabatzen du izenarekin.
     *
     * @param title Ezabatu nahi den filmaaren izena.
     * @return long Ezabatutako film kopurua.
     */
    @Override 
    public long delete(String title) {
        return movieCollection.deleteMany(eq("title", title)).getDeletedCount();
    }
}
