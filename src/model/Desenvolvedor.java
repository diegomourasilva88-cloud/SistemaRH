package model;

public class Desenvolvedor extends Funcionario{


    public Desenvolvedor (String nome, String cpf, String dataNascimento){

        super(nome, cpf, dataNascimento);


    }@Override
    public void trabalhar(){
        System.out.println("desenvolvendo");

    }@Override
    public void baterPonto(){
        System.out.println("ponto registrado");
    }
}