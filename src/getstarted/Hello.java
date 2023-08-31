//package: refers to the java folder where your classes are located
package getstarted;

//class: refers to the file
class Hello {
	//main method: entry point of the application
	public static void main(String[] agrs) {
		//print statement: print vs println
		System.out.print("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		
		//single line comment
		
		/* multiple lines comment
	 	this is a very
		long comment that 
		needs more than 2 lines */
		
		//types
		//number
			//whole number
			byte b = 127;//1 byte
			short s = 3425;//2 bytes
			int i = 1498461656;//4 bytes
			long l = 1651515165461L;//8 bytes
		
			//fraction
			float f = 1.25487F;//4 bytes (6 to 7 decimals)
			double d = 1.254;//8 bytes (15 decimals)
		
		//character
		char ch = ' ';//doesn't accept null (2 bytes)
		
		//text
		String text = "";//accepts null
		
		//boolean (true or false)
		boolean boo = false;//1/8 bytes (1 bit)
		
		//-------------------------------------------------------------------------------------
		
		//properties
		
		//in-line declaration and assignment of a variable 
		int x = 25;
		
		//declare variable
		int age;
		
		//assign variable
		age = 20;
		System.out.println(age + 5);
		
		//variable reassignment
		age = 21;
		System.out.println(age + 5);
		
		final String name = "Jack";
		//name = "Fred"; //can't be reassigned
		
		//declare multiple variable in a single line
		int num1, num2, num3;
		num1 = 45;
		num2 = 52;
		num3 = 81;
		
		//---------------------------------------------------------------------------------------
		
		//variable naming
		int numberOfStudent = 20;
		
		/*
		 * a name can have letters, numbers, underscore, dollar sign
		 * name can start with letter, $, _
		 * names cannot contains reserved java keyword
		 * use camel case for naming (thisIsCamelCase)
		 */
		
		//display variable (print)
		System.out.println(name);
		
		//----------------------------------------------------------------------------------
		
		//java logic
		System.out.println(10.0 / 15.0);
		
		//assignment symbol: =
		//comparison symbols: >, <, >=, <=, ==, !=
		//logical symbols: &&, ||, !
		//arithmetic symbols: +, -, *. /, %, ++(+1), --(-1)
		System.out.println(10 != 9);
	}
}