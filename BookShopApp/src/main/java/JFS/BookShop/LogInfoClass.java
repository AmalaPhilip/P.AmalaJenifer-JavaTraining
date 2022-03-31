package JFS.BookShop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LogInfoClass {
	@Before(value= "execution(public void displayMyBook())")
	public void beforelogmethod() {
	System.out.println("Log Info: Method is inside my book");
	System.out.println("Log Info: Method name is DisplayMybook");
	System.out.println("Log Info: No argument list");
	}
	
	@After(value= "execution(public void displayMyBook())")
	public void afterlogmethod() {
	System.out.println("Log Info: Method is outside my book");
	System.out.println("Log Info: Method name is DisplayMybook");
	System.out.println("Log Info: No argument list");
	}
	
	@After(value= "execution(public void displayMyBook())")
	public void AfterdisplayMyBook(JoinPoint joinpoint ) {
	System.out.println("Log Info:" +joinpoint.getKind());
	System.out.println("Log Info:"+joinpoint.getArgs());
	System.out.println("Log Info:"+joinpoint.toLongString());
	System.out.println("Log Info:"+joinpoint.FIELD_GET);
	System.out.println("Log Info:"+joinpoint.getSignature());
	System.out.println("Log Info:"+joinpoint.getStaticPart());
	System.out.println("Log Info:"+joinpoint.getClass());
	System.out.println("Log Info:"+joinpoint.getTarget());
	System.out.println("Log Info:"+joinpoint.getThis());
	System.out.println("Log Info: No argument list");
	}
	
	
	
	
	//@AfterReturning(value= "execution(public Integer artistCount())",returning="artistCount")
//	public void AfterReturningArtistCount() {
//		System.out.println("Log Info: AterReturningArtistCount needs to be added");
//		System.out.println("Artist value returned successfully after executing");
//	}
//    @Around(value="execution(public void displayMyBook())")
//    public void ArounddisplayMyBook() {
//		System.out.println("log info : displaymethod is in progess");
//	}
	
	
//	@Pointcut("execution(* MyBook.*(..))")
//	public void selectOne() {
		
//	}
	
//	@Around("selectOne()")
//	public void AroundSelectOnePointcut() {
//		System.out.println("Log Info:......");
//	}
	
//	@Pointcut("execution(public * MyBook.*(..))")
//	public void logmethod() {
//		System.out.println("Log Info: Method is outside my book");
//	}
	

}
