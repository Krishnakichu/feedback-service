package com.recruitment.feedback.feedbackservice.controller;

import java.util.Random;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recruitment.feedback.feedbackservice.models.Hotels;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/getAllItems")
	public Hotels getAllItems() {
	
		System.out.println("Welcome");
		Hotels hotels = new Hotels("TAJ", "5 Star", "Kochi", UUID.randomUUID());
		return hotels;
	}
	@GetMapping("/getdetailsofselectedhotel")
	public Hotels getdetailsofselectedhotel() {
	
		System.out.println("Welcome");
		Hotels hotels = new Hotels("Novotel", "5 Star", "Kochi", UUID.randomUUID());
		return hotels;
	}
}
