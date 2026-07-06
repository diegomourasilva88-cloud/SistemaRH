package model;
import java.util.ArrayList;
import java.util.List;

public class Departamento {

   private Gerente gerenteResponsavel;
   private String nome;
   private List<Funcionario> funcionarios = new ArrayList<>();

   public Departamento ( String nome, Gerente gerenteResponsavel){
       this.nome = nome;
       this.gerenteResponsavel = gerenteResponsavel;

   } public String getNome(){
       return nome;
    }

    public Gerente getGerenteResponsavel() {
        return gerenteResponsavel;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
}
