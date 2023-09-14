package enumswitchcase;

public class Day {

    public void whichDay(Week day){

        switch(day) {
            case SUN:
                System.out.println("this is the first day of the weekend");
                break;
            case MON:
                System.out.println("this is the second day of the weekend");
                break;
            case TUE:
                System.out.println("this is the third day of the weekend");
                break;
            case WED:
                System.out.println("this is the fourth day of the weekend");
                break;
            case THU:
                System.out.println("this is the fifth day of the weekend");
                break;
            case FRI:
                System.out.println("this is the sixth day of the weekend");
                break;
            case SAT:
                System.out.println("this is the seventh day of the weekend");
                break;
        }
    }
}
