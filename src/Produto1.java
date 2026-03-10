/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 10/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/



public class Produto1 {

    private int id;
    private String nome;
    private double preco;

    public Produto1(int id, String nome, double preco) {

        this.id = id;
        this.nome = nome;
        this.preco = preco;

    }

    public int getId() {

        return id;

    }

    public String getNome() {

        return nome;

    }

    public double getPreco() {

        return preco;
        
    }

}
