package com.User.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.User.Model.Flight;
import com.User.Model.Login;
import com.User.Model.TicketBooking;
import com.User.Model.TicketDetails;
import com.User.Service.UserService;
@RestController
public class UserController {
	@Autowired  
	UserService userService; 
	@PostMapping("/user/login")
	public ResponseEntity<Login> login(@RequestBody Login login) {
		return userService.login(login);
	}
	@GetMapping("/search")  
	public ResponseEntity< List<Flight>> getAllFlight(@RequestParam(required = true) String fromPlace, @RequestParam String toPlace)
	{  
	 return userService.getAllFlight(fromPlace, toPlace); 
	}  
	@GetMapping("/ticket/{pnr}")  
	public ResponseEntity< List<TicketBooking>> getBookedTicketsByPnr(@PathVariable("pnr") int pnr) 
	{  
	 return userService.getBookedTicketsByPnr(pnr);  
	}  
	@GetMapping("/booking/history/{emailId}")  
	public ResponseEntity<List<TicketBooking>> viewHistory(@PathVariable("emailid") String emailid)   
	{  
	   return userService.viewHistory(emailid);  
	}  

@PostMapping("/booking/{flightnumber}")  
	public ResponseEntity<TicketBooking> bookFlight(@PathVariable("flightnumber") int flightnumber, @RequestBody (required = true) TicketDetails book  )   
	{  
	   return userService.flightBooking(flightnumber,book);  
	}  
@DeleteMapping("/booking/cancel/{pnr}")  
public ResponseEntity< List<TicketBooking>> cancelFlight(@PathVariable("pnr") int pnr)
{  
 return userService.cancelFlight(pnr);  
}  


}
