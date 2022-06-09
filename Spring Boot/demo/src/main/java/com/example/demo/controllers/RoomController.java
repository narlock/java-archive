package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Room;

@Controller
@RequestMapping("/rooms")
public class RoomController {
	
	//mock stuff
	private static final List<Room> rooms = new ArrayList<>();
	static {
		for(int i = 0; i < 10; i++) {
			rooms.add(new Room(i, "Room " + i, "R" + i, "Q"));
		}
	}
	
	@GetMapping
	public String getAllRooms(Model model) {
		model.addAttribute("rooms", rooms);
		return "rooms"; //name of the view that we want to resolve to
	}
	
}
