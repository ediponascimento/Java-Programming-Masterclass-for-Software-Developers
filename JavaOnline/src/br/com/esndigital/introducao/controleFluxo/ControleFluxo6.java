package br.com.esndigital.introducao.controleFluxo;

public class ControleFluxo6 {
    public static void main(String[] args) {
        double valorTotal = 1000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 100) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }
    }
}
