package br.com.esndigital.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 4, 5, 6, 7, 8, 9}; // 0 à 7

        int numerosLength = numeros.length;
        int ultimoElemento = numerosLength - 1;
        System.out.println("Tamanho do array: " + numerosLength);

        for (int numero : numeros) {
            System.out.println("Numero is: " + numero);
        }

        System.out.println("Primero item no array: " + numeros[0]);
        System.out.println("Último elemento no array: " + numeros[ultimoElemento]);


    }
}
