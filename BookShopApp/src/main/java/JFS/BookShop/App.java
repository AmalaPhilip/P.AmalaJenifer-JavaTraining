package JFS.BookShop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        MyBook mybook=context.getBean(MyBook.class);
        mybook.displayMyBook();
      
//        ThrillerBook thrillerBook=context.getBean(ThrillerBook .class);
//        thrillerBook.artistCount(); 
//        mybook.displayMyBook();
        // BookStock bookstock=context.getBean(BookStock.class);
        //bookstock.stockdetails();
        //MyChoice myChoice=context.getBean(MyChoice.class);
        //myChoice.displayMyChoice();
        
        
        
    }
}
