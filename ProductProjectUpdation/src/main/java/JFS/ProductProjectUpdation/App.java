package JFS.ProductProjectUpdation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import JFS.ProductProjectUpdationView.ProductView;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
     	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
     	ProductView productView= context.getBean(ProductView.class);
    	//productView.initial();
    	productView.display();
    	
    	//ProductView obj=new ProductView();
    	//obj.display();
    	}
}
