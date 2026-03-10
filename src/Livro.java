/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 10/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {

        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;

    }

    public String getTitulo() {

        return titulo;

    }

    public String getAutor() {

        return autor;

    }

    public double getPreco() {

        return preco;
        
    }

}
