package codoacodo.ticketsapi.controller;

import codoacodo.ticketsapi.model.FlightDTO;
import codoacodo.ticketsapi.model.Ticket;
import codoacodo.ticketsapi.services.FlightClient;
import codoacodo.ticketsapi.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")

public class TicketController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private FlightClient flightClient;

    @GetMapping("")
    public List<Ticket> getAllTickets(){
        return ticketService.getAllTickets();
    }

    @GetMapping("/flights")
    public List<FlightDTO> getAllFlights(){
        return flightClient.getAllFlights();
    }

    @PostMapping("/add")
    public Ticket addTicket(@RequestBody Ticket ticket){
        return ticketService.addTicket(ticket);
    }
}
