package karn.ashish.springexperiments.controllers;

import karn.ashish.springexperiments.dao.TeamDao;
import karn.ashish.springexperiments.pojo.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v5")
public class TypeFive {
    @Autowired
    TeamDao teamDao;

    //http://localhost:8080/v5/team/Team01
    @RequestMapping("/team/{name}")
    public Team hiThere(@PathVariable String name){
        return teamDao.findByName(name);
    }
}
