/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 10/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


public class Funcionario1 {

    private String nome;
    private double salario;
    private String departamento;

    public Funcionario1(String nome, double salario, String departamento) {

        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;

    }

    public String getNome() {

        return nome;

    }

    public double getSalario() {

        return salario;

    }

    public String getDepartamento() {

        return departamento;
        
    }

}
