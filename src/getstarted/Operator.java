package getstarted;

public class Operator {

	public static void main(String[] args) {
		
		//operators in java
		//arithmetic operators: +, -, *, /, %, ++, --
		System.out.println(5 + 10);
		System.out.println(5 - 10);
		System.out.println(5.0 * 10.0);
		System.out.println(10 / 3);
		System.out.println(10 % 3);
		int a = 3;
		System.out.println(a);
		a++;//a++ equals to a+1
		System.out.println(a);
		int b = 100;
		System.out.println(b);
		b--;//b-- equals to a-1
		System.out.println(b);
		
		int c = 200;
		System.out.println(c++);
		System.out.println(c);
		
		int d = 400;
		System.out.println(++d);
		System.out.println(d);
		
		
		//assignment operator: =
		int i = 4;
		
		//comparison operators: >, >=, <, <=, ==, != 
		System.out.println(i > 9);//false
		System.out.println(11 >= 8);//true
		System.out.println(9 < 10);//true
		System.out.println(6 <= 7);//true
		System.out.println(4 == i);//true
		System.out.println(3 != 4);//true
		
		//logical operators: &&, ||, !
		System.out.println((10 > 9) && (8 != 8));//false
		System.out.println((10 > 9) || (8 != 8));//true
		System.out.println(!(9 > 9));//false
		
		//escape characters:
		System.out.println("hello");
		System.out.print("world \n");
		System.out.println("hi");
		
		System.out.println("\"hi my name is jack\"");
		System.out.println('\\');
		System.out.println('\'');

	}

}
