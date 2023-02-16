package Ipl.IPLTeams.cantroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Ipl.IPLTeams.entity.Players;
import Ipl.IPLTeams.entity.Teams;
import Ipl.IPLTeams.service.TeamService;

@RestController 

public class TeamCantroller {
	
	@Autowired
	TeamService ts;
	//get all player
	@GetMapping ("/GetAllTeams")
	public List<Teams> GetAllTeams()
	{
		return ts.GetAllTeams();
	}
	
	//add new player
	@PutMapping ("/newplayer/{tid}")
	public String addnewplayer(@RequestBody Players player ,@PathVariable int tid ) 
	{
	return ts.addnewplayer(player, tid);	
	}
	
	// get particular player information
	@RequestMapping ("/get/{id}")
	public Players playerbyid(@PathVariable int id) {
		return ts.playerbyid(id);
	}
	
	@GetMapping ("withteamplayer/{tid}")
	public Players withteamplayer(@PathVariable int tid, @RequestBody int id)
	{
		return ts.withteamplayer(tid, id);
	}
	@GetMapping ("getteamandplayer/{tid}")
	public Teams getteamandplayer(@PathVariable int tid)
	{
		return ts.getteamandplayer(tid);
	}
	@GetMapping ("compareWicket/{wik}")
	public List<Players> compareWicket(@PathVariable int wik) {
		return ts.compareWicket(wik);
	}
	@GetMapping ("CenturyBetween/{min}/{max}")
	public List<Players> CenturyBetween(@PathVariable int min ,@PathVariable int max){
		return ts.CenturyBetween(min, max);
	}
	@GetMapping ("maxWickets")
	public List<Players>  maxWickets()
	{
		return ts.maxWickets();
	}
	
	
	
	
}
