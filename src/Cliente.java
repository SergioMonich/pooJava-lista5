/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 10/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


public class Cliente {

    private String nome;
    private int idade;
    
    public Cliente(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

    }

    public String getNome() {

        return nome;

    }

    public int getIdade() {

        return idade;

    }

}
