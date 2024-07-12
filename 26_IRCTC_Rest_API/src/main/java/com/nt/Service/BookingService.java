package com.nt.Service;

import com.nt.request.Passenger;
import com.ntresponse.Ticket;

public interface BookingService {

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);
}
