package model;

public  class  Analista extends Funcionario {


    public Analista(String nome, String cpf, String dataNascimento){
        super (nome, cpf,dataNascimento);

    } @Override
    public void trabalhar(){
        System.out.println("analisando");
    }
    @Override
    public void baterPonto(){
        System.out.println("ponto registrado");
    }
}
