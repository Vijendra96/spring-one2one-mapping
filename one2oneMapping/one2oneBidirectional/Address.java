package com.example.one2oneBidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Address {
	@Id
	private Integer empId;
	private String houseNo;
	private String streetName;
	private String city;
	@OneToOne
	@JsonIgnore
	private Employee employee;
	
}
