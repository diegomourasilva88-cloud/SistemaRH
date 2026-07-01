package model;

public class Funcionario {
 private    String nome;
  private   String cpf;
  private   String dataNascimento;

  public void trabalhar(){
  }

  public void baterponto(){
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
