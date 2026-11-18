package Aula_10.Atividade_24;

public class Cachorro extends Animal{

  public Cachorro(String nome, Porte porte) {
    super(nome, porte);
  }

  @Override
  public void emitirSom() {
    System.out.println("Au Au Woof Woof");
  }

  @Override
  public void exibirDados() {
    super.exibirDados();
  }
}
