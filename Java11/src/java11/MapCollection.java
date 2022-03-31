package java11;

import java.util.Map;
import java.util.HashMap;

public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(11,"Amala");
		map1.put(12,"Jenifer");
		for(Map.Entry m:map1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		map1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);  
	}

}
