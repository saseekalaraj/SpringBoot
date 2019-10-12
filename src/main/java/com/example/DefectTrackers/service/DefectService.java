package com.example.DefectTrackers.service;

import java.util.List;

import com.example.DefectTrackers.entities.Defect;


public interface DefectService {
	Defect saveDefect(Defect defect);
	Defect updateDefect(Defect defect,long id);
	void deleteDefect(long id);
	List<Defect> getAllDefects();

}
