package practice.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCoachApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("CoachApplicationContext.xml");
		
		//Here Coach.class is passed to make sure the Typecast does not beak at runtime
		//myHockeyName is the id of the bean defined in application context xml
		
		Coach c1 = context.getBean("myHockeyCoach", Coach.class);
		System.out.println(c1.getDailyWorkOut());
		
		Coach c2 = context.getBean("myAthleticsCoach", Coach.class);
		System.out.println(c2.getDailyWorkOut());
		
		context.close();
	}

}
