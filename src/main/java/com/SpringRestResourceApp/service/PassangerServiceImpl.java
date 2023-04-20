package com.SpringRestResourceApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.SpringRestResourceApp.model.Passanger;
import com.SpringRestResourceApp.model.Ticket;
import com.SpringRestResourceApp.repository.PassangerRepository;

@Service
public class PassangerServiceImpl implements PassangerService {

	@Autowired
	private PassangerRepository passangerRepository;

	public Passanger savePassanger(Passanger psg) {
		Passanger save = passangerRepository.save(psg);
		return save;
	}

	public Ticket bookTicket(Passanger psg) {

		if (psg == null) {
			return null;

		} else {
	
		//Passanger findBy=passangerRepository.findBy.get();
		
		
			Ticket t = new Ticket();
			t.setPnr(101);
			t.setTicketStatus("Confirmed");
			t.setTicketprice(150.00);
			return t;

		}

	}

	
		
	
}