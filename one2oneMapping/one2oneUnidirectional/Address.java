package com.example.one2oneUnidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Address {
	@Id
	private Integer id;
	private String houseNo;
	private String streetName;
	private String city;
	@OneToOne
	private Student student;
	
}
