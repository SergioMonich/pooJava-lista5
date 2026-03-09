/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 09/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


public abstract class ItemLoja implements Vendavel {

    private int id;
    private String nome;
    private double preco;

    public ItemLoja(int id, String nome, double preco) {

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

    @Override
    public double getPreco() {

        return preco;

    }

}
