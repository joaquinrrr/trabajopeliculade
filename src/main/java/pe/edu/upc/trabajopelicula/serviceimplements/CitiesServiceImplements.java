package pe.edu.upc.trabajopelicula.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajopelicula.entities.Cities;
import pe.edu.upc.trabajopelicula.serviceinterfaces.ICitiesInterface;

import java.io.Serial;
import java.util.List;

@Service
public class CitiesServiceImplements implements ICitiesInterface {
    @Override
    public void insert(Cities cities) {

    }

    @Override
    public List<Cities> list() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Cities cities) {

    }

    @Override
    public Cities listarId(int id) {
        return null;
    }
}
