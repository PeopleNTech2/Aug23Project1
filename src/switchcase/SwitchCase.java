package switchcase;

public class SwitchCase {

	public static void main(String[] args) {
		
		String day = "Mon";
		
//		if(day == "Sun") {
//			System.out.println("this is the first day of the weekend");
//		}else if(day == "Mon") {
//			System.out.println("this is the second day of the weekend");
//		}else if(day == "Tue") {
//			System.out.println("this is the third day of the weekend");
//		}else if(day == "Wed") {
//			System.out.println("this is the fourth day of the weekend");
//		}else if(day == "Thu") {
//			System.out.println("this is the fifth day of the weekend");
//		}else if(day == "Fri") {
//			System.out.println("this is the sixth day of the weekend");
//		}else if(day == "Sat") {
//			System.out.println("this is the seventh day of the weekend");
//		}else {
//			System.out.println("wrong day");
//		}
		
		switch(day) {
		 case "Sun":
			 System.out.println("this is the first day of the weekend");
//			 break;
		 case "Mon":
			 System.out.println("this is the second day of the weekend");
//			 break;
		 case "Tue":
			 System.out.println("this is the third day of the weekend");
//			 break;
		 case "Wed":
			 System.out.println("this is the fourth day of the weekend");
//			 break;
		 case "Thu":
			 System.out.println("this is the fifth day of the weekend");
//			 break;
		 case "Fri":
			 System.out.println("this is the sixth day of the weekend");
//			 break;
		 case "Sat":
			 System.out.println("this is the seventh day of the weekend");
//			 break;
		default:
			System.out.println("wrong day");
			
		}

	}

}
