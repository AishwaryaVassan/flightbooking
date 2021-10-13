package com.Admin.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Admin.Model.Inventory;
public interface FlightRepository extends JpaRepository<Inventory, Integer>  
{ 
	List<Inventory> findByFlightnumber(int flightnumber);
}  

