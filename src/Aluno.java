/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 09/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


public class Aluno {

    private String nome;
    private double nota;
    private int idade;

    public Aluno(String nome, double nota, int idade) {

        this.nome = nome;
        this.nota = nota;
        this.idade = idade;

    }

    public String getNome() {

        return nome;

    }

    public double getNota() {

        return nota;

    }

    public int getIdade() {

        return idade;

    }

}
