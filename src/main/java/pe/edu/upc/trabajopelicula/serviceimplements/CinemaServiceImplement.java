package pe.edu.upc.trabajopelicula.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajopelicula.entities.Cinema;
import pe.edu.upc.trabajopelicula.serviceinterfaces.ICinemaInterface;

import java.util.List;

@Service
public class CinemaServiceImplement implements ICinemaInterface {
    @Override
    public void insert(Cinema cinema) {

    }

    @Override
    public List<Cinema> list() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Cinema cinema) {

    }

    @Override
    public Cinema listarId(int id) {
        return null;
    }
}
