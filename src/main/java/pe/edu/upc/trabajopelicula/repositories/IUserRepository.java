package pe.edu.upc.trabajopelicula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajopelicula.entities.Users;

@Repository
public interface IUserRepository extends JpaRepository<Users,Long> {
    public Users findByUsername(String nameUser);
}
