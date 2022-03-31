package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/user")
public class ServiceControllerForFeign {
	
	@GetMapping("/name")
	public String getName() {
		return "Amala";
	}
	@GetMapping("/dob")
	public String DOB() {
		return "09-08-2001";
	}
	@GetMapping("/place")
	public String Place() {
		return "Chennai";
	}
	

}
