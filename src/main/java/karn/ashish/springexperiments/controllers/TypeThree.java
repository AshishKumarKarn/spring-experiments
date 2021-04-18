package karn.ashish.springexperiments.controllers;

import karn.ashish.springexperiments.pojo.CustomRequest;
import karn.ashish.springexperiments.pojo.CustomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/v3")
public class TypeThree {

    //    http://localhost:8080/v3/hello/Ashish
    @GetMapping(value = "/hello/{name}", produces = "application/xml")
    public CustomResponse getDetails(@PathVariable String name) {
        CustomResponse customResponse = new CustomResponse(name, "Id124", new Date());
        return customResponse;
    }

    //    http://localhost:8080/v3/hello2/Ashish
    @GetMapping(value = "/hello2/{name}", produces = "application/json")
    public CustomResponse getDetailsInJson(@PathVariable String name) {
        CustomResponse customResponse = new CustomResponse(name, "Id124", new Date());
        return customResponse;
    }

    //    http://localhost:8080/v3/hello3/Ashish
    @GetMapping(value = "/hello3/{name}", produces = "application/xml")
    public ResponseEntity<CustomResponse> getDetailsInResponseEntity(@PathVariable String name) {
        CustomResponse customResponse = new CustomResponse(name, "Id124", new Date());
        return ResponseEntity.status(HttpStatus.OK).body(customResponse);
    }

    //    http://localhost:8080/v3/hello4/
    //content-type: application/xml

    //<customRequest>
    //    <dob>2021-04-18T20:32:49.501+05:30</dob>
    //    <id>Id124</id>
    //    <name>Ashish</name>
    //</customRequest>
    @PostMapping(value = "/hello4", produces = "application/json", consumes = "application/xml")
    public ResponseEntity<CustomResponse> detailsInUsingRequest(@RequestBody CustomRequest customRequest) {
        CustomResponse customResponse = new CustomResponse(customRequest.getName(), customRequest.getId(), new Date());
        return ResponseEntity.status(HttpStatus.OK).body(customResponse);
    }
}
