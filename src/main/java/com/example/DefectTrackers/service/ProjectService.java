package com.example.DefectTrackers.service;

import java.util.List;


import com.example.DefectTrackers.entities.Project;


public interface ProjectService {
	Project saveProject(Project project);
	Project updateProject(Project project);
	void deleteProject(long projectId);
	List<Project> getAllProjects();
}
