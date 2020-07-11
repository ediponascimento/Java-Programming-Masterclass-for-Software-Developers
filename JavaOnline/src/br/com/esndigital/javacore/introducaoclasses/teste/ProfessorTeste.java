package br.com.esndigital.javacore.introducaoclasses.teste;

import br.com.esndigital.javacore.introducaoclasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof1, prof2;

        prof1 = new Professor();
        prof1.nome = "Willian Suane";
        prof1.matricula = "17303010";
        prof1.cpf = "025.812.025-45";
        prof1.rg = "127065165";
        prof1.imprimirProfessor();

        System.out.println();

        prof2 = new Professor();
        prof2.nome = "Édipo Nascimento";
        prof2.matricula = "17303010";
        prof2.cpf = "025.812.025-45";
        prof2.rg = "127065165";
        prof2.imprimirProfessor();
    }
}
