package pe.edu.upc.trabajopelicula.serviceinterfaces;

import pe.edu.upc.trabajopelicula.entities.Users;

import java.util.List;

public interface IUserInterface {
    Users insert(Users user);
    public List<Users> list();
    public void delete(Long id);
    public void update(Users user);
    public Users listarId(Long id);
    public Users finduser(String username);
}
