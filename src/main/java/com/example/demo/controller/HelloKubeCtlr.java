package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloKubeCtlr {

	@GetMapping("/hello-kube")
	public String returnHello() {
		return "Hello from Kubernetes2";
	}
}
