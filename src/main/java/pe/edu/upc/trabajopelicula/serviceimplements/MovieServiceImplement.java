package pe.edu.upc.trabajopelicula.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajopelicula.entities.Movies;
import pe.edu.upc.trabajopelicula.serviceinterfaces.IMoviesInterface;

import java.util.List;

@Service
public class MovieServiceImplement  implements IMoviesInterface {
    @Override
    public void insert(Movies movies) {

    }

    @Override
    public List<Movies> list() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Movies movies) {

    }

    @Override
    public Movies listarId(int id) {
        return null;
    }
}
