package byteintshortlong;

public class Casting {

    public static void main(String[] args) {

        byte minByteNumber = Byte.MIN_VALUE;
        byte myConvertedVyte = (byte) (minByteNumber / 2); // need to be converted, because a byte can't hold an int number
        System.out.println(myConvertedVyte);

        byte myMaxByte = Byte.MAX_VALUE;
        byte myMaxConvertedByte = (byte) (myMaxByte / 2);
        System.out.println(myMaxConvertedByte);

        int canHoldByte = myMaxByte; // An int can hold a byte with out explicit casting
        System.out.println(canHoldByte);

        // Exercise
        /**
         * Your challenge is to create a byte variable and set it to any valid byte number, it doesn't
         * matter. Create a short varialbe and set it any valid short number.
         * 
         * Create an int variable and set it to any valid int number. Lastely create a varible of type
         * long and make it equal to 50000 plus 10 times the sum of the byte plus the short plus
         * the integer values. 
         * 
        */

        // create a byte variable and set it to any valid byte number
        byte byteNumber = 127;
        
        short shortNumber = 32;

        int intNumber = 2020;

        long lognNumber = 50000L + 10L * ((byteNumber + shortNumber) * intNumber);
        
        int teste1 = byteNumber + shortNumber;
        int teste2 = ((byteNumber + shortNumber) * intNumber);
        
        System.out.println(teste1);
        System.out.println(teste2);
        System.out.println(lognNumber);
    }

}