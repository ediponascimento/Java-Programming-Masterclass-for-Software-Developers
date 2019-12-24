package byteintshortlong;

public class Main5 {
    
    public static void main(String[] args) {

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String is not a primitive type - It's actually a class.
        String myString = "This is a string ";
        System.out.println("myString is equal to " + myString );
        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString );
        myString = myString + " \u00A9 " + new java.util.Date();
        System.out.println("myString is eqaul to " + myString );
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);


        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString equal to " + lastString);
        
        System.out.println(myInt + "10");

    }

}