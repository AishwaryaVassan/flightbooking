package com.User.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.User.Model.TicketBooking;
public interface BookingRepository extends JpaRepository<TicketBooking, Integer>  
{
	List<TicketBooking> findByEmailid(String emailId);  
	List<TicketBooking> findByPnr(int pnr);  
}  