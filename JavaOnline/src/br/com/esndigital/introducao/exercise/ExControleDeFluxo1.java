package br.com.esndigital.introducao.exercise;

public class ExControleDeFluxo1 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 100mil;
        int numero = 100000;
        for (int count = 0; count <= numero; count++ ) {
            System.out.println(count);
            if (count % 2 == 0)
                System.out.println("O número " + count + " é par");
            else
                System.out.println("O núemro numero " + count + " é impar");
        }

    }
}
