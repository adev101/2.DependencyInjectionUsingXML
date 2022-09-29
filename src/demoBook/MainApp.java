package demoBook;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		//load the spring config file
		// Step 2. Creating the container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("\\demoBook\\applicationContext.xml");
		
		//Step 3. retrieve bean from spring container
		book theBook = context.getBean("myBook", book.class); /// this mybook is bean id from xml file
		
		book theNewBook = context.getBean("myDiffBook", book.class); 
		
		//call methods on bean
		System.out.println(theBook.getBookName());
		
		System.out.println(theNewBook.getBookName());
		
		
		//call method of the dependency
		System.out.println(theBook.getThoughtOfTheDay());
		
		System.out.println(theNewBook.getThoughtOfTheDay());
		
		
		//close the context
		context.close();
	}

}

//****** Inversion of control process********
// using xml config files is legacy.
// java annotations
// java code

// Inversion of control is all about creating the object
//Steps
// 1. Create a Bean  -- Just a java object. When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans".
// 2. Create a Spring Container
// 3. Retrieve bean from Spring container



//Dependency injection is all about managing the dependencies of the objects already created
//****** DEPENDENCY INJECTION********
// THIS IS EXAMPLE OF CONSTRUCTOR INJECTION
//STEPS
//1. Define the dependency interface and class
//2. Create a constructor in your class for injection
//3. COnfigure the dependency injection in spring config file/ context file


