package com.Admin.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.Admin.Model.Login;
import com.Admin.Model.Airline;
import com.Admin.Model.Inventory;
import com.Admin.Dao.AdminDao;
@Service
public class AdminService {
	@Autowired  
	AdminDao adminDao; 
	public ResponseEntity<Login> login(Login login)
	{
		return adminDao.login(login);
	}
	public ResponseEntity<List<Inventory>> addInventory(Inventory inventory)
	{
		return adminDao.addInventory(inventory);
	}
	public ResponseEntity<List<Inventory>> updateInventory(Inventory inventory)
	{
		return adminDao.updateInventory(inventory);
	}
	public ResponseEntity<List<Airline>> addAirline(Airline airline)
	{
		return adminDao.addAirline(airline);
	}
	public ResponseEntity<List<Airline>> blockAirline(int airlineid)
	{
		return adminDao.blockAirline(airlineid);
	}
}
