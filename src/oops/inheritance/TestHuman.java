package oops.inheritance;

public class TestHuman {
    public static void main(String[] args) {
        GrandFather thomas = new GrandFather();
        thomas.educated();
        thomas.communicate();

        Father david = new Father(6);

        david.athletic();
        david.educated();

        Son jack = new Son(7);

        jack.athletic();
        System.out.println(jack.height);
        jack.educated();

        Bird sparrow = new Bird();
        sparrow.communicate();

    }
}
