package com.example.DefectTrackers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DefectTrackers.entities.Defect;

@Repository
public interface DefectRepository extends JpaRepository<Defect, Long> {
	// Defect findDefectById(Long id);
}
