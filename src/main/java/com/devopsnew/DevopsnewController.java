package com.devopsnew;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsnewController {

	

	@GetMapping (value ="/getword")
	public String getword() {
		return "hellow world";
	}}
