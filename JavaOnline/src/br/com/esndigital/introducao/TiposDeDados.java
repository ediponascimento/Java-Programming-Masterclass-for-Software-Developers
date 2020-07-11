package br.com.esndigital.introducao;

public class TiposDeDados {
    public static void main(String[] args) {

        int age = 32;
        String firstName = "Édipo";
        String lastName = "dos Santos Nascimento";
        double mySalary = 25000d;

        System.out.println("Meu nome é: " + firstName);
        System.out.println("E minha idade é: " + age);
        System.out.println("Meu salário é: " + mySalary);

        /**
         * Tipos de dados em Java
         * int
         * double
         * float
         * byte
         * short
         * boolean
         * long
         * char
         * */

        char character = 95;
        System.out.println("character: " + character);

    }

    public static class Operadores {
        public static void main(String[] args) {

            // br.com.esndigital.introducao.operadores.Operadores em Java.
            System.out.println("Resto da divisão " + (20 % 2));

            boolean dezMaiorQueVinte = (10 > 20); // false
            System.out.println(dezMaiorQueVinte);

            boolean dezMenorQueVinte = (10 < 20); // true
            System.out.println(dezMenorQueVinte);

            boolean dezIgualIgualCinco = (10 == 5); // false
            System.out.println(dezIgualIgualCinco);

            boolean dezDiferenteCinco = (10 != 5); // true
            System.out.println(dezDiferenteCinco);

            boolean dezMaiorOuIgualCinco = (10 >= 5); // true
            System.out.println(dezMaiorOuIgualCinco);

            boolean dezMenorOuIgualCinho = (10 <= 5); // false
            System.out.println(dezMenorOuIgualCinho);

        }
    }
}
