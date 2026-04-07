package teste;

import dominio.Conta;
import dominio.ContaCorrente;
import dominio.ContaPoupanca;
import dominio.GerenciadorContas;

import java.util.ArrayList;
import java.util.List;

public class ContaTeste01 {
    public static void main(String[] args) {
        Conta contaP1 = new ContaPoupanca(1000, "João Pedro");
        Conta contaC1 = new ContaCorrente(8080, "Maria Antonia");

        List<Conta> contas = new ArrayList<>();

        contas.add(contaP1);
        contas.add(contaC1);

        GerenciadorContas.processarContas(contas);
        GerenciadorContas.imprimirSaldos(contas);
    }
}