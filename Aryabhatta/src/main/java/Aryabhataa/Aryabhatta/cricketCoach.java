package Aryabhataa.Aryabhatta;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@Scope("prototype")
public class cricketCoach implements interfacerCoach{
	@Autowired
	private coachFortune Coachfortune;
	private String Name;
	private String Student;
	
	public String getName() {
		return Name;
	}

	
	public void setName(String name) {
		Name = name;
	}

	public String getStudent() {
		return Student;
	}

	
	public void setStudent(String student) {
		Student = student;
	}

	
	public cricketCoach(coachFortune coachfortune) {
		Coachfortune = coachfortune;
	}

	public String getDetails() {
		return "i love cricket";
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return "Try it "+Coachfortune.getFortune();
	}

	public String getCapName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTeamName() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@PostConstruct
	public void Startmethod() {
		System.out.println("inside start");
	}
	
	@PreDestroy
	public void Endmethod() {
		System.out.println("inside end method");
	}

}
