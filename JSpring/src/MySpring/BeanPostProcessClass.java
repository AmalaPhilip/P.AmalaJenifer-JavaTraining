package MySpring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import java.lang.String;

public class BeanPostProcessClass implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object arg0,String arg1)throws BeansException {
		System.out.println("Before"+arg1);
		return arg0;
	}
	public Object postProcessAfterInitialization(Object arg0,String arg1)throws BeansException {
		System.out.println("After"+arg1);
		return arg0;
	}

}
