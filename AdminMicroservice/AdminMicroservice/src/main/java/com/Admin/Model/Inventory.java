package com.Admin.Model;
import java.sql.Timestamp;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
@Entity  
@Table  
public class Inventory  
{  
@Id  
@Column  
private int flightnumber;  
@Column  
private String airlinename;  
@Column  
 private String fromPlace;  
@Column  
private String toPlace;  
@Column  
 private Timestamp startTimeStamp;
@Column  
 private Timestamp endTimeStamp;  
@Column  
private int businessSeat;
@Column  
private int nBusinessSeat;  
@Column  
 private int ticketCost;  
@Column
private String meal;
public int getFlightnumber() {
	return flightnumber;
}
public void setFlightnumber(int flightnumber) {
	this.flightnumber = flightnumber;
}
public String getAirlinename() {
	return airlinename;
}
public void setAirlinename(String airlinename) {
	this.airlinename = airlinename;
}
public String getFromPlace() {
	return fromPlace;
}
public void setFromPlace(String fromPlace) {
	this.fromPlace = fromPlace;
}
public String getToPlace() {
	return toPlace;
}
public void setToPlace(String toPlace) {
	this.toPlace = toPlace;
}
public Timestamp getStartTimeStamp() {
	return startTimeStamp;
}
public void setStartTimeStamp(Timestamp startTimeStamp) {
	this.startTimeStamp = startTimeStamp;
}
public Timestamp getEndTimeStamp() {
	return endTimeStamp;
}
public void setEndTimeStamp(Timestamp endTimeStamp) {
	this.endTimeStamp = endTimeStamp;
}
public int getBusinessSeat() {
	return businessSeat;
}
public void setBusinessSeat(int businessSeat) {
	this.businessSeat = businessSeat;
}
public int getnBusinessSeat() {
	return nBusinessSeat;
}
public void setnBusinessSeat(int nBusinessSeat) {
	this.nBusinessSeat = nBusinessSeat;
}
public int getTicketCost() {
	return ticketCost;
}
public void setTicketCost(int ticketCost) {
	this.ticketCost = ticketCost;
}
public String getMeal() {
	return meal;
}
public void setMeal(String meal) {
	this.meal = meal;
}


}


