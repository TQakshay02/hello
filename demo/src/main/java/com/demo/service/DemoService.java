package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public int add(int a) {
		int c=5+a;
		return c;
	}
}
