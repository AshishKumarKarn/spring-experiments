package karn.ashish.springexperiments.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/v1")
@Controller
public class TypeOne {

    /**
     *
     *
     * Access via -> http://localhost:8080/v1/hello/{anyName}
     * */
    @GetMapping("/hello/{name}")
    public @ResponseBody String sayHello(@PathVariable String name) {
        return "Hello " + name;
    }

}
