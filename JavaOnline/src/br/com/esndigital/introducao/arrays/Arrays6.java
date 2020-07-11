package br.com.esndigital.introducao.arrays;

public class Arrays6 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][];

        numeros[0] = new int[2];  // {0, 0}
        numeros[1] = new int[]{1, 2, 3}; // {1, 2, 3}
        numeros[2] = new int[4]; // {0 0 0 0}

        for (int[] ref : numeros) {
            for(int num : ref) {
                System.out.println(num);
            }
        }

    }
}
