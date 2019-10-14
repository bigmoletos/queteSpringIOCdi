/**
 * 
 *
 */
package com.wildcodeschool.myLibrary.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wildcodeschool.myLibrary.models.Book;
import com.wildcodeschool.myLibrary.models.FantasyBook;
import com.wildcodeschool.myLibrary.models.ScienceFictionBook;
import com.wildcodeschool.myLibrary.models.ServiceWhatever;

/**
 * @author franck Desmedt github/bigmoletos
 *
 */
public class App {
	// version avec IOC
	public void start() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath*:applicationContext.xml");

		Book myBook = context.getBean("theBook", Book.class);

		context.close();

		System.out.println("");
		System.out.println("******************");
		System.out.println(myBook.readExtract());
		System.out.println("******************");
		System.out.println(myBook.displayDrinkAdvice());
		System.out.println("******************");
	}

	public void startOLD2() {
		// the cosyDrinkAdvice is created
//			CosyDrinkAdvice cosyDrinkAdvice = new CosyDrinkAdvice();
//		avec la methode CosyDrinkAdvice on a plus besoin de context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath*:applicationContext.xml");
//        
		// the cosyDrinkAdvice object is passed to myBook constructor
		Book myBook = context.getBean("theBook", Book.class);
//		context.close();
		System.out.println("******************");
		System.out.println(myBook.readExtract());
		System.out.println("******************");
		Book myBook2 = context.getBean("theBook2", Book.class);
		context.close();
		System.out.println("******************");
		System.out.println(myBook2.readExtract());
		System.out.println("******************");

	}

//version sans injection de dependance ni IOC
	public void startOLD1() {
		Book myBook = new FantasyBook(null);
		System.out.println("");
		System.out.println("******************");
		System.out.println(myBook.readExtract());
		System.out.println("******************");
		Book myBook2 = new ScienceFictionBook(null);
		System.out.println("");
		System.out.println("******************");
		System.out.println(myBook2.readExtract());
		System.out.println("******************");

		FantasyBook myBook3 = new FantasyBook(null);
		System.out.println("");
		System.out.println("******************");
		System.out.println(myBook2.readExtract());
		System.out.println("******************");

		ServiceWhatever myServiceWhatever = new ServiceWhatever();
		myBook3.setServiceWhatever(myServiceWhatever);
		System.out.println(myBook3.sayWhatever());
	}
}
