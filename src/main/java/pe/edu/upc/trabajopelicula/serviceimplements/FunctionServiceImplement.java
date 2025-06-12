package pe.edu.upc.trabajopelicula.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajopelicula.entities.Functions;
import pe.edu.upc.trabajopelicula.serviceinterfaces.ICinemaInterface;
import pe.edu.upc.trabajopelicula.serviceinterfaces.IFunctionsInterface;

import java.util.List;

@Service
public class FunctionServiceImplement implements IFunctionsInterface {
    @Override
    public void insert(Functions functions) {

    }

    @Override
    public List<Functions> list() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Functions functions) {

    }

    @Override
    public Functions listarId(int id) {
        return null;
    }
}
