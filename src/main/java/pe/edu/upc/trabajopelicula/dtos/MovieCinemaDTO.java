package pe.edu.upc.trabajopelicula.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import pe.edu.upc.trabajopelicula.entities.CinemaRooms;
import pe.edu.upc.trabajopelicula.entities.Movies;

import java.time.LocalDateTime;

@Getter
@Setter
public class MovieCinemaDTO {
    private int id;
    private LocalDateTime startinghour;
    private LocalDateTime endinghour;

    private CinemaRooms cinemarooms_id;

    private Movies movies_id;
}
