/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 09/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


public class Funcionario extends Pessoa {

    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String cargo, double salario) {

        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;

    }

    public String getNome() {

        return nome;

    }

    public String getCargo() {

        return cargo;

    }

    public double getSalario() {

        return salario;

    }

}
