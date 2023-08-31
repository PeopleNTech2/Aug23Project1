package getstarted;

public class UseString {

	public static void main(String[] args) {
		
		//strings
		//string manipulation
		String name = "   Jack   ";
		System.out.println(name.length());
		System.out.println(name.indexOf("J"));
		System.out.println(name.replace("J", "W"));
		System.out.println(name.charAt(3));
		name = name.trim();
		System.out.println(name.length());
		System.out.println(name);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		
		//string concatenation
		String firstName = "Jack";
		String lastName = "Sparrow";
		String space = " ";
		int number = 12;
		System.out.println(firstName+space+lastName);
		System.out.println(firstName.concat(space.concat(lastName)));
		System.out.println(firstName+(number+54));

	}

}
