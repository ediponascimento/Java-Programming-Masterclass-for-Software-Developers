package br.com.esndigital.javacore.introducaoclasses.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprimirProfessor() {
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Professor matrícula: " + this.matricula);
        System.out.println("Professor RG: " + this.rg);
        System.out.println("Professor CPF: " + this.cpf);
    }
}
