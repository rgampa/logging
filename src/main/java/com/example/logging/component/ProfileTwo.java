package com.example.logging.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.logging.api.ProfileInt;

@Component
@Profile("two")
public class ProfileTwo implements ProfileInt {
	public ProfileTwo() {
		System.out.println("Inside ProfileTwo");
	}
	
	@Override
	public String getName() {
		return "ProfileTwo";
	}
}
