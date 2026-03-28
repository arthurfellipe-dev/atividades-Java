package dominio;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
    private List<Funcionario> subordinados;

    public Gerente(String nome, double salario, Departamento departamento) {
        super(nome, salario, departamento);
        this.subordinados = new ArrayList<>();
    }

    public void adicionarSubordinado(Funcionario funcionario) {
        if (funcionario.getDepartamento() == this.departamento) {
            subordinados.add(funcionario);
            System.out.println(funcionario.getNome() + " adicionado a equipe de " + this.nome + "\n");
        } else {
            System.out.println("Não é possível adicionar " + funcionario.getNome() +
                    " (Departamento: " + funcionario.getDepartamento().nome() + ") a equipe de " + this.nome +
                    " (Departamento: " + this.departamento.nome() + ")\n");
        }
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Quantidade de subordinados: " + subordinados.size());
        if (subordinados.isEmpty()) {
            System.out.print("\n");
        }
        for (Funcionario funcionario : subordinados) {
            System.out.println("  - " + funcionario.getNome());
        }
    }
}