package br.com.esndigital.introducao.controleFluxo;

public class ControleFluxo4 {
    public static void main(String[] args) {
        int contador = 11;
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }

        // do while
        do {
            System.out.println("Dentro do while...");
        } while (contador < 10);

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println("I vale " + i);
            if(i == 5) {
                System.out.println("Saindo do do for");
                break;
            }
        }
        System.out.println("Saiu do for");


    }
}
