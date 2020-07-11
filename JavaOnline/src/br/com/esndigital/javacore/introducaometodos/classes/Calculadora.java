package br.com.esndigital.javacore.introducaometodos.classes;

import java.io.Serializable;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(5+5);
    }

    public void subtrairDoisNumeros() {
        System.out.println(5 - 3);
    }

    public int multiplicaDoisNumeros(int num1, int num2) {
        return num1 * num2;
    }

    public double divideDoisNumeros(double indice, double ref) {
        if (ref != 0) {
            return indice / ref;
        }
        return 0;
    }

    public void imprimeDivisao(double numero1, double numero2) {
        if(numero2 != 0) {
            System.out.println("O resultado da divisão é " + (numero1 / numero2));
            return;
        }
        System.out.println("Não pode dividir " + numero1 + " por " + numero2);
    }

    // passagem de métodos por parâmetros e, como atribuir valor.

    public void testaAtribuicao(int numero, int numero2) {
        numero = 30;
        numero2 = 40;
        System.out.println("Dentro da classe");
        System.out.println("Numero 1: " + numero);
        System.out.println("Numero 2: " + numero2);
    }

    // soma numeros
    public int somaNumeros(int[] numeros) {
        int somaTotal = 0;
        for(int numero: numeros) {
            somaTotal += numero;
        }
        return somaTotal;
    }

}
