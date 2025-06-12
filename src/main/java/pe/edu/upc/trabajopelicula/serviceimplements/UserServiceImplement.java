package pe.edu.upc.trabajopelicula.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.trabajopelicula.entities.Roles;
import pe.edu.upc.trabajopelicula.entities.Users;
import pe.edu.upc.trabajopelicula.repositories.ICinemaRepository;
import pe.edu.upc.trabajopelicula.repositories.IRoleRepository;
import pe.edu.upc.trabajopelicula.repositories.IUserRepository;
import pe.edu.upc.trabajopelicula.serviceinterfaces.IUserInterface;

import java.util.List;

@Service
public class UserServiceImplement implements IUserInterface {
    @Autowired
    private IUserRepository uR;

    @Autowired
    private IRoleRepository rR;

    @Override
    @Transactional
    public Users insert(Users user) {
        // Guardar el usuario en la base de datos
        Users savedUser = uR.save(user);

        // Crear el rol y asociarlo al usuario recién creado
        Roles role = new Roles();
        role.setRol("CINEFILO"); // Rol predeterminado
        role.setUser(savedUser); // Asocia el usuario al rol
        rR.save(role); // Guarda el rol en la base de datos

        return savedUser;
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        // Eliminar los roles asociados al usuario
        List<Roles> roles = rR.findByUserId(id); // Suponiendo que hay un método en el repositorio para encontrar roles por usuario
        if (!roles.isEmpty()) {
            rR.deleteAll(roles); // Elimina todos los roles asociados
        }

        // Eliminar el usuario
        uR.deleteById(id);
    }

    @Override
    public void update(Users user) {
        uR.save(user);
    }

    @Override
    public Users listarId(Long id) {
        return uR.findById(id).orElse(new Users());
    }

    @Override
    public Users finduser(String username) {
        return uR.findByUsername(username);
    }
}
