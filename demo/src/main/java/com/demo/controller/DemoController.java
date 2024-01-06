package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	private DemoService ser;

	@RequestMapping("/add")
	public int addition() {
		
		int b=ser.add(1);
		System.out.println("Demo Methos");
		return 1;
	}
	public void sub() {
		
	}
}
