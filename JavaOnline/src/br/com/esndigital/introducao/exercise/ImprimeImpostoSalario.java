package br.com.esndigital.introducao.exercise;

public class ImprimeImpostoSalario {

    public static void main(String[] args) {

        float salario = 5000f;

        float imposto;

        if (salario < 1000) {
            imposto = salario * 0.05f;
        } else if (salario >= 1000 && salario < 2000) {
            imposto = salario * 0.10f;
        } else if (salario >= 200 && salario < 4000) {
            imposto = salario * 0.15f;
        } else {
            imposto = salario * 0.2f;
        }

        System.out.println("O imposto sobre um salário de R$" + salario + " é R$" + imposto);

    }

}
