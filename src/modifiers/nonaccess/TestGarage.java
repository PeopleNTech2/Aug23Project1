package modifiers.nonaccess;

public class TestGarage {
    public static void main(String[] args) {

        //non-static properties belong to object
        //static properties belong to class
        Garage myGarage = new Garage();

        myGarage.setDriveWay(12);
        System.out.println(myGarage.getDriveWay());

        Garage yourGarage = new Garage();
        yourGarage.setDriveWay(14);
        System.out.println(yourGarage.getDriveWay());

        System.out.println(myGarage.getDriveWay());

        //System.out.println(yourGarage.getDriveWay());

    }
}
