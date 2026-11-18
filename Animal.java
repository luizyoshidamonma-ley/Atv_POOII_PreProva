package Aula_10.Atividade_24;

public abstract class Animal implements Sonoro{
    private String nome;
    private Porte porte;

  public Animal(String nome, Porte porte) {
    if (nome.isBlank() || nome==null){
      throw new IllegalArgumentException("O atributo Nome não pode estar vazio");
    }

    this.nome = nome;
    this.porte = porte;
  }

  public String getNome() {
    return nome;
  }

  public Porte getPorte() {
    return porte;
  }

  public void exibirDados(){
    System.out.println("Nome: "+getNome()+"\nPorte: "+getPorte());
    }

}
