package com.nt.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.Service.BookingService;
import com.nt.request.Passenger;
import com.ntresponse.Ticket;

@RestController
public class BookingRestController {

	@Autowired
	private BookingService service;
	//method to book ticket(POST)
	@PostMapping(value = "/ticket",consumes = {"application/json"},
			                                                   produces =  {"application/json"}
	)
	public ResponseEntity<Ticket> ticketBooking(@RequestBody Passenger passenger)
	{
		System.out.println(passenger);
		Ticket ticket = service.bookTicket(passenger);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	//method to Get ticket(GET)
	@GetMapping(value = "/ticket/{ticketNumber}",produces = "application/json")
	public Ticket getTicketByNumber(@PathVariable Integer ticketNumber)
	{
		return service.getTicket(ticketNumber);
	}
}
