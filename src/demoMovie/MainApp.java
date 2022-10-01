package demoMovie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("\\demoMovie\\applicationContext.xml");
		
		Movie obj = context.getBean("topgun", Movie.class);
		
		System.out.println(obj.movieCount());
		System.out.println(obj.getRating());
		
		context.close();

	}

}
