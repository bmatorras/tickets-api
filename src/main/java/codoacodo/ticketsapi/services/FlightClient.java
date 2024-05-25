package codoacodo.ticketsapi.services;

import codoacodo.ticketsapi.model.FlightDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "flight-server")
public interface FlightClient {
    @GetMapping("/flights")
    List<FlightDTO> getAllFlights();
}