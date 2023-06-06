package com.bikkadit.IRCTC.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.IRCTC.entities.Ticket;

@RestController
public class TicketController {

	@GetMapping("/irctc/{personId}")
	public ResponseEntity<Ticket> getTicket(@PathVariable Long personId){
		
		Ticket t1=new Ticket(11l,"98555","Booked","2000rs",personId);
		
		
		return new ResponseEntity<Ticket>(t1,HttpStatus.CREATED);
	}
	
	
}
