package pe.edu.upc.trabajopelicula.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajopelicula.dtos.MovieCinemaDTO;
import pe.edu.upc.trabajopelicula.entities.MovieCinema;
import pe.edu.upc.trabajopelicula.serviceinterfaces.IMovieCinemaInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/moviecinema")
public class MovieCinemaController {

    @Autowired
    private IMovieCinemaInterface movieCinemaInterface;

    @PostMapping("/Registro") //registrar
    public void registrar(@RequestBody MovieCinemaDTO a) {
        ModelMapper m = new ModelMapper();
        MovieCinema ch = m.map(a, MovieCinema.class);
        movieCinemaInterface.insert(ch);
    }

    @GetMapping //listar
    public List<MovieCinemaDTO> list() {
        return movieCinemaInterface.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, MovieCinemaDTO.class); //expresion lambda para la transformacion
        }).collect(Collectors.toList()); //lista de tipo Shoe
    }

    @PutMapping("/{id}") // actualizar
    public void actualizar(@PathVariable("id") Integer id, @RequestBody MovieCinemaDTO a) {
        ModelMapper m = new ModelMapper();
        MovieCinema ah = m.map(a, MovieCinema.class);
        ah.setId(id); // asegurarse de que el objeto tenga el mismo ID que el proporcionado en la URL
        movieCinemaInterface.update(ah);
    }

    @DeleteMapping("/{id}") //reconozca parametros que estamos pasando
    public void eliminar(@PathVariable("id") Integer id){
        movieCinemaInterface.delete(id);
    }

    @GetMapping("/{id}")
    public MovieCinemaDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        MovieCinemaDTO dto = m.map(movieCinemaInterface.listarId(id), MovieCinemaDTO.class);
        return dto;
    }
}
