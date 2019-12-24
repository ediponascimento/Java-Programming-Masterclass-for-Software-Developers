package byteintshortlong;

public class Main3 {

    public static void main(String[] args) {

        float myMinimumFloat = Float.MIN_VALUE;
        float myMaximumFloat = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinimumFloat);
        System.out.println("Float maximum value = " + myMaximumFloat);

        double myMinimumdouble = Double.MIN_VALUE;
        double myMaximumDouble = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinimumdouble);
        System.out.println("Double maximum value = " + myMaximumDouble);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;

        System.out.println("");
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        // convert a given number of pounds to kilograms.
        
        //STEPS:
            // 1) Create a variable with the appropiate type to store the numbers of paunds to be
            //    converted to kilograms.
             
            double numberOfPounds = 200;
            double kilograms = 0.45359237d;

            // 2) Calculate the result i.e the number of kilograms based on the contents of the     
            //    variable above and store the result in a 2nd appropriate variable.
            double result = numberOfPounds * kilograms;

            // 3) print out the result
            System.out.println(result + " pounds");

        // HINT: 1 pound is equal to 0.45359237 of kilogram. This should help you perform 
        // calculation.
    }

}

