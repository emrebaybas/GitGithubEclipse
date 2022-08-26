import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxOfAnArrayCollectiuons {
	
	int i;

	public static void main(String[] args) {

		int a[]= {21,2,443,15,66};
		
		Arrays.sort(a);
		
		int max=a[a.length-1];
		int min=a[0];
		
		System.out.println("Min of the array is "+ min+"\nMax of the array is "+max);
		
		
		Integer[] x= {21,2,443,15,66};
		
		List<Integer> b=Arrays.asList(x);
		Collections.reverse(b);
		
		for (Integer integer : b) {
			System.out.println(integer);
			
		}
		


	}

}
