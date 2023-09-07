package modifiers.access;

public class Computer {

    //modifiers
        //access:
            //public (usable outside the package) - applicable for classes/variables/methods/constructors
            //private(within the class only)      - applicable for variables/methods/constructors
            //default(within the package only)    - applicable for classes/variables/methods/constructors
            //protected                           - applicable for variables/methods/constructors

    //properties
    //variables
    public int ram = 128;

    //constructors
    public Computer(){

    }

    //methods
    private void os(){
        System.out.println("this is windows machine");
    }
    public void graphicCrd(){
        System.out.println("engine graphic card");
    }
    void hd(){
        System.out.println("ssd graphic card");
    }
}
