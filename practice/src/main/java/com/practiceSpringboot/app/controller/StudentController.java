package com.practiceSpringboot.app.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/v2/practice/")
public class StudentController {
	
	List<String> list = List.of("bhaskar","nayak","aarush");
	@GetMapping("getStudents")
	public List<String> getStudent() {
		List<String> newList =list.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(newList);
		return newList;
	}
}
