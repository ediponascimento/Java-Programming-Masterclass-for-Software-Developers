package br.com.esndigital.javacore.introducaometodos.teste;

import br.com.esndigital.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtrairDoisNumeros();
        System.out.println(calculadora.multiplicaDoisNumeros(10,3));
        System.out.println(calculadora.divideDoisNumeros(7.2, 5));
        calculadora.imprimeDivisao(20, 5);
    }
}
