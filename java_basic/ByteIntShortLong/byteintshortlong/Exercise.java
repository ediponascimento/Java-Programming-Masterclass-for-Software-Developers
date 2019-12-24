package byteintshortlong;

public class Exercise {

    public static void main(String[] args) {

        // 1) Create a double variable with a value of 20.00
        double myDouble = 20.00d;

        // 2) Create a second variable with a value of type double with the value 80.00
        double mySecondDouble = 80.00d;

        // 3) Add both numbers together and multyplay by 100.00
        double myValuesTotal = myDouble + mySecondDouble * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);

        // 4) Use the remainder operator to figure out what the remainder from the result of the operator in step 40.00 
        // We used the modules or remainder operator on int's in the course, but we can also use it on double.
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("The remainder = " + theRemainder);

        // 5) Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if it's not zero.
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        
        // 6) Output the boolean variable.
        System.out.println("isNoRemainder = " + isNoRemainder);

        // 7) Write an if-than statement that displys a message "got some remainder" if the boolean in step 5 is not true. 
        // Don't suprised if you see output for this step, where you might expect it not show. l'll explain it in my solution.
        if (!isNoRemainder) {
            System.out.println("got some remainder");
        }
    }

}