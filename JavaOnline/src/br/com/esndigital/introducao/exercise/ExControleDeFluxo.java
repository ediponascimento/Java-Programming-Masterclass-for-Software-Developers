package br.com.esndigital.introducao.exercise;

public class ExControleDeFluxo {

    public static void main(String[] args) {
        int numero = 1;
        boolean diaDaSemana;
        switch (numero) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da semana");
                break;
            default:
                System.out.println("Dia não encontrado");
        }
    }

}
