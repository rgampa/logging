package com.example.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.logging.api.ProfileInt;

@RestController
public class LoggingController {
	
	private static final Logger LOG = LoggerFactory.getLogger(LoggingController.class);
	
	@Autowired
	private ProfileInt profile;

	@RequestMapping("/logging")
    public String greeting() {
		LOG.info("inside logging()");
		
        return profile.getName();
    }
}
