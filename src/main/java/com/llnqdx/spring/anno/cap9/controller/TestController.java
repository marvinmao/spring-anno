package com.llnqdx.spring.anno.cap9.controller;

import com.llnqdx.spring.anno.cap9.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class TestController {
	@Autowired
	private TestService testService;
}
