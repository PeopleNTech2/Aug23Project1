package loops;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		//print number from 10 to 0
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

		//if the number is 6 then stop the loop (break)
		for (int i = 0; i < 10; i++) {
			if(i==6) {
				break;
			}
			System.out.println(i);
		}

		//if the number is from 20 to 30 don't print(continue)
		for (int i = 0; i < 50; i++) {
			if(i > 19 && i < 31) {
				continue;
			}
			System.out.println(i);
		}

		//nested for loop
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i+" "+j);
			}
		}
	}

}
