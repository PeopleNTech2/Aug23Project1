package getstarted;

public class Array {

	public static void main(String[] args) {
	
		//arrays
		int i = 9;
		
		//in-line declaration and assignment
		int[] array = {5, 3, 8, 8};
		String[] names = {"jack", "amber", "dave", "brad"};
		
		System.out.println(array[0]);
		
		//array declaration
		char[] letters = new char[4];
		
		//array assignment
		letters[0] = 'b';
		letters[1] = 'a';
		letters[2] = 'd';
		letters[3] = 'c';
		System.out.println(letters[3]);
		
		//2D array (Multidimensional array)
		//2D array declaration
		String [][] cities = new String[2][2];
		//2D array assignment 
		cities[0][0] = "NYC";
		cities[0][1] = "LA";
		cities[1][0] = "MI";
		cities[1][1] = "CHI";
		
		System.out.println(cities[0][1]);
		
		//2D array in-line declaration and assignment 
		boolean[][] boo = {{true,false},{false,true}};
	}

}
