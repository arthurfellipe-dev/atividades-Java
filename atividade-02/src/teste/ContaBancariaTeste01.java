package teste;

import dominio.ContaBancaria;

public class ContaBancariaTeste01 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.verSaldo();
        conta.depositar(100.00);
        conta.sacar(200.00);
        conta.verSaldo();
    }
}