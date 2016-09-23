package io.pivotal.repositories;

import io.pivotal.domain.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {

    List<Movie> findByTitle(String title);

    List<Movie> findByRated(String rated);

    List<Movie> findByGenreStartsWith(String genre);

}
