package karn.ashish.springexperiments;

import karn.ashish.springexperiments.dao.TeamDao;
import karn.ashish.springexperiments.pojo.Player;
import karn.ashish.springexperiments.pojo.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringExperimentsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringExperimentsApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringExperimentsApplication.class);
	}

	@Autowired
	TeamDao teamDao;
	@PostConstruct
	public void init(){
		Set<Player> playerSet = new HashSet<>();
		playerSet.add(new Player("Ashish Karn","pitcher"));
		playerSet.add(new Player("Aditya Karn", "shortstop"));
		Team team= new Team("Team01", "Pune", "abc",playerSet);
		teamDao.save(team);
	}

}
