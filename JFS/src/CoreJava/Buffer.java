package CoreJava;

public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(1, "world");
		System.out.println(sb);
		sb.replace(1, 3, "world");
		System.out.println(sb);

	}

}
