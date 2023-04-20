package com.SpringRestResourceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRestResourceApp.model.Passanger;
import com.SpringRestResourceApp.model.Ticket;
import com.SpringRestResourceApp.service.PassangerServiceImpl;

@RestController
public class PassangerController {

	@Autowired
	private PassangerServiceImpl ps;

	@PostMapping(value = "/savePassanger", consumes = { "application/xml", "application/json" }, produces = {
			"application/xml", "application/json" })
	public ResponseEntity<Ticket> savePassanger(@RequestBody Passanger psg) {

		Passanger passanger = ps.savePassanger(psg);
		Ticket tik = ps.bookTicket(psg);
		return new ResponseEntity<Ticket>(tik, HttpStatus.CREATED);

	}
//	@PostMapping(value="/bookTicket",consumes = "application/json",produces = "application/json")
//	public ResponseEntity<Ticket>  bookTicket(@RequestBody Passanger psg) 
//	{
//		Ticket tik=ps.bookTicket(psg);
//		return new ResponseEntity<Ticket>(tik,HttpStatus.CREATED);
//}

}
