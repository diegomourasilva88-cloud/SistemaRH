import model.*;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Gerente gerente = criarGerente();

        System.out.println("Nome do departamento:");
        String nomeDep = sc.nextLine();

        Departamento departamento = new Departamento(nomeDep, gerente);

        Funcionario f1 = criarFuncionario();
        departamento.adicionarFuncionario(f1);

        Funcionario f2 = criarFuncionario();
        departamento.adicionarFuncionario(f2);

        gerarRelatorio(departamento);
    }

    // MÉTODO 1 - CRIAR GERENTE
    public static Gerente criarGerente() {
        System.out.println("Nome do gerente:");
        String nome = sc.nextLine();

        System.out.println("CPF:");
        String cpf = sc.nextLine();

        System.out.println("Data nascimento:");
        String data = sc.nextLine();

        return new Gerente(nome, cpf, data);
    }

    // MÉTODO 2 - CRIAR FUNCIONÁRIO
    public static Funcionario criarFuncionario() {

        System.out.println("Tipo (1-Analista / 2-Desenvolvedor):");
        int tipo = Integer.parseInt(sc.nextLine());

        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("CPF:");
        String cpf = sc.nextLine();

        System.out.println("Data nascimento:");
        String data = sc.nextLine();

        if (tipo == 1) {
            return new Analista(nome, cpf, data);
        } else {
            return new Desenvolvedor(nome, cpf, data);
        }
    }

    // MÉTODO 3 - RELATÓRIO
    public static void gerarRelatorio(Departamento d) {

        System.out.println("\n===== RELATÓRIO =====");

        System.out.println("Departamento: " + d.getNome());

        System.out.println("Gerente: " + d.getGerenteResponsavel().getNome());

        System.out.println("Funcionários:");

        for (Funcionario f : d.getFuncionarios()) {
            System.out.println("- " + f.getNome() + " (" + f.getClass().getSimpleName() + ")");
        }
    }
}