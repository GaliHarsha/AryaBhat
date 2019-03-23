package Aryabhataa.Aryabhatta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class footballCoach implements interfacerCoach {
	
	private coachFortune CoachFortune;
	private String teamName;
	private String capName;
	
	public footballCoach() {
	}

	
	public String getTeamName() {
		return teamName;
	}



	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getCapName() {
		return capName;
	}



	public void setCapName(String capName) {
		this.capName = capName;
		System.out.println("Tricky pots"+CoachFortune.getFortune());
	}


	public String getDetails() {
		return "Start practiceing it morning 4:00AM";
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCoachFortune(coachFortune coachFortune) {
		CoachFortune = coachFortune;
		System.out.println("Tricky pots"+CoachFortune.getFortune());
	}
	
	public void startMethod() {
		System.out.println("initilize during start up");
	}
	
	public String endMethod() {
		return "Kill the program";
	}


	public void Startmethod() {
		// TODO Auto-generated method stub
		
	}
	

}
