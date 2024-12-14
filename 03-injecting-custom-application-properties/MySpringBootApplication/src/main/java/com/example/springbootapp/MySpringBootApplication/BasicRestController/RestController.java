package com.example.springbootapp.MySpringBootApplication.BasicRestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    /*
    * injecting custom properties in application.properties file
    */

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teamDetails")
    public String getTeamDetails() {
        return ("Coach: " + coachName + " " + "Team: " + teamName);
    }
}