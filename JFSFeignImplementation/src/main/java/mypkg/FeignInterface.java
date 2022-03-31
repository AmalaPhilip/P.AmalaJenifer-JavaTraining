package mypkg;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feignDemo",url="http://localhost:8080")
public interface FeignInterface {
	
	@GetMapping("/name")
	String getName();
	
	@GetMapping("/dob")
	String dob();
	
	@GetMapping("/place")
	String place();

}
