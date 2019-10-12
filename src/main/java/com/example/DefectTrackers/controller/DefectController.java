package com.example.DefectTrackers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DefectTrackers.entities.Defect;
import com.example.DefectTrackers.service.DefectService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class DefectController {
	@Autowired
	DefectService defectService;

	@PostMapping("/defect")
	public HttpStatus createNote(@RequestBody Defect defect) {
		defectService.saveDefect(defect);
		return HttpStatus.CREATED;
	}

	@GetMapping("/defect")
	public List<Defect> getDefect() {
		return defectService.getAllDefects();
	}

	@PutMapping("/defect/{id}")
	public ResponseEntity<Defect> updateDefect(@RequestBody Defect defect, @PathVariable long id) {

		defectService.updateDefect(defect, id);
		return new ResponseEntity<Defect>(defect, HttpStatus.NO_CONTENT);
	
	}

	@DeleteMapping("/defect/{id}")
	public ResponseEntity<Defect> deleteProject(@PathVariable long id) {
		defectService.deleteDefect(id);
		return new ResponseEntity<Defect>(HttpStatus.NO_CONTENT);
	}

}
