package br.com.esndigital.introducao.operadores;

public class OperadoresDecomparacao {
    public static void main(String[] args) {

        int idade = 18;
        float salario = 1000f;

        System.out.println((idade >= 18) && (salario >= 2000));
        System.out.println((idade >= 20) || (salario >= 2000));

    }
}
