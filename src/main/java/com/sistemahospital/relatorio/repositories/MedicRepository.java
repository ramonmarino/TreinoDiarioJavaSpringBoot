package com.sistemahospital.relatorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemahospital.relatorio.entities.medic;

public interface MedicRepository extends JpaRepository<medic, Long> {
	
}
