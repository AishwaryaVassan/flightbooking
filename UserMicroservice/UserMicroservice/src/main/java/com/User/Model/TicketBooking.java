package com.User.Model;
import java.sql.Timestamp;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
@Entity  
@Table  
public class TicketBooking  
{ 
@Id
@Column
private int pnr;
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
 private int ticketCost;  
@Column
 private String meal;
@Column
 private String username;
@Column
 private String emailid;
@Column
private int totalSeat;
@Column
 private int totalCost;
@Column
private String seatclass;
public int getPnr() {
	return pnr;
}
public void setPnr(int pnr) {
	this.pnr = pnr;
}
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
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public int getTotalSeat() {
	return totalSeat;
}
public void setTotalSeat(int totalSeat) {
	this.totalSeat = totalSeat;
}
public int getTotalCost() {
	return totalCost;
}
public void setTotalCost(int totalCost) {
	this.totalCost = totalCost;
}
public String getSeatclass() {
	return seatclass;
}
public void setSeatclass(String seatclass) {
	this.seatclass = seatclass;
}

}

