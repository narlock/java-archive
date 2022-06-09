package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Staff;
import com.example.demo.service.StaffService;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
	private final StaffService staffService;
	
	public StaffRestController(StaffService staffService) {
		this.staffService = staffService;
	}
	
	@GetMapping
	public List<Staff> getAllRooms() {
		return staffService.getAllStaff();
	}
}
