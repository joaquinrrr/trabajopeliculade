package pe.edu.upc.trabajopelicula.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajopelicula.entities.Rooms;
import pe.edu.upc.trabajopelicula.serviceinterfaces.IRoomsInterface;

import java.util.List;

@Service
public class RoomsServiceImplement implements IRoomsInterface {
    @Override
    public void insert(Rooms rooms) {

    }

    @Override
    public List<Rooms> list() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Rooms rooms) {

    }

    @Override
    public Rooms listarId(int id) {
        return null;
    }
}
