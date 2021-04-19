package karn.ashish.springexperiments.dao;

import karn.ashish.springexperiments.pojo.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface TeamDao extends CrudRepository<Team, Long> {
    List<Team> findAll();
    Team findByName(String name);
}
