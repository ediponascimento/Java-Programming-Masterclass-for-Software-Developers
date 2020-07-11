package br.com.esndigital.javacore.introducaoclasses.teste;

import br.com.esndigital.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante;
        estudante = new Estudante();

        estudante.nome = "Enzo Guimarães";
        estudante.matricula = "45352810";
        estudante.idade = 28;

        System.out.println(estudante.nome);
        System.out.println( estudante.idade);
        System.out.println(estudante.matricula);
    }
}
