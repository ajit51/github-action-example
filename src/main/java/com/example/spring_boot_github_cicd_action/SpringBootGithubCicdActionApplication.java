package com.example.spring_boot_github_cicd_action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGithubCicdActionApplication {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Github CICD Action Pipeline";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGithubCicdActionApplication.class, args);
    }

}
