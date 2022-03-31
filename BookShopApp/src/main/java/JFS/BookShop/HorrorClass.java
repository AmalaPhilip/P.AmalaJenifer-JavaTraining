package JFS.BookShop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HorrorClass {
	public int getMb() {
		return mb;
	}
	public void setMb(int mb) {
		this.mb=mb;
		
	}
	
	@Value("#{20+1}")
	public int mb;
	
	@Value("hi")
	public String str;

}
