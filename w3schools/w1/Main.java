public class Main{
    int x = 5;
    final int x1= 5; // is calld attributes 
    void PRINT()
    {
        System.out.println("Hello world :");
    }
    public static void main(String[] args){


         // creating an object
            //if you crate multiple objects of class, you can chang the attribute values in one object,
             // without affecting the attribute in the other

        Main myObj = new Main();
        //modifying attributes
        System.out.println(myObj.x);
        myObj.x = 40; // now x is 40
        // myObj.x1 = 60; //will generate an error: connot assign a value to a final varable
        System.out.println(myObj.x);
        myObj.PRINT();
        //
    
    }
}