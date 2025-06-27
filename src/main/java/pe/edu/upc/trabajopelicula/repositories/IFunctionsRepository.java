package pe.edu.upc.trabajopelicula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajopelicula.entities.Functions;

import java.util.List;

@Repository
public interface IFunctionsRepository extends JpaRepository<Functions,Integer> {
    //List<Functions> findByUser_Id(Long userId);  // Cambiado 'userId' por 'user_Id'
}
