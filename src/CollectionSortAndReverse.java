import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortAndReverse {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("cam");
		list.add("dam");
		list.add("mam");
		list.add("am");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("************");
		
		Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("************");
		Collections.reverse(list);
		
		for (String string : list) {
			System.out.println(string);
		}
		
		

	}

}
