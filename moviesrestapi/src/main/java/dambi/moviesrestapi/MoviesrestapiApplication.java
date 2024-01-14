package dambi.moviesrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot aplikazioaren sorrera eta exekuzioa kontrolatzen duen klasea.
 */
@SpringBootApplication
public class MoviesrestapiApplication {
	/**
	 * Aplikazioa exekutatzen duen metodoa.
	 *
	 * @param args Aplikazio-argumentuak.
	 */
	public static void main(String[] args) {
		SpringApplication.run(MoviesrestapiApplication.class, args);
	}

}
