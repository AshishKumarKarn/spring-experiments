package karn.ashish.springexperiments.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@Getter
@Setter
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Team {

    @Id
    @GeneratedValue
    Long teamId;
    String name;
    String location;
    String mascotte;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    Set<Player> players;

    public Team(String name, String location, String mascotte, Set<Player> players) {
        this.name = name;
        this.location = location;
        this.mascotte = mascotte;
        this.players = players;
    }
}
