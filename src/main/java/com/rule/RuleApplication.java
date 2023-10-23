package com.rule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RuleApplication {

	@GetMapping("/")
	public String getMessage() {
		return "Rule Executed";
	}
	@PostMapping("/{ruleName}")
	public String getRuleName(@PathVariable String ruleName) {
		return "Rule executed is :"+ruleName;
	}
	public static void main(String[] args) {
		SpringApplication.run(RuleApplication.class, args);
	}

}
