package karn.ashish.springexperiments.dao;

import karn.ashish.springexperiments.pojo.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

//http://localhost:8080/teams
@RestResource(path = "teams", rel = "teams")
public interface TeamDao extends CrudRepository<Team, Long> {
    List<Team> findAll();
    Team findByName(String name);
}
