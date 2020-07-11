package br.com.esndigital.introducao.controleFluxo;

public class ControleDeFluxo3 {
    public static void main(String[] args) {
        // Descobrir a quantidade de parcelas.
        // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado.
        // Porém as percelas não pdem ser menores do que mil.

        double valorTotal = 30000;
        for (int parcela =1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;

            if(valorParcela < 1000) {
                break;
            }
            System.out.println("Você pode pagar em até " + parcela + " de R$ " + valorParcela);
        }

    }
}
