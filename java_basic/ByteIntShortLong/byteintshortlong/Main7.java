package byteintshortlong;

public class Main7 {

    public static void main(String[] args) {

        int result = 1;

        System.out.println(result);

        result++;
        System.out.println(result);


        result = result + 1; // 3
        System.out.println(result);

        System.out.println(result++); // result continua valendo 3
        System.out.println(result); // 4 -> agora result vale 4..
    }

}