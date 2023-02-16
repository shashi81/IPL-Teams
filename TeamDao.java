package Ipl.IPLTeams.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Ipl.IPLTeams.entity.Players;
import Ipl.IPLTeams.entity.Teams;

@Repository
public class TeamDao {
	
	@Autowired 
	SessionFactory sf;

	// it gives the all player and their team name
	public List<Teams> GetAllTeams() 
	{
	Session session =	sf.openSession();
	Criteria cr = session.createCriteria(Teams.class);
	List<Teams> teamlist = cr.list();
	return teamlist;
	}
	

	// player add into team with the help of pid(players team id)
	public String addnewplayer(Players player ,int tid)
	{
	Session session =	sf.openSession();
	Teams team = session.load(Teams.class, tid);
	List<Players> players = team.getPlayers();
	 Transaction tra = session.beginTransaction();
	  players.add(player);
	 tra.commit();
	 return ("Player Addaded into Team where Team id = " + tid );	
	}


	public Players playerbyid(int id) 
	{
	Session se =	sf.openSession();
	Transaction tr = se.beginTransaction();
	Players pl =se.get(Players.class, id);
	//se.close();
	tr.commit();
	return  pl;
	}
	
	// id is based on index basis for every tid.
 public Players withteamplayer(int tid , int id)
 {
	 Session sen = 	sf.openSession();
	sen.beginTransaction();
	Teams team = sen.get(Teams.class, tid);
	Players player = (Players) team.getPlayers();
	//player.getId()
	return player;
	
	
 }
 public Teams getteamandplayer(int tid) 
 {
	 Session sesion = sf.openSession();
	 Transaction tr = sesion.beginTransaction();
	Teams team  =  sesion.get(Teams.class, tid);
	//team.getPlayers();
	tr.commit();
	return team;
 }
 
 
 public List<Players> compareWicket(int wik) 
 {
	 		Session session = sf.openSession();
	 	 	Criteria cr = session.createCriteria(Players.class);
		 cr.add(Restrictions.ge("wicktes", wik));
		List<Players> pl = cr.list();
  	 	return pl;
  
 }
 public List<Players> CenturyBetween(int min , int max)
 {
	   Session session = sf.openSession();
	  Criteria cr = session.createCriteria(Players.class);
	  cr.add(Restrictions.between("century", min, max));
	List<Players> pl =  cr.list();
	return pl;
 }
 public List<Players> maxWickets()
 {
	   Session session = sf.openSession();
	 Criteria cr =  session.createCriteria(Players.class);
	 cr.setProjection(Projections.max("wickets"));
	  List<Players> pl = cr.list();
	  return pl;
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	

}
