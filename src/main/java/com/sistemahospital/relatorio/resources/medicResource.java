package com.sistemahospital.relatorio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemahospital.relatorio.entities.medic;
import com.sistemahospital.relatorio.services.medicService;

@RestController
@RequestMapping(value="/medic")
public class medicResource {
	
	
	@Autowired // injeção de dependência automatica 
	private medicService service;
	
	@GetMapping
	public ResponseEntity<List<medic>> findAll(){
		List<medic> list = service.findAll();
		return ResponseEntity.ok().body(list); 
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<medic> findById(@PathVariable Long id){
		medic obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	

}
