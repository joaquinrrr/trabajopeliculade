package pe.edu.upc.trabajopelicula.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajopelicula.entities.Users;
import pe.edu.upc.trabajopelicula.serviceinterfaces.IUserInterface;

import java.util.List;

@Service
public class UserServiceImplement implements IUserInterface {
    @Override
    public Users insert(Users user) {
        return null;
    }

    @Override
    public List<Users> list() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Users user) {

    }

    @Override
    public Users listarId(Long id) {
        return null;
    }

    @Override
    public Users finduser(String username) {
        return null;
    }
}
