package Ipl.IPLTeams.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Players {
	
	@Id
	private int id;
	private String pname;
	private int jrno;
	private int century;
	private String Playertype;
	private int wicktes;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getJrno() {
		return jrno;
	}
	public void setJrno(int jrno) {
		this.jrno = jrno;
	}
	public int getCentury() {
		return century;
	}
	public void setCentury(int century) {
		this.century = century;
	}
		
	public String getPlayertype() {
		return Playertype;
	}
	public void setPlayertype(String playertype) {
		Playertype = playertype;
	}
	public int getWicktes() {
		return wicktes;
	}
	public void setWicktes(int wicktes) {
		this.wicktes = wicktes;
	}
	
	@Override
	public String toString() {
		return "Players [id=" + id + ", pname=" + pname + ", jrno=" + jrno + ", century=" + century + ", Playertype="
				+ Playertype + ", wicktes=" + wicktes + "]";
	}
	
	
	public Players(int id, String pname, int jrno, int century, String playertype, int wicktes) {
		super();
		this.id = id;
		this.pname = pname;
		this.jrno = jrno;
		this.century = century;
		Playertype = playertype;
		this.wicktes = wicktes;
	}
	public Players() {
		super();
		
	}

}
