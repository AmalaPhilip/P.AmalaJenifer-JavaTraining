package MySpring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookStore implements InitializingBean,DisposableBean {
	
	public void sales() {
		System.out.println("In sales method");
	}
	@PostConstruct
	public void first() {
		System.out.println("bean instantiated....progess is in init method");
	}
	@PreDestroy
	public void last() {
		System.out.println("bean is no more nedded ... going to be destroyed");
	}
	
	@Override
	public void  afterPropertiesSet() throws  Exception{
		System.out.println("afterPropertiesSet");
	}
	
	@Override
	public void destroy () throws Exception {
		System.out.println("Destroy method from disposableBean");
	}
	
	
}