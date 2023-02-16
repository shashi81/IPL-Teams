package Ipl.IPLTeams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ipl.IPLTeams.dao.TeamDao;
import Ipl.IPLTeams.entity.Players;
import Ipl.IPLTeams.entity.Teams;

@Service
public class TeamService {

	@Autowired
	TeamDao td;
	
	public List<Teams> GetAllTeams()
	{
			return td.GetAllTeams();
	}

	public String  addnewplayer(Players player, int tid)
	{
		return td.addnewplayer(player, tid);
	}
	
	public Players playerbyid(int id) 
	{
		return td.playerbyid(id);
	}
	
	public Players withteamplayer(int tid, int id)
	{
		return td.withteamplayer(tid, id);
	}
	
	public Teams getteamandplayer(int tid)
	{
		return td.getteamandplayer(tid);
	}
	
	public List<Players> compareWicket(int wik) 
	{
		return td.compareWicket(wik);
	}
	
	public List<Players> CenturyBetween(int min ,int max)
	{
		return td.CenturyBetween(min, max);
	}
	public List<Players> maxWickets()
	{
	//List<Players> pl =	td.maxWickets();
	//int player =  ((Players) pl).getWicktes();
	return td.maxWickets();
	  		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
