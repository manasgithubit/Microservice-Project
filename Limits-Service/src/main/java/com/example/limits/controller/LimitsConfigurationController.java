package com.example.limits.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limits.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

	@GetMapping("/limits")
	public LimitsConfiguration returnLimits()
	{
		return new LimitsConfiguration(1000, 99);
	}
}
