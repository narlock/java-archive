package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.models.Position;
import com.example.demo.models.Staff;

@Service
public class StaffService {
	private static final List<Staff> staff = new ArrayList<>();
	
	static {
		staff.add(new Staff(UUID.randomUUID().toString(), "Anthony", "Narlock", Position.INTERN));
		staff.add(new Staff(UUID.randomUUID().toString(), "Tony", "Narlock", Position.FRONTEND_DEV));
		staff.add(new Staff(UUID.randomUUID().toString(), "Antonio", "Narlock", Position.BACKEND_DEV));
		staff.add(new Staff(UUID.randomUUID().toString(), "Anton", "Narlo", Position.MANAGER));
	}
	
	public List<Staff> getAllStaff() { return staff; }
}
