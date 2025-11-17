package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Appoiment;
import com.example.demo.service.AppoimentService;

@RestController
public class AppoimentCOntroller {

	@PostMapping("hospital/addAppoiment")
	String addAppoiment(@RequestBody Appoiment a) {

		AppoimentService as = new AppoimentService();
		String msg = as.saveAppoiument(a);

		return msg;

	}

}
