package com.User.Repository;
import java.util.List;
import com.User.Model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SearchRepository extends JpaRepository<Flight, Integer> 
{
List<Flight> findByFromPlaceAndToPlace(String fromPlace, String toPlace);
}  

