package classobjectconstructor;

public class TestHouse {

    public static void main(String[] args) {

        //create object
        House myHouse = new House("52 Senator St");

        House yourHouse = new House("52 Senator St");

        myHouse.room();
        System.out.println(myHouse.color);
        myHouse.unit = 'B';

        House herHouse = new House("52 Senator St", "NYC");

        House hisHouse = new House("52 Senator St", "NYC", "USA");

        House theirHouse = new House();

    }

}
