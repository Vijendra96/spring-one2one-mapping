package com.example.one2oneUnidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("address")
public class AddressController {

	@Autowired
	private AddressRepository addressRepository;
	@RequestMapping
	public ResponseEntity<Address> save(@RequestBody Address address)
	{
		addressRepository.save(address);
		return ResponseEntity.ok(address);
	}
}
