package JFS.BookShop;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class MyChoice implements MyFirstBookInterface {
	public void displayMyChoice() {
		System.out.println("My fav book");
		}
	@Override
	public void my1stBook() {
		System.out.println("im in interface implemented through MyFirstBookImpl Class");
	}


}
