package byteintshortlong;

public class Main8 {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien) {
            System.out.println("It is not an Alien");
            System.out.println("And I am scared of Aliens");
        }

        int topScore = 60;
        if (topScore < 90) {
            System.out.println("You got hte high score!");
        }

        int secondTopScore = 60;
        // if true                           // if true
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore >= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is not an error.");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("It is not supposed to happen");
        }
    }

}