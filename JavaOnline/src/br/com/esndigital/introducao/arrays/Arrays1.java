package br.com.esndigital.introducao.arrays;

public class Arrays1 {
    public static void main(String[] args) {

        // todo Array em Java é um objeto
        int[] idades;
        idades = new int[5]; // indice 0 à 9

        idades[0] = 4;
        idades[1] = 6;
        idades[2] = 3;
        idades[3] = 9;
        idades[4] = 2;

        for (int i =0; i < idades.length; i++) {
            System.out.println("Idade: " + idades[i]);
        }
    }
}
