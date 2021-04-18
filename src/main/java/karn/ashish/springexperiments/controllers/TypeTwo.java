package karn.ashish.springexperiments.controllers;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/v2")
@RestController //-> Controller + ResponseBody
public class TypeTwo {
    /**
     *
     *
     * Access via -> http://localhost:8080/v2/hello/{anyName}
     * */
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name;
    }
}
