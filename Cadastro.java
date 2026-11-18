package Aula_10.Atividade_24;

import java.util.ArrayList;
import java.util.List;

public class Cadastro<T> {
  List<T> lista = new ArrayList<>();

  public void adicionar(T elemento){
    lista.add(elemento);
  }

  public void getElementos(T elemento){
    adicionar(elemento);
    lista.forEach(e -> System.out.println(e));
  }
}
