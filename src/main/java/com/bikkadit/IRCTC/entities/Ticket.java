package com.bikkadit.IRCTC.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
	
	private Long ticketId;
	private String pnr;
	private String status;
	private String price;
	private Long personId;
	
}
