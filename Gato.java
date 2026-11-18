package Aula_10.Atividade_24;

public class Gato extends Animal {

  @Override
  public void exibirDados() {
    super.exibirDados();
  }

  @Override
  public void emitirSom() {
    System.out.println("Miau!");
  }

  public Gato(String nome, Porte porte) {
    super(nome, porte);
  }
}
