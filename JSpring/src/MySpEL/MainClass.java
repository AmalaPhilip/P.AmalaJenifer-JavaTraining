package MySpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpELConfig.xml");
		Book1 book1=(Book1)context.getBean("b1");
		System.out.println(book1);
		Book2 book2=(Book2)context.getBean("b2");
		System.out.println(book2);
			}

}
