import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayCollections {
	
	int i;

	public static void main(String[] args) {

		int a[]= {21,2,443,15,66};
		
	
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		Collections.sort(list);
		
		for (Integer integer : list) {
		System.out.println(integer);
		}
		
		System.out.println("*****");
		
		Collections.reverse(list);
		for (Integer integer1 : list) {
			System.out.println(integer1);
		}
		
	}

}
