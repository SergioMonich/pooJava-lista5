/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 10/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


public class Pedido1 {

    private int id;
    private String cliente;
    private String status;

    public Pedido1(int id, String cliente, String status) {

        this.id = id;
        this.cliente = cliente;
        this.status = status;

    }

    public int getId() {

        return id;

    }

    public String getCliente() {

        return cliente;

    }

    public String getStatus() {
        
        return status;

    }

}
