package com.duke.reactboot.Service;

import com.duke.reactboot.Entities.Movie;
import com.duke.reactboot.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {

        //System.out.println(movieRepository.findAll().toString());
        List<Movie> moviesName = movieRepository.findAll();
        System.out.println(moviesName.stream().map(movie -> movie.getId()).collect(Collectors.toList()));
        moviesName.stream().map(movie -> movie.getTitle().toString());
        return movieRepository.findAll();
    }

    public Optional<Movie> movieById(ObjectId id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> movieByImdbId(String id) {
        return movieRepository.findMovieByImdbId(id);
    }
}
