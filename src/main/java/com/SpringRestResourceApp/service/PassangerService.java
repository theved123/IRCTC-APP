package com.SpringRestResourceApp.service;

import com.SpringRestResourceApp.model.Passanger;
import com.SpringRestResourceApp.model.Ticket;

public interface PassangerService {
	public Passanger savePassanger(Passanger psg);
	public Ticket bookTicket(Passanger psg);
}
