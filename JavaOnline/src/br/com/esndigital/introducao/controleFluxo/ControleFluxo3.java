package br.com.esndigital.introducao.controleFluxo;

public class ControleFluxo3 {
    public static void main(String[] args) {

        // Aceitos no switch
        byte dia = 7;

        switch(dia) {
            case 1:
                System.out.print("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
                break;
            case 6 :
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Não existe o dia " + dia +" na lista semanal..");
        }
    }
}
