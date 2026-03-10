/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 10/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;

    }

    public String getNome() {

        return nome;

    }

    public double getPreco() {

        return preco;

    }
    
}
