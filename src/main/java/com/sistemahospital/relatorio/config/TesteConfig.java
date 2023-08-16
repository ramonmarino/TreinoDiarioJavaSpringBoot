package com.sistemahospital.relatorio.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sistemahospital.relatorio.entities.medic;
import com.sistemahospital.relatorio.repositories.MedicRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{
	@Autowired
	private MedicRepository medicRepository;

	
	@Override
	public void run(String... args) throws Exception {
		medic u1 = new medic(null, "Laura", "maria@gmail.com", "988888888", "123456"); 
		medic u2 = new medic(null, "Ramon", "alex@gmail.com", "977777777", "123456"); 
		
		medicRepository.saveAll(Arrays.asList(u1,u2));
	}
	

}
