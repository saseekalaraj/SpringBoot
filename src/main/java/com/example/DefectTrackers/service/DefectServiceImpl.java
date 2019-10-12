package com.example.DefectTrackers.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DefectTrackers.entities.Defect;
import com.example.DefectTrackers.repository.DefectRepository;

@Service
public class DefectServiceImpl implements DefectService {

	@Autowired
	DefectRepository defectRepository;
	@Override
	public Defect saveDefect(Defect defect) {
		return defectRepository.save(defect);
	}

	@Override
	public Defect updateDefect(Defect defect, long id) {
		
		return defectRepository.save(defect);
	}

	@Override
	public void deleteDefect(long id) {
		defectRepository.deleteById(id);
		
	}

	@Override
	public List<Defect> getAllDefects() {
		return defectRepository.findAll();
	}

}
