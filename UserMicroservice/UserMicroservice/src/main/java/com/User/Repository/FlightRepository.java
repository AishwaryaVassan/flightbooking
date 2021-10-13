package com.User.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.User.Model.Inventory;
import com.User.Model.TicketBooking;
public interface FlightRepository extends JpaRepository<Inventory, Integer>  
{ 
	Inventory findByFlightnumber(int flightnumber);
	TicketBooking save(TicketBooking bookFlight);
	List<Inventory> findByFromPlaceAndToPlace(String fromPlace, String toPlace);
}  

