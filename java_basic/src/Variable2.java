package src;

public class Variable2 {

    public static void main(String[] args) {

        int myFirstNumber = 5;
        int mySecondNumber = 6;

        System.out.println((myFirstNumber + mySecondNumber) * (myFirstNumber * 3)); // 165
        System.out.println(myFirstNumber); // 5
        System.out.println(mySecondNumber); // 6
        System.out.println(myFirstNumber + mySecondNumber);  // 11
        System.out.println(myFirstNumber / mySecondNumber);  // 0
        System.out.println(myFirstNumber * mySecondNumber);  // 30
        System.out.println(myFirstNumber == mySecondNumber); // false

        System.out.println(myFirstNumber < mySecondNumber);  // true
        System.out.println(myFirstNumber <= mySecondNumber); // true
        System.out.println(myFirstNumber != mySecondNumber); // true
        System.out.println(myFirstNumber >= mySecondNumber); // false
        System.out.println(myFirstNumber > mySecondNumber);  // false
        System.out.println(myFirstNumber % mySecondNumber);  //5

        int myTotal = (myFirstNumber + 10) * (mySecondNumber * 10);
        System.out.println(myTotal);

        int mylastOne = 1000 - myTotal;
        System.out.println(mylastOne);

    }

}