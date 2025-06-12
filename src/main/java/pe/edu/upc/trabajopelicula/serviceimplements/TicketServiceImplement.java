package pe.edu.upc.trabajopelicula.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajopelicula.dtos.TicketDTO;
import pe.edu.upc.trabajopelicula.entities.Ticket;
import pe.edu.upc.trabajopelicula.serviceinterfaces.ITicketInterface;

import java.util.List;

@Service
public class TicketServiceImplement implements ITicketInterface {
    @Override
    public Ticket insert(Ticket tickets) {
        return null;
    }

    @Override
    public List<Ticket> list() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Ticket tickets) {

    }

    @Override
    public TicketDTO getTicketById(Integer id) {
        return null;
    }

    @Override
    public Ticket listarId(int id) {
        return null;
    }
}
