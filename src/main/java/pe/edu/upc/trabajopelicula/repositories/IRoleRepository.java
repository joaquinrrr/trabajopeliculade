package pe.edu.upc.trabajopelicula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajopelicula.entities.Roles;

@Repository
public interface IRoleRepository extends JpaRepository<Roles,Long> {
}
