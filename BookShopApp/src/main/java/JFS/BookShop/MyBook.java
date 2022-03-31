package JFS.BookShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyBook {
@Autowired
@Qualifier("myChoice")
MyChoice myChoice;
@Autowired
MyFirstBookInterface myFirstBookInterface;
@Autowired

MyFirstBookImpl myFirstBookImpl;
	
	public MyChoice getMyChoise() {
		return myChoice;
	}
	public void setMyChoise(MyChoice myChoise) {
		this.myChoice = myChoise;
	}
	
	
	public void displayMyBook() {
		System.out.println("My Book name is OneThe");
		myChoice.displayMyChoice();
		myChoice.my1stBook();
		myFirstBookInterface.my1stBook();
		myFirstBookImpl.my1stBook();
		}
}