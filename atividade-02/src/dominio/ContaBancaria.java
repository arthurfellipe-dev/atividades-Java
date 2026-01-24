package dominio;

public class ContaBancaria {
    private double saldo;

    public double sacar(double saque) {
        if (saque <= saldo) {
            saldo -= saque;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }

    public double depositar(double saque) {
        saldo += saque;
        return saldo;
    }

    public void verSaldo() {
        System.out.println(saldo);
    }
}
