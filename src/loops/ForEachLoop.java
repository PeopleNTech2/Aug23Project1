package loops;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] names = {"jack", "amber", "dave", "brad"};

		for (String name: names) {
			System.out.println(name);
		}
		
		int[] array = {8, 0, 2589, 95};
		for(int i: array) {
			System.out.print(i+"\n");
		}
		
		int a = 5;
		System.out.println(a);

		a = 9;
		System.out.println(a);
		
		a = 100;
		System.out.println(a);
		
		//print number divisible 7 from 0 to 50
		for(int i =0; i <= 50; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
			}
		}

	}

}
