package com.User.Dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import com.User.Model.Flight;
import com.User.Model.Inventory;
import com.User.Model.Login;
import com.User.Model.TicketBooking;
import com.User.Model.TicketDetails;
import com.User.Repository.BookingRepository;
import com.User.Repository.FlightRepository;
import com.User.Repository.SearchRepository;
import com.User.Repository.UserRepository;
@Repository
public class UserDao {
	@Autowired  
	UserRepository userRepository; 
	@Autowired  
	FlightRepository flightRepository; 
	@Autowired  
	SearchRepository searchRepository;
	@Autowired  
	BookingRepository bookingRepository;
	public ResponseEntity<Login> login(Login login) {
		List<Login> loginuser = userRepository.findAll();
        for (Login user : loginuser) {
            if ((user.getUsername().equals(login.getUsername()))&&(user.getPassword().equals(login.getPassword()))) {
               
       		 return new ResponseEntity<>(HttpStatus.OK);
            }
        }
  		 return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
	public ResponseEntity< List<Flight>> getAllFlight(String fromPlace,String toPlace)	{  
		try {
	List<Flight> flight = new ArrayList<Flight>();  
		searchRepository.findByFromPlaceAndToPlace(fromPlace,toPlace);
	 if (flight.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(flight, HttpStatus.OK);
	} catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	public ResponseEntity< List<TicketBooking>> getBookedTicketsByPnr(int pnr)	{  
		try {
			List<TicketBooking> bookPnr = new ArrayList<TicketBooking>();  
			bookingRepository.findByPnr(pnr).forEach(bookPnr::add);  		

	 if (bookPnr.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(bookPnr, HttpStatus.OK);
	} catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	public ResponseEntity< List<TicketBooking>> viewHistory(String emailid)	{  
		try {
			List<TicketBooking> bookEmailid = new ArrayList<TicketBooking>();  
			bookingRepository.findByEmailid(emailid).forEach(bookEmailid::add);  		

	 if (bookEmailid.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(bookEmailid, HttpStatus.OK);
	} catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }


public ResponseEntity<TicketBooking> flightBooking(int flightnumber, TicketDetails book)	{  
		
		try {
		Inventory invento = new Inventory();
		TicketBooking bookFlight = new TicketBooking();
		Random rand = new Random(); 
		int newpnr = Math.abs(rand.nextInt());
        invento = flightRepository.findByFlightnumber(flightnumber);
			bookFlight.setUsername(book.getUsername());
			bookFlight.setEmailid(book.getEmailid());
			bookFlight.setTotalSeat(book.getTotalSeat());
            bookFlight.setMeal(book.getMeal());
			bookFlight.setFlightnumber(flightnumber);
			bookFlight.setAirlinename(invento.getAirlinename());
			bookFlight.setEndTimeStamp(invento.getEndTimeStamp());
			bookFlight.setStartTimeStamp(invento.getStartTimeStamp());
			bookFlight.setFromPlace(invento.getFromPlace());
			bookFlight.setToPlace(invento.getToPlace());
            bookFlight.setTicketCost(invento.getTicketCost());
            bookFlight.setTotalCost(invento.getTicketCost()*book.getTotalSeat());
            bookFlight.setPnr(newpnr);
			flightRepository.save(bookFlight);
			return new ResponseEntity<>(bookFlight, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
public ResponseEntity< List<TicketBooking>> cancelFlight(int pnr)	{  
	try {
		bookingRepository.deleteById(pnr);  		
      return new ResponseEntity<>(HttpStatus.OK);
} catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
