package karn.ashish.springexperiments.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/v4")
public class TypeFour {

    //localhost:8080/v4/hello/Ashish
    //<!--		<dependency>-->
    //<!--			<groupId>org.springframework.boot</groupId>-->
    //<!--			<artifactId>spring-boot-starter-thymeleaf</artifactId>-->
    //<!--		</dependency>-->
    @GetMapping("/hello/{name}")
    public String getViewForHello(Map map, @PathVariable String name) {
        map.put("name", name);
        return "hello";
    }


}
