package byteintshortlong;

public class Main10 {
    
    public static void main(String[] args) {

        int num = 8;
        String message = "";
        if (num > 10) {
            message = "num is greater than 10";
        } else {
            message = "Number is less than or equal to 10";
        }
        System.out.println(message);
    
        int myNum = 25;
        final String myMessage = myNum > 10 
            ? "Number is greater than 10" 
            : "Number is less than or equal to 10";
        System.out.println(myMessage);
    
    }

}