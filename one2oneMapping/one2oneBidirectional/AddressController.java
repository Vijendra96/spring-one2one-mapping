package com.example.one2oneBidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AddressController {
	@Autowired
	private AddressRepository addressRepository;
	
	@PostMapping
	public ResponseEntity<Address> save(@RequestBody Address address)
	{
		addressRepository.save(address);
		return ResponseEntity.ok(address);
	}
}
