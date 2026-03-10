/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 05/03/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/

import java.rmi.server.SocketSecurityException;
import java.util.ArrayList;      
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @brief Instruções de execução
 * 1. Comente todos os blocos de exercícios na main
 * 2. Deixe descomentado apenas o exercício desejado
 * 3. Execute a aplicação normalmente
 */


public class App {
    public static void main(String[] args) throws Exception {
        
      /**
       * 1. Criar uma Hierarquia de Produtos e Filtrar por Preço 
          Crie uma interface Vendavel com o método double getPreco(). 
          Crie uma classe abstrata ItemLoja com os atributos id e nome, implementando Vendavel. 
          Crie duas classes concretas Eletronico e Roupas, herdando ItemLoja. 
          
          Objetivo: 
          • Criar uma lista intermediária contendo apenas os nomes dos produtos com preço acima de R$ 100,00 usando filter() e map(). 
          • Converter a lista de produtos para uma lista de descrições usando .map(ItemLoja::getNome). 
       */

      /*    
      Eletronico eletronico1 = new Eletronico(1, "Smartphone", 1500.0);
      Eletronico eletronico2 = new Eletronico(2, "Notebook", 2500.0);
      Eletronico eletronico3 = new Eletronico(3, "Fone de Ouvido", 200.0);
      Eletronico eletronico4 = new Eletronico(4, "Mouse", 50.0);
      Eletronico eletronico5 = new Eletronico(5, "Teclado", 80.0);
      Roupas roupa1 = new Roupas(6, "Camisa", 50.0);
      Roupas roupa2 = new Roupas(7, "Jeans", 100.0);
      Roupas roupa3 = new Roupas(8, "Vestido", 150.0);
      Roupas roupa4 = new Roupas(9, "Sapato", 200.0);
      Roupas roupa5 = new Roupas(10, "Bolsa", 80.0);

      ArrayList<ItemLoja> produtos = new ArrayList<>(Arrays.asList(eletronico1, eletronico2, eletronico3, eletronico4, eletronico5, roupa1, roupa2, roupa3, roupa4, roupa5));
      List<String> produtosAcima100 = produtos.stream()
         .filter(p -> p.getPreco() > 100.0)
         .map(ItemLoja::getNome)
         .collect(Collectors.toList());
      
      System.out.println("Produtos com preço acima de R$ 100,00: " + produtosAcima100);
      */


      /**
       * 2. Ordenação de Objetos (ASC e DESC) e Transformação de Lista 
          Crie uma classe Aluno com os atributos String nome, double nota e int idade. 
          
          Objetivo: 
          • Criar uma lista intermediária com alunos aprovados (nota >= 7). 
          • Ordená-los por nota (decrescente) e idade (crescente) usando .sorted(Comparator.comparing(Aluno::getNota).reversed()). 
          • Transformar a lista de alunos em uma lista de nomes usando .map(Aluno::getNome). 
       */

      /*
      ArrayList<Aluno> alunos = new ArrayList<>();
      
      alunos.add(new Aluno("João", 8.5, 20));
      alunos.add(new Aluno("Maria", 6.0, 22));
      alunos.add(new Aluno("Pedro", 9.0, 19));
      alunos.add(new Aluno("Ana", 7.5, 21));
      alunos.add(new Aluno("Lucas", 5.0, 23));
      alunos.add(new Aluno("Carla", 8.0, 20));
      alunos.add(new Aluno("Rafael", 6.5, 22));
      alunos.add(new Aluno("Fernanda", 9.5, 19));  
      alunos.add(new Aluno("Bruna", 7.0, 21));
      alunos.add(new Aluno("Gustavo", 4.5, 23));
      alunos.add(new Aluno("Camila", 8.0, 20));
      alunos.add(new Aluno("Diego", 6.0, 22));

      List<String> alunosAprovados = alunos.stream()
         .filter(a -> a.getNota() >= 7.0)
         .sorted(Comparator.comparing(Aluno::getNota).reversed())
         .map(Aluno::getNome)
         .collect(Collectors.toList());

      System.out.println("Alunos aprovados ordenados por nota (decrescente) e idade (crescente): " + alunosAprovados);   
      */


      /**
       * 3. Agrupamento de Funcionários por Cargo e Mapeamento para Médias 
          Crie uma classe abstrata Pessoa com nome e idade. 
          Crie uma classe concreta Funcionario, herdando Pessoa e adicionando String cargo e double salario. 
          
          Objetivo: 
          • Agrupar funcionários por cargo em um Map<String, List<Funcionario>> usando Collectors.groupingBy(). 
          • Criar uma lista intermediária contendo apenas os nomes dos funcionários usando map(). 
          • Criar um Map<String, Double> contendo a média salarial por cargo usando Collectors.averagingDouble(Funcionario::getSalario). 
       */

      /*
      ArrayList<Funcionario> funcionarios = new ArrayList<>();
      funcionarios.add(new Funcionario("João", 30, "Analista Senior", 5000.0));
      funcionarios.add(new Funcionario("Maria", 25, "Analista Junior", 3000.0));
      funcionarios.add(new Funcionario("Pedro", 28, "Gerente", 5500.0));
      funcionarios.add(new Funcionario("Ana", 22, "Analista Pleno", 3200.0));
      funcionarios.add(new Funcionario("Lucas", 35, "Coordenador", 6000.0));
      funcionarios.add(new Funcionario("Carla", 27, "Analista Pleno", 3500.0));
      funcionarios.add(new Funcionario("Rafael", 31, "Gerente", 5200.0));
      funcionarios.add(new Funcionario("Fernanda", 24, "Analista Junior", 3100.0));
      funcionarios.add(new Funcionario("Bruna", 29, "Coordenador", 5800.0));
      funcionarios.add(new Funcionario("Gustavo", 26, "Analista Junior", 3300.0));

      Map<String, List<Funcionario>> funcionariosPorCargo = funcionarios.stream()
         .collect(Collectors.groupingBy(Funcionario::getCargo));
      System.out.println("Funcionários agrupados por cargo: ");
      funcionariosPorCargo.forEach((cargo, lista) -> {
         System.out.println(cargo + ": " + lista.stream().map(Funcionario::getNome).collect(Collectors.joining(", ")));
      });

      Map<String, Double> mediaSalarialPorCargo = funcionarios.stream()
         .collect(Collectors.groupingBy(Funcionario::getCargo, Collectors.averagingDouble(Funcionario::getSalario)));

      System.out.println("Média salarial por cargo: ");
      mediaSalarialPorCargo.forEach((cargo, media) -> System.out.println(cargo + ": " + media));
      */


      /**
       * 4. Mapear uma Lista de Objetos para um DTO 
          Crie uma classe Pedido com os atributos int id, String cliente, double valorTotal. 
          Crie um DTO (PedidoDTO) que contenha apenas id e valorTotal. 
          
          Objetivo: 
          • Criar uma lista de PedidoDTO a partir de uma lista de Pedido usando .map(p -> new PedidoDTO(p.getId(), p.getValorTotal())).
       */
      /*
      ArrayList<Pedido> pedidos = new ArrayList<>();
      pedidos.add(new Pedido(1, "João", 150.0));
      pedidos.add(new Pedido(2, "Maria", 250.0)); 
      pedidos.add(new Pedido(3, "Pedro", 100.0));
      pedidos.add(new Pedido(4, "Ana", 300.0));
      pedidos.add(new Pedido(5, "Lucas", 200.0));  
      pedidos.add(new Pedido(6, "Carla", 180.0));
      pedidos.add(new Pedido(7, "Rafael", 220.0));
      pedidos.add(new Pedido(8, "Fernanda", 90.0));

      List<PedidoDTO> pedidosDTO = pedidos.stream()
         .map(p -> new PedidoDTO(p.getId(), p.getValorTotal()))
         .collect(Collectors.toList());

      System.out.println("Lista de PedidoDTO: ");
      pedidosDTO.forEach(dto -> System.out.println("ID: " + dto.getId() + ", Valor Total: " + dto.getValorTotal()));
      */

      /**
       * 5. Redução e Soma de Valores Totais com Mapeamento 
          Crie uma classe Produto com os atributos String nome e double preco. 
          
          Objetivo: 
          • Criar uma lista intermediária contendo apenas os preços dos produtos usando map(). 
          • Somar os preços com Collectors.summingDouble(). 
          • Calcular a média de preços com Collectors.averagingDouble().
       */

      /*
      ArrayList<Produto> produtos = new ArrayList<>();
      produtos.add(new Produto("Garrafa", 100.0));
      produtos.add(new Produto("Monitor", 450.0));
      produtos.add(new Produto("Carregador", 20.0));
      produtos.add(new Produto("Cabo USB", 10.0));
      produtos.add(new Produto("Cafeteira", 300.0));
      produtos.add(new Produto("Lampada Int", 50.0));
      produtos.add(new Produto("Fone de Ouvido", 150.0));
      produtos.add(new Produto("Teclado", 80.0));
      
      Map<String, Double> precoPorProduto = produtos.stream()
         .collect(Collectors.toMap(Produto::getNome, Produto::getPreco));
      System.out.println("Preços por produto: ");
      precoPorProduto.forEach((nome, preco) -> System.out.println(nome + ": " + preco));

      double somaPrecos = produtos.stream()
         .collect(Collectors.summingDouble(Produto::getPreco));
      System.out.println("Soma dos preços dos produtos: " + somaPrecos);
      */

      /**
       * 6. Filtragem, Contagem e Transformação de Objetos 
          Crie uma classe Cliente com String nome e int idade. 
          
          Objetivo: 
          • Criar uma lista intermediária com clientes maiores de 18 anos. 
          • Contar quantos clientes possuem mais de 30 anos usando .count(). 
          • Criar uma lista apenas com os nomes dos clientes usando .map(Cliente::getNome). 
       */

      /*
      ArrayList<Cliente> clientes = new ArrayList<>();
      clientes.add(new Cliente("João", 25));
      clientes.add(new Cliente("Maria", 35));
      clientes.add(new Cliente("Pedro", 17));
      clientes.add(new Cliente("Ana", 40));
      clientes.add(new Cliente("Lucas", 17));
      clientes.add(new Cliente("Carla", 28));
      clientes.add(new Cliente("Rafael", 19));
      clientes.add(new Cliente("Fernanda", 31));
      clientes.add(new Cliente("Bruna", 16));
      clientes.add(new Cliente("Gustavo", 27));

      List<Cliente> clientesMaioresDe18 = clientes.stream()
         .filter(c -> c.getIdade() > 18)
         .collect(Collectors.toList());
      System.out.println("Clientes maiores de 18 anos: ");
      clientesMaioresDe18.forEach(c -> System.out.println(c.getNome() + " - " + c.getIdade()));

      long countClientesMaisDe30 = clientes.stream()
         .filter(c -> c.getIdade() > 30)
         .count();
      System.out.println("Quantidade de clientes com mais de 30 anos: " + countClientesMaisDe30);
      clientes.stream()
         .filter(c -> c.getIdade() > 30)
         .map(Cliente::getNome)
         .forEach(nome -> System.out.println("Cliente com mais de 30 anos: " + nome));

      List<String> nomesClientes = clientes.stream()
         .map(Cliente::getNome)
         .collect(Collectors.toList());
      System.out.println("Nomes dos clientes: " + nomesClientes);
      */

      /**
       * 7. Encontrar o Maior e o Menor Valor de uma Lista com Mapeamento 
          Crie uma lista de Produto e utilize Collectors.maxBy() e Collectors.minBy() para encontrar: 
          
          Objetivo: 
          • O produto mais caro e mais barato.
          • Criar uma lista intermediária contendo apenas os nomes dos produtos usando .map(Produto::getNome). 
       */

      /*
      ArrayList<Produto> produtos = new ArrayList<>();
      produtos.add(new Produto("Calça", 100.0));
      produtos.add(new Produto("Meias", 10.0));
      produtos.add(new Produto("Camiseta Regata", 20.0));  
      produtos.add(new Produto("Camisa Polo", 60.0));
      produtos.add(new Produto("Bermuda", 30.0));  
      produtos.add(new Produto("Tenis", 150.0));
      produtos.add(new Produto("Camiseta Basica", 40.0));
      produtos.add(new Produto("Mochila", 80.0));

      Produto produtoMaisCaro = produtos.stream()
         .collect(Collectors.maxBy(Comparator.comparing(Produto::getPreco)))
         .orElse(null);
      System.out.println("Produto mais caro: " + produtoMaisCaro.getNome());
         

      Produto produtoMaisBarato = produtos.stream()
         .collect(Collectors.minBy(Comparator.comparing(Produto::getPreco)))
         .orElse(null);
      System.out.println("Produto mais barato: " + produtoMaisBarato.getNome());

      System.out.println("Produtos: ");
      produtos.stream()
         .map(Produto::getNome)
         .forEach(nome -> System.out.println(nome));
      */
         
      /**
       * 8. Concatenar Strings de uma Lista e Criar uma Representação Textual 
          Crie uma interface Descritivel com um método String getDescricao(). 
          Crie uma classe Pessoa implementando Descritivel. 
          
          Objetivo: 
          • Criar uma lista intermediária contendo apenas descrições das pessoas usando .map(Pessoa::getDescricao). 
          • Concatenar todas as descrições em uma única string separada por vírgulas usando Collectors.joining(", ").  
       */
      /*
      ArrayList<Pessoa1> pessoas = new ArrayList<>();
      pessoas.add(new Pessoa1("João", 1.75f, 70.0f, "Preto"));
      pessoas.add(new Pessoa1("Maria", 1.60f, 60.0f, "Castanho"));
      pessoas.add(new Pessoa1("Pedro", 1.80f, 80.0f, "Loiro"));
      pessoas.add(new Pessoa1("Ana", 1.65f, 55.0f, "Ruivo"));
      pessoas.add(new Pessoa1("Lucas", 1.90f, 90.0f, "Preto"));
      pessoas.add(new Pessoa1("Carla", 1.70f, 65.0f, "Castanho"));

      List<String> descricoesPessoas = pessoas.stream()
         .map(Pessoa1::getDescricao)
         .collect(Collectors.toList());

      System.out.println("Descrições das pessoas: " + descricoesPessoas);
      */

      /**
       * 9. Conversão de Lista de Objetos para um Map Baseado em Identificadores 
          Crie uma classe Produto com os atributos int id, String nome, double preco. 
          
          Objetivo: 
          • Converter uma lista de Produto em um Map<Integer, Produto>, onde a chave é o id do produto. 
          • Utilize .collect(Collectors.toMap(Produto::getId, p -> p)).
       */



      /**
       * 10. Filtragem de Dados e Cálculo Estatístico 
          Crie uma classe Vendedor com os atributos String nome, double totalVendas. 
          
          Objetivo: 
          • Criar uma lista intermediária contendo apenas os vendedores que venderam mais de R$ 10.000,00. 
          • Encontrar o maior e o menor total de vendas usando Collectors.maxBy() e Collectors.minBy(). 
          • Criar uma lista contendo apenas os nomes dos vendedores usando .map(Vendedor::getNome). 
       */



      /**
       * 11. Criar e Agrupar Objetos por Status 
          Crie uma classe Pedido com os atributos int id, String cliente, String status ("Pendente", "Pago", "Cancelado"). 
          
          Objetivo: 
          • Criar uma lista intermediária contendo apenas os pedidos com status "Pago". 
          • Agrupar os pedidos por status em um Map<String, List<Pedido>> usando Collectors.groupingBy(Pedido::getStatus). 
       */



      /**
       * 12. Criar e Transformar Listas de Funcionários para Salários Ajustados 
          Crie uma classe Funcionario com os atributos String nome, double salario, String departamento. 
          
          Objetivo: 
          • Criar uma lista intermediária contendo apenas funcionários do departamento "TI". 
          • Aplicar um aumento de 10% nos salários usando .map(f -> new Funcionario(f.getNome(), f.getSalario() * 1.1, f.getDepartamento())). 
          • Criar um Map<String, Double> contendo o total dos salários por departamento usando .collect(Collectors.groupingBy(Funcionario::getDepartamento, Collectors.summingDouble(Funcionario::getSalario))).
       */



      /**
       * 13. Criar, Ordenar e Transformar Objetos de Uma Lista 
          Crie uma classe Livro com os atributos String titulo, String autor, double preco. 
          
          Objetivo: 
          • Ordenar a lista de livros por preço em ordem crescente e depois por autor em ordem alfabética. 
          • Criar uma lista intermediária contendo apenas os títulos dos livros usando .map(Livro::getTitulo). 
          • Criar uma única string contendo os títulos separados por " | " usando .collect(Collectors.joining(" | ")).
       */

    }

}
