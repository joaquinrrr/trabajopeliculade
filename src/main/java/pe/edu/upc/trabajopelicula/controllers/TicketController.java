package pe.edu.upc.trabajopelicula.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajopelicula.dtos.TicketDTO;
import pe.edu.upc.trabajopelicula.entities.Ticket;
import pe.edu.upc.trabajopelicula.serviceinterfaces.ITicketInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private ITicketInterface ticketInterface;

    @PostMapping("/Registro") //registrar
    public void registrar(@RequestBody TicketDTO a) {
        ModelMapper m = new ModelMapper();
        Ticket ch = m.map(a, Ticket.class);
        ticketInterface.insert(ch);
    }

    @GetMapping //listar
    public List<TicketDTO> list() {
        return ticketInterface.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, TicketDTO.class); //expresion lambda para la transformacion
        }).collect(Collectors.toList()); //lista de tipo Shoe
    }

    @PutMapping("/{id}") // actualizar
    public void actualizar(@PathVariable("id") Integer id, @RequestBody TicketDTO a) {
        ModelMapper m = new ModelMapper();
        Ticket ah = m.map(a, Ticket.class);
        ah.setId(id); // asegurarse de que el objeto tenga el mismo ID que el proporcionado en la URL
        ticketInterface.update(ah);
    }

    @DeleteMapping("/{id}") //reconozca parametros que estamos pasando
    public void eliminar(@PathVariable("id") Integer id){
        ticketInterface.delete(id);
    }

    @GetMapping("/{id}")
    public TicketDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        TicketDTO dto = m.map(ticketInterface.listarId(id), TicketDTO.class);
        return dto;
    }
}
