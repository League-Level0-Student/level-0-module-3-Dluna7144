package loops;

public class SpudCounter {

	public static void main(String[] args) {
		
		for (int i = 1; i <9; i++) {
			
			if (i==4) {
				System.out.println(i);
			}
			
			if (i==8) {
			System.out.println("more");
			} 
		
			if (i!=4 && i!=8) {
				System.out.println(i+" potato");
		}
		
		}
	}
}
