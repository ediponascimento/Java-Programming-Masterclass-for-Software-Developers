package br.com.esndigital.introducao.controleFluxo;

public class ControleDeFluxo {

    public static void main(String[] args) {

        int idade = 19;

        if(idade >= 18) {
            System.out.println("Entrou no Club...");
        }

        boolean c = false;
        if(c = true) {
            System.out.println("entrou no IF");
        }

        // idade < 15 -> Infantil
        // idade >= 15 && idade <= 18 -> Juvenil
        // idade >= 18 adulto

        String category;
        if (idade < 15) {
            category = "Infantil";
        } else if (idade >= 15 && idade <= 18) {
            category = "Juvenil";
        } else {
            category = "Adult";
        }
        System.out.println("Category: " + category);
    }
}
