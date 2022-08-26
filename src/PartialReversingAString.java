import java.util.ArrayList;
import java.util.List;

public class PartialReversingAString {

	public static void main(String[] args) {
		String s = "abc12bdd4ace";
		StringBuilder sb = new StringBuilder();

		char a[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j < a.length; j++) {

				if (s.charAt(i) == a[j]) {

					list.add(i);

				}
			}

		}

		for (int c : list) {
			System.out.println(c);
		}

		StringBuilder partial= new StringBuilder();
		sb=partial.append(s.substring(0,list.get(0))).reverse();
		partial.append(s.substring(list.get(0),list.get(1)+1));
		//partial.append(s.substring(list.get(0),list.get(1)));
		
		System.out.println(partial);
		
		
		
	}

}
