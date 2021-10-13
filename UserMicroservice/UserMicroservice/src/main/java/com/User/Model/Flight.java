package com.User.Model;
import java.sql.Timestamp;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
@Entity  
@Table  
public class Flight  
{ 
@Id
@Column
private int flightid;
  @Column  
 private int flightnumber;  
  @Column  
  private String flightname;
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
 private int ticketCost;  
@Column
 private String meal;
@Column
private int totalSeat;
@Column
private String seatclass;
public int getFlightid() {
	return flightid;
}
public void setFlightid(int flightid) {
	this.flightid = flightid;
}
public int getFlightnumber() {
	return flightnumber;
}
public void setFlightnumber(int flightnumber) {
	this.flightnumber = flightnumber;
}
public String getFlightname() {
	return flightname;
}
public void setFlightname(String flightname) {
	this.flightname = flightname;
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
public int getTotalSeat() {
	return totalSeat;
}
public void setTotalSeat(int totalSeat) {
	this.totalSeat = totalSeat;
}
public String getSeatclass() {
	return seatclass;
}
public void setSeatclass(String seatclass) {
	this.seatclass = seatclass;
}

}


