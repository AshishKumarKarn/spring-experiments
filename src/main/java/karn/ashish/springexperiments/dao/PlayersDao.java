package karn.ashish.springexperiments.dao;

import karn.ashish.springexperiments.pojo.Player;
import karn.ashish.springexperiments.pojo.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

//http://localhost:8080/players
@RestResource(path = "players", rel = "players")
public interface PlayersDao extends CrudRepository<Player, Long> {
    List<Player> findAll();
    Team findByName(String name);
}
