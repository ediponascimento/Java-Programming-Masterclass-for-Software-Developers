package br.com.esndigital.javacore.introducaometodos.teste;

import br.com.esndigital.javacore.introducaometodos.classes.Calculadora;

public class ParametroTest {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int num1 = 10;
        int num2 = 20;

        calculadora.testaAtribuicao(num1, num2);

        System.out.println("Dentro da classe de teste");
        System.out.println("Numero 1: " + num1);
        System.out.println("Número 2: " + num2);

        int numeros[] = {1, 4, 7, 54, 8, 9, 7, 4, 7, 4, 5, 6, 4, 5, 7, 87, 10};
        System.out.println("Total sum is: " + calculadora.somaNumeros(numeros));
    }
}
