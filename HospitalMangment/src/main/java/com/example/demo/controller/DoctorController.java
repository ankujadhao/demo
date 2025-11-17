package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DoctorController {

	@PostMapping("hospital/addDoctor")
	String addDoctor(@RequestBody Doctor d)
	{
	DoctorService ds= new DoctorService();
String msg=	ds.saveDoctorInDb(d);
		
		return msg;
		
		
		
		
	}
}
