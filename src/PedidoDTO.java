/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 09/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


public class PedidoDTO {

    private int id;
    private double valorTotal;

    public PedidoDTO(int id, double valorTotal) { 

        this.id = id;
        this.valorTotal = valorTotal;
        
    }

    public int getId() {

        return id;

    } 
    
    public double getValorTotal() {

        return valorTotal;

    }

}
