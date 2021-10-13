package com.Admin.Model;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
@Entity   
@Table  
public class Airline  
{  
@Id  
@Column  
private int airlineid;  
@Column  
private String airlinename;
public int getAirlineid() {
	return airlineid;
}
public void setAirlineid(int airlineid) {
	this.airlineid = airlineid;
}
public String getAirlinename() {
	return airlinename;
}
public void setAirlinename(String airlinename) {
	this.airlinename = airlinename;
}  
}


