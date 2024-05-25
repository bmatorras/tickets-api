package codoacodo.ticketsapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String passport;
    private String email;
    private FlightDTO flight;

    public Ticket(String name, String email, String passport, FlightDTO flight) {
        this.name = name;
        this.email = email;
        this.passport = passport;
        this.flight = flight;
    }

}
