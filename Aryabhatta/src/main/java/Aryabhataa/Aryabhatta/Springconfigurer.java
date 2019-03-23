package Aryabhataa.Aryabhatta;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Aryabhataa.Aryabhatta")
public class Springconfigurer {
	@Bean
	public SwimInterfacer getSwimming() {
		coachFortune Myswmingcoach =new coachFortune();
		return  Myswmingcoach;
	}
	@Bean
	public Swiming swimcoach() {
		// TODO Auto-generated method stub
		return new Swiming(getSwimming());

	}

	
	
	

}
