package com.SpringRestResourceApp.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Ticket {

	private int pnr;
	private String ticketStatus;
	private double ticketprice;
}
