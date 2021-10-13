package com.User.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.User.Dao.UserDao;
import com.User.Model.Flight;
import com.User.Model.Login;
import com.User.Model.TicketBooking;
import com.User.Model.TicketDetails;
@Service  
public class UserService {
	@Autowired  
	UserDao userDao;  
	public ResponseEntity<Login> login(Login login)
	{
		return userDao.login(login);
	}
	public ResponseEntity<List<Flight>> getAllFlight(String fromPlace, String toPlace)
	{
		return userDao.getAllFlight(fromPlace, toPlace);
	}
	public ResponseEntity<TicketBooking> flightBooking(int flightnumber,TicketDetails book)
	{
		return userDao.flightBooking(flightnumber, book);

	}
	public ResponseEntity<List<TicketBooking>> getBookedTicketsByPnr(int pnr)
	{
		return userDao.getBookedTicketsByPnr(pnr);
	}
	public ResponseEntity<List<TicketBooking>> viewHistory(String emailid)
	{
		return userDao.viewHistory(emailid);

	}
	public ResponseEntity<List<TicketBooking>> cancelFlight(int pnr)
	{
		return userDao.cancelFlight(pnr);
	}

}
