import java.util.ArrayList;
import java.util.List;

public class javaDemo {

	public static void main(String[] args) {

		String name = "EmreBaybas";

//		StringBuilder s = new StringBuilder();
//		s = s.append(name).reverse();
//
//		String nameReversed = s.toString();
//
//		System.out.println(nameReversed);

		String nameReversed = "";
		for (int i = name.length() - 1; i >= 0; i--) {

			char c;
			c = name.charAt(i);

			nameReversed = nameReversed + c;

		}
		System.out.println(nameReversed);

		
	
		
	}

}
