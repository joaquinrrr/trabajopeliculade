package pe.edu.upc.trabajopelicula.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajopelicula.entities.MovieCinema;
import pe.edu.upc.trabajopelicula.serviceinterfaces.IMovieCinemaInterface;

import java.util.List;

@Service
public class MoviesCinemaServiceImplement implements IMovieCinemaInterface {
    @Override
    public void insert(MovieCinema movieCinema) {

    }

    @Override
    public List<MovieCinema> list() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(MovieCinema movieCinema) {

    }

    @Override
    public MovieCinema listarId(int id) {
        return null;
    }
}
