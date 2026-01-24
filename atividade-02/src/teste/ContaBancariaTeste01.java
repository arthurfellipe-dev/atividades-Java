package teste;

import dominio.ContaBancaria;

public class ContaBancariaTeste01 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        System.out.println("Saldo: "+ conta.getSaldo());
        conta.depositar(100.00);
        conta.sacar(200.00);
        System.out.println("Saldo: "+ conta.getSaldo());
    }
}