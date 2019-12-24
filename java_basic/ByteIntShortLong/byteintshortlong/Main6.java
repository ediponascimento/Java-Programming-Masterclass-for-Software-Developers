package byteintshortlong;

public class Main6 {

    public static void main(String[] args) {

        int iValue = 25;
        System.out.println("IValue: " + iValue);
        int result = iValue - 21;
        System.out.println("result: " + result);
        int previusResult = result;
        System.out.println(previusResult);
        result = result / 2;
        System.out.println(result);
        result = result * 5; 
        System.out.println(result);
        result = result + (result * 5);
        System.out.println(result);
        result = result + ( result % 2 ) * 5;
        System.out.println(result);
        result = result + ( result * previusResult);
        System.out.println(result);
        System.out.println(previusResult);
        System.out.println(result);

        System.err.println("---------------------------------------------------------------------");

        int i, j;
        int count = 0;
        for (i = 1; i <= 50;  i++) {
            for(j = 1; j <= 50; j++) {
                System.out.println( i +" + "+ j + " = "+ (i + j) );
                count = count + 1;
                if(count == 10) {
                    System.err.println("");
                    count = 0;
                }
            }
        }

    }
    

}