package com.example.DefectTrackers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DefectTrackers.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
	// Project findByProjectId(Long id);
}
