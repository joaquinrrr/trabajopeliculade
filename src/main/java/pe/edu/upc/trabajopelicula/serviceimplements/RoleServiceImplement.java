package pe.edu.upc.trabajopelicula.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajopelicula.entities.Roles;
import pe.edu.upc.trabajopelicula.serviceinterfaces.IRoleInterface;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleInterface {
    @Override
    public void insert(Roles roles) {
        
    }

    @Override
    public List<Roles> list() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Roles roles) {

    }

    @Override
    public Roles listarId(Long id) {
        return null;
    }
}
