
public class TwoDimentionalArrayLoop {

	public static void main(String[] args) {
		
		String a[][]={{"a","b"},{"d","e"},{"g","e"},{"f","h"}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
			
		}					
		
	}

}
