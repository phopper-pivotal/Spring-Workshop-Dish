package io.pivotal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAuthorizationServer
@EnableResourceServer
public class WatchingApplication {

	public static void main(String[] args) {

		SpringApplication.run(WatchingApplication.class, args);

	}

    /**
    @Bean
    public CommandLineRunner demo(MovieRepository movieRepository) {
        return (args) -> {
            // save a couple of movies
            movieRepository.save(new Movie("Frozen", "2013", "PG", "27 Nov 2013", "102 min", "Animation, Adventure, Comedy"));
            movieRepository.save(new Movie("Toy Story", "1995", "G", "22 Nov 1995", "81 min", "Animation, Adventure, Comedy"));
            movieRepository.save(new Movie("Muppets Most Wanted", "2014", "PG", "21 Mar 2014", "107 min", "Adventure, Comedy, Crime"));
            movieRepository.save(new Movie("The Incredibles", "2004", "PG", "05 Nov 204", "115 min", "Animation, Action, Adventure"));

            // fetch all movies
            System.out.println("Movies found with findAll()");
            System.out.println("---------------------------");
            for (Movie movie : movieRepository.findAll()) {
                System.out.println(movie.toString());
            }
            System.out.println();


            // fetch one movie
            System.out.println("Movies found with findOne()");
            System.out.println("---------------------------");
            Movie movie = movieRepository.findOne(1L);
            System.out.println(movie.toString());
            System.out.println();

            // fetch movies by title
            System.out.println("Movies found with findByTitle('Frozen')");
            System.out.println("---------------------------");
            for (Movie frozen : movieRepository.findByTitle("Frozen")) {
                System.out.println(frozen.toString());
            }
            System.out.println();

            // fetch movies by rated
            System.out.println("Movies found with findByRating('G'");
            System.out.println("---------------------------");
            System.out.println(movieRepository.findByRated("G").toString());
            System.out.println();

            // fetch movies by rated
            System.out.println("Movies found with findByGenreStartsWith('Animation'");
            System.out.println("---------------------------");
            movieRepository.findByGenreStartsWith("Animation").forEach(genres -> System.out.println(genres));
        };
    }
    **/
}

