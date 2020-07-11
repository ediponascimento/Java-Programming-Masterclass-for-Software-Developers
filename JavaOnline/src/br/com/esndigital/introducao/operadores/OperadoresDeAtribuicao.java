package br.com.esndigital.introducao.operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {

        // br.com.esndigital.introducao.operadores.Operadores de atribuição.
        // =, -=, +=, *=, /=, %=

        int salario = 1800;

        System.out.println((salario *= 0.10));

        salario += 1000; // 2800
        System.out.println(salario);

        int numero = 20;
        System.out.println((numero % 3));

    }
}
