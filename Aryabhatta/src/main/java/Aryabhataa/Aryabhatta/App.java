package Aryabhataa.Aryabhatta;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("Context.xml");
		AnnotationConfigApplicationContext cream = new AnnotationConfigApplicationContext(Springconfigurer.class);
		
		//interfacerCoach it = context.getBean("cricketCoach",cricketCoach.class);
		interfacerCoach it1= context.getBean("cricketCoach",interfacerCoach.class);
		//cream.refresh();
		//Swiming sw= cream.getBean("swimcoach",Swiming.class);
		
		//System.out.println(it.getDetails());
        //System.out.println(it.getFortune());
        //System.out.println(it.getTeamName());
        //System.out.println(it.getCapName());
        //System.out.println(it);
        //System.out.println(it1);
        //System.out.println(it1.getFortune());
        //System.out.println(it1.getDetails());

        //System.out.println(sw.getSwiming());
    }
}
