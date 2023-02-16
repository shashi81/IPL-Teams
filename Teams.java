package Ipl.IPLTeams.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Teams {

	@Id
	private int tid;
	private String teamname;
	@OneToMany (targetEntity = Players.class,cascade = CascadeType.ALL)
	@JoinColumn(name="tid")
	private List<Players> players;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public List<Players> getPlayers() {
		return players;
	}
	public void setPlayers(List<Players> players) {
		this.players = players;
	}
	public Teams() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teams(int tid, String teamname, List<Players> players) {
		super();
		this.tid = tid;
		this.teamname = teamname;
		this.players = players;
	}
	
	
	
	@Override
	public String toString() {
		return "Teams [tid=" + tid + ", teamname=" + teamname + ", players=" + players + "]";
	}
	
	
	
}
