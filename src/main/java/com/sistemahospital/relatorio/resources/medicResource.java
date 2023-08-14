package com.sistemahospital.relatorio.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemahospital.relatorio.entities.medic;

@RestController
@RequestMapping(value="/medic")
public class medicResource {
	
	@GetMapping
	public ResponseEntity<medic> findAll(){
		medic m = new medic(1L,"Pedro", "pedro@gmail.com", "45678901","12345");
		return ResponseEntity.ok().body(m); 
		
	}
	
	

}
