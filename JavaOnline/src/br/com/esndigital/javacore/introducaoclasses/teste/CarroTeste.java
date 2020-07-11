package br.com.esndigital.javacore.introducaoclasses.teste;

import br.com.esndigital.javacore.introducaoclasses.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro;
        carro = new Carro();

        carro.placa = "XYZ1225";
        carro.modelo = "Esportivo";
        carro.velocidadeMaxima = 250.00f;

        String placa = carro.placa;
        String modelo = carro.modelo;
        float velocidadeMaxima = carro.velocidadeMaxima;

        System.out.println("O Carro modelo " + modelo +
            ", placa " + placa +
            ", tem uma velocidade máxima de " +
            velocidadeMaxima +" KM por hora."
        );
    }
}
