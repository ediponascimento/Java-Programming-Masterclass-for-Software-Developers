package br.com.esndigital.introducao.arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int dias[][] = new int[2][2];

        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[1][0] = 2;
        dias[1][1] = 4;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("Dias " + (i) + " é igual " + dias[i][j]);
            }
        }


        for (int[] ref : dias) {
            for (int dia: ref) {
                System.out.println(dia);
            }
        }

    }
}