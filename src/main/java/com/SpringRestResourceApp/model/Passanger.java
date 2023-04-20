package com.SpringRestResourceApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Passanger {
	@Id
	private int id;
	private String fname;
	private String lname;
	private String p_from;
	private String p_to;
	private String p_doj;

}
