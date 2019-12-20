package com.example.logging.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.logging.api.ProfileInt;

@Component
@Profile("one")
public class ProfileOne implements ProfileInt {

	public ProfileOne() {
		System.out.println("Inside ProfileOne");
	}

	@Override
	public String getName() {
		return "ProfileOne";
	}
}
