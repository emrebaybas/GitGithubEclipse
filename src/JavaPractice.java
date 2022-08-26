import java.util.ArrayList;
import java.util.List;

public class JavaPractice {

	

	public static void main(String[] args) {

		byte a=1;
		short b=12;
		int c=1245;
		long d = 1231421312;
		float f=3;
		double g=4;
		boolean h=true;
		char i='a';
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(i);
		
		String x="emre";
		String y="        Emre Baybas     ";
		
		System.out.println(x.equals(y));
		System.out.println(x.equalsIgnoreCase(y));
		System.out.println(x.toUpperCase());
		System.out.println(y.toLowerCase());
		System.out.println(x.equals(y.toLowerCase()));
		System.out.println(x.length());
		System.out.println(x.charAt(1));
		System.out.println(x.endsWith("re"));
		System.out.println(x.startsWith("em"));
		
		System.out.println(y.trim());
		System.out.println(y.replace(" ", ""));
		
		StringBuilder s=new StringBuilder(x);
		System.out.println(s);
		
		s.append("baybas");
		System.out.println(s);
		
		s.append("123");
		System.out.println(s);
		
		System.out.println(s.reverse());
		
		String s1=s.toString();
		
		System.out.println(s1);
		System.out.println(s1.length());
		
		System.out.println(s.replace(0, 3, "XYZ"));
		
		

	}
}