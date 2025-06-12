package pe.edu.upc.trabajopelicula.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajopelicula.entities.CinemaRooms;
import pe.edu.upc.trabajopelicula.serviceinterfaces.ICinemaRoomsInterface;

import java.util.List;

@Service
public class CinemaRoomsServiceImplement implements ICinemaRoomsInterface {
    @Override
    public void insert(CinemaRooms cinemaRooms) {

    }

    @Override
    public List<CinemaRooms> list() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(CinemaRooms cinemaRooms) {

    }

    @Override
    public CinemaRooms listarId(int id) {
        return null;
    }
}
