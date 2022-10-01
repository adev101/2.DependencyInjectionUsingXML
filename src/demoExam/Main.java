package demoExam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("\\demoExam\\applicationContext.xml");
		
		
		Exam obj= context.getBean("annual", Exam.class);
		
		System.out.println(obj.getExamResult());
		System.out.println(obj.getFuture());
		
		context.close();
		
		
	}

}
