package Ipl.IPLTeams.cantroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlayersCantroller {

	
	@RequestMapping("/home")
	
	public String homepage() {
		
		return "homepage";
	}
	
	
}
