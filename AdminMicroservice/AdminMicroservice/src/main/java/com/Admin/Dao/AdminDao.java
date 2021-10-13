package com.Admin.Dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import com.Admin.Repository.AdminRepository;
import com.Admin.Repository.AirlineRepository;
import com.Admin.Repository.FlightRepository;
import com.Admin.Model.Airline;
import com.Admin.Model.Inventory;
import com.Admin.Model.Login;
@Repository
public class AdminDao {
	@Autowired  
	AdminRepository adminRepository; 
	@Autowired  
	AirlineRepository airlineRepository; 
	@Autowired  
	FlightRepository flightRepository;
	public ResponseEntity<Login> login(Login login) {
		List<Login> loginuser = adminRepository.findAll();
        for (Login user : loginuser) {
            if ((user.getUsername().equals(login.getUsername()))&&(user.getPassword().equals(login.getPassword()))) {
               
       		 return new ResponseEntity<>(HttpStatus.OK);
            }
        }
  		 return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
	public ResponseEntity<List<Inventory>> addInventory(Inventory inventory)	{ 
		try {
		List<Airline> airline = airlineRepository.findByAirlinename(inventory.getAirlinename());
		if(airline.size()>0) {
		flightRepository.save(inventory);
		 return new ResponseEntity<>(HttpStatus.OK);
		}
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	} catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	public ResponseEntity<List<Inventory>> updateInventory(Inventory inventory)	{ 
		try {
		List<Inventory> invento = flightRepository.findByFlightnumber(inventory.getFlightnumber());
		if(invento.size()>0) {
		flightRepository.save(inventory);
		 return new ResponseEntity<>(HttpStatus.OK);
		}
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	} catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	public ResponseEntity<List<Airline>> addAirline(Airline airline)	{ 
		try {
			airlineRepository.save(airline);
		 return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	public ResponseEntity< List<Airline>> blockAirline(int airlineid)	{  
		try {
			airlineRepository.deleteById(airlineid);  		

	      return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
}
