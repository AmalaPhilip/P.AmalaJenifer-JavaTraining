package JFS.BookShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ThrillerBook {
	
	@Autowired
	HorrorClass horrorClass;
	
	
	@Value("#{'Hectic ' + 'Day'}")
	public String mystring;
	
	public Integer artistCount() {
		Integer artist = 100;
		return artist;
	
	
	
	}

}
