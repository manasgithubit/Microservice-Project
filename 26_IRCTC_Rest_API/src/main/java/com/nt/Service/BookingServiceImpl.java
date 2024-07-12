package com.nt.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nt.request.Passenger;
import com.ntresponse.Ticket;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class BookingServiceImpl implements BookingService {

	private Map<Integer, Ticket> ticketsMap = new HashMap();
	private Integer ticketNumber = 1;
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		//Logic
		
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(550.00);
		t.setStatus("CONFIRMED");
		t.setTicketNumber(ticketNumber);
		ticketNumber++;
		
		ticketsMap.put(ticketNumber, t);
		
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
		if(ticketsMap.containsKey(ticketNumber))
		{
			return ticketsMap.get(ticketNumber);
		}
		return null;
	}
}
