package model;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    @Override
    public void trabalhar() {
        System.out.println("gerenciando equipe");


    }

}