package br.com.esndigital.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {

        // Estudar valores de inicialização de arrays para certificação.

        // Valores por tipo
        // byte, short, int, long, float, double = 0;

        // char unicode representando um espaço em branco.

        // boolean = false;

        // Arrays do tipo reference = null

        String[] nomes;
        nomes = new String[3];

        nomes[0] = "Édipo";
        nomes[1] = "Nascimento";
        nomes[2] = "Fernado";

        System.out.println("Tamanho do array: " + nomes.length);
        int nomesLength = nomes.length;

        for (int i = 0; i < nomesLength; i++)
            System.out.println("Nome: " + nomes[i]);
    }
}
