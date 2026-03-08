package teste;

import dominio.Departamento;
import dominio.Funcionario;
import dominio.Gerente;

public class GerenteTeste02 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Marcos", 20000, Departamento.FINANCEIRO);

        Funcionario f1 = new Funcionario("jose", 5000, Departamento.FINANCEIRO);
        Funcionario f2 = new Funcionario("maria", 2500, Departamento.RH);
        Funcionario f3 = new Funcionario("Rose", 8900, Departamento.MARKETING);
        Funcionario f4 = new Funcionario("éric", 3000, Departamento.FINANCEIRO);

        gerente.imprime();

        f1.imprime();
        f2.imprime();
        f3.imprime();
        f4.imprime();

        gerente.adicionarSubordinado(f1);
        gerente.adicionarSubordinado(f2);
        gerente.adicionarSubordinado(f3);
        gerente.adicionarSubordinado(f4);

        gerente.imprime();
    }
}
