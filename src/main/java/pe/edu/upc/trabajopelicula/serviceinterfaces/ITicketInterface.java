package pe.edu.upc.trabajopelicula.serviceinterfaces;

import pe.edu.upc.trabajopelicula.dtos.TicketDTO;
import pe.edu.upc.trabajopelicula.entities.Rooms;
import pe.edu.upc.trabajopelicula.entities.Ticket;

import java.util.List;

public interface ITicketInterface {
    public void insert(Ticket ticket);
    public List<Ticket> list();
    public void delete(int id);
    public void update(Ticket tickets);
    /*TicketDTO getTicketById(Integer id);*/
    public Ticket listarId(int id);
}
