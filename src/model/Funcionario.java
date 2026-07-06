package model;

import interfaces.Trabalhador;


public abstract class Funcionario  implements   Trabalhador {
 private    String nome;
  private   String cpf;
  private   String dataNascimento;


      public abstract void trabalhar();

      @Override
      public void baterPonto(){
          System.out.println("ponto registrado");
      }








  public Funcionario (String nome, String cpf, String dataNascimento){
      this.nome =nome;
      this.cpf = cpf;
      this.dataNascimento = dataNascimento;




  } public String getNome(){
      return nome;
    }

    public String getCpf(){
      return  cpf;
    }
    public  String getDataNascimento(){
      return dataNascimento;
    }


}
