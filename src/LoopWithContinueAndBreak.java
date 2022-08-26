
public class LoopWithContinueAndBreak {

	public static void main(String[] args) {
	
		String days[]= {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		
		String day="monday";
		
		
		for (int i = 0; i < days.length; i++) {
			
			if (i<5) {
					
			if (day.equals(days[i])) {
				
				System.out.println("It's "+day+". Day "+(i+1)+" of the week. Get ready for work");
				break;
			}
			}else {
				if (day.equals(days[i])) {
					
					System.out.println("It's "+day+". Day "+(i+1)+" of the week. Enjoy your weekend");
					break;
				}
			}
			
		}
		
		
	}

}
