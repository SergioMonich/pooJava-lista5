/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 10/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


public class Vendedor {

    private String nome;
    private double totalDeVendas;

    public Vendedor(String nome, double totalDeVendas) {

        this.nome = nome;
        this.totalDeVendas = totalDeVendas;

    }

    public String getNome() {

        return nome;

    }

    public double getTotalDeVendas() {

        return totalDeVendas;

    }

}
