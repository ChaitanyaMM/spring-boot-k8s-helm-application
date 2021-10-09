package com.practice.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/helm")
public class PrometheousController {

	@GetMapping("/sample")
	public String sample() {
		return "sample-helm-application!";
	}

}
