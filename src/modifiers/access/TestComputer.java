package modifiers.access;

class TestComputer {

    public static void main(String[] args) {

        //create an object
        Computer com = new Computer();

        //we cannot use os() function because it has private accessibility
        //com.os();

        //we can access graphicCard() function because it's public accessibility
        com.graphicCrd();

        //we can access graphicCard() function because it's default accessibility (available to class within the same package)
        com.hd();

    }

}
