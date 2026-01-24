package dominio;

public class ContaBancaria {
    private double saldo;

    public boolean sacar(double saque) {
        if (saque <= saldo && saque > 0) {
            saldo -= saque;
            System.out.println("saque de " + saque + " realizado com sucesso");
            return true;
        } else {
            System.out.println("tentativa de sacar " + saque + " falhou, Saldo insuficiente");
            return false;
        }
    }

    public boolean depositar(double deposito) {
        if (deposito > 0) {
            saldo += deposito;
            System.out.println(deposito + " depositado");
            return true;
        } else  {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

}
