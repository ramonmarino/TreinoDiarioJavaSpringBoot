package com.sistemahospital.relatorio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemahospital.relatorio.entities.medic;
import com.sistemahospital.relatorio.repositories.MedicRepository;


@Service
public class medicService {
	
	@Autowired
	private MedicRepository repository; 
	
	public List<medic> findAll(){
		return repository.findAll();
	}
	
	public medic findById(Long id) {
		Optional<medic> obj = repository.findById(id);
		return obj.get();
	}
}


