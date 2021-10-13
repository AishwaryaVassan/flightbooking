package com.Admin.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Admin.Model.Airline;
import com.Admin.Model.Inventory;
import com.Admin.Model.Login;
import com.Admin.Service.AdminService;
@RestController
public class AdminController {
	@Autowired  
	AdminService adminService; 
	@PostMapping("/admin/login")
	public ResponseEntity<Login> login(@RequestBody Login login) {
		return adminService.login(login);
	}
	@PostMapping("/airline/inventory/add")  
	public ResponseEntity<List<Inventory>> addInventory(@RequestBody Inventory inventory)
	{
	   return adminService.addInventory(inventory);  
	} 
	@PutMapping("/airline/inventory/update")  
	public ResponseEntity<List<Inventory>> updateInventory(@RequestBody Inventory inventory)
	{
	   return adminService.updateInventory(inventory);  
	}  
	@PostMapping("/airline/addAirline")  
	public ResponseEntity<List<Airline>> addAirline(@RequestBody Airline airline)
	{
	   return adminService.addAirline(airline);  
	}
	@DeleteMapping("/airline/block/{airlineid}")  
	public ResponseEntity< List<Airline>> blockAirline(@PathVariable("airlineid") int airlineid)
	{  
	 return adminService.blockAirline(airlineid);  
	} 
}
