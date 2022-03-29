package com.example.one2oneBidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Employee {
	@Id
	private Integer empId;
	private String name;
	private Integer age;
	private String email;
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private Address address;
}
