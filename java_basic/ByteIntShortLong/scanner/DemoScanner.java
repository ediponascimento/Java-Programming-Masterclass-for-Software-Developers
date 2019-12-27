package scanner;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    
        
        // System.out.print("Entenr an int number: ");
        // int intValue = sc.nextInt();

        System.out.print("Entenr an int number: ");
        int intValue = sc.nextInt();
        
        System.out.print("Name: ");
        String name = sc.next();

        sc.close();
        
        System.out.println("You typed number: " + intValue);
        System.out.println(name);

        

    }

}