/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 09/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


public class Pedido {

    private int id;
    private String cliente;
    private double valorTotal;
    
    public Pedido(int id, String cliente, double valorTotal) { 

        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;

    }

    public int getId() {

        return id;

    }

    public String getCliente() {

        return cliente;

    }   

    public double getValorTotal() {

        return valorTotal;

    }

}
