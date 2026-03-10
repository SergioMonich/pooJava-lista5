/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 10/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


public class Pessoa1 implements Descritivel {

    private String nome;
    private float altura;
    private float peso;
    private String corCabelo;

    public Pessoa1(String nome, float altura, float peso, String corCabelo) {

        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.corCabelo = corCabelo;

    }

    @Override
    public String getDescricao() {
        return "Nome: " + nome + " [altura=" + altura + ", peso=" + peso + ", corCabelo=" + corCabelo + "]";
    }

}
