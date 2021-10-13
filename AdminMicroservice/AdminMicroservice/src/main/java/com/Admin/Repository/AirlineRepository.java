package com.Admin.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Admin.Model.Airline;
public interface AirlineRepository extends JpaRepository<Airline, Integer>  
{ 
	List<Airline> findByAirlinename(String airline);
}  

