package loops;

public class ContinueDoWhile {

	public static void main(String[] args) {
		int count =20;
		//while loop for iteration
		while(count>=0) {
			if(count == 7 || count == 15) {
				count --;
				//decrementing variable initialized above
				
				//showing continue execution inside loop
				//skipping when count == 7 or count==15
				continue;
			}
			System.out.println(count +" ");
			
			//decrementing the count variable
			count --;
		}

	}

}
