package JFS.BookShop;

import org.springframework.stereotype.Component;

@Component
public class MyFirstBookImpl implements MyFirstBookInterface {
	
	public void my1stBook() {
		System.out.println("im in interface implemented through MyFirstBookImpl Class");
	}

}


