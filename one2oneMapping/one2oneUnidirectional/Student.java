package com.example.one2oneUnidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Student {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
}
