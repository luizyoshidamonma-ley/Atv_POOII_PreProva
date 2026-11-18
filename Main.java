package Aula_10.Atividade_24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int index = 0;

    List<Animal> an = new ArrayList<>();

    while (index < 3) {
      try {
        System.out.println("\nQual animal a ser cadastrado?\n1) Cachorro\n2) Gato");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
          case 1:
            System.out.println("Qual o nome do cachorro?");
            String nomeCachorro = sc.nextLine();

            System.out.println("Qual o porte? \n1 - PEQUENO\n2 - MEDIO\n3 - GRANDE");
            int opcaoPorteCachorro = sc.nextInt();
            sc.nextLine();

            Porte porteCachorro = null;
            switch (opcaoPorteCachorro) {
              case 1:
                porteCachorro = Porte.PEQUENO;
                break;
              case 2:
                porteCachorro = Porte.MEDIO;
                break;
              case 3:
                porteCachorro = Porte.GRANDE;
                break;
              default:
                System.out.println("Porte inválido!");
                break;
            }


            if (porteCachorro != null) {
              Cachorro cachorro = new Cachorro(("Cachorro "+nomeCachorro), porteCachorro);
              System.out.println("Cachorro cadastrado com sucesso!");
              an.add(cachorro);
              index++;
            }
            break;

          case 2:
            System.out.println("Qual o nome do gato?");
            String nomeGato = sc.nextLine();

            System.out.println("Qual o porte? \n1 - PEQUENO\n2 - MEDIO\n3 - GRANDE");
            int opcaoPorteGato = sc.nextInt();


            Porte porteGato = null;
            switch (opcaoPorteGato) {
              case 1:
                porteGato = Porte.PEQUENO;
                break;
              case 2:
                porteGato = Porte.MEDIO;
                break;
              case 3:
                porteGato = Porte.GRANDE;
                break;
              default:
                System.out.println("Porte inválido!");
                break;
            }


            if (porteGato != null) {
              Gato gato = new Gato(("Gato "+nomeGato), porteGato);
              System.out.println("Gato cadastrado com sucesso!");
              an.add(gato);
              index++;
            }
            break;

          default:
            System.out.println("Opção inválida! Tente novamente.");

            break;
        }

      } catch (Exception e) {
        System.out.println("Ocorreu um erro: " + e);
        sc.nextLine();
      }
    }

    System.out.println("\nCadastro finalizado!");

    an.forEach(a -> {
      a.exibirDados();
      a.emitirSom();
      System.out.println();
    });

    System.out.println("_________ ENCADEAMENTO_______");
    List<String> pequeno = an.stream()
      .filter(a -> (a.getPorte() == Porte.PEQUENO))
      .map(a -> a.getNome())
        .toList();
    pequeno.forEach(p -> System.out.println("Existem "+p+" Animais pequenos"));

    List<String> dog = an.stream().filter(a -> a instanceof Cachorro).map(a -> a.getNome()).toList();
    System.out.println("Existem "+dog.size()+" Cachorros");
    System.out.println("Existem "+(an.size()-dog.size())+" Gatos");



    sc.close();
  }



}
