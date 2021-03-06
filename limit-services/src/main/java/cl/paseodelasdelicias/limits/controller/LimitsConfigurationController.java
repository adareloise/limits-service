package cl.paseodelasdelicias.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.paseodelasdelicias.limits.model.Configuration;
import cl.paseodelasdelicias.limits.model.LimitConfiguration;


@RestController
public class LimitsConfigurationController {
		
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retireveLimitConfiguration ( ) {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinum());
	}
}
