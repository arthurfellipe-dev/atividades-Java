package dominio;

public final class ContaPoupanca extends Conta {
    private final double PERCENTUAL = 0.005;

    public ContaPoupanca(double saldo, String titular) {
        super(saldo, titular);
    }

    @Override
    public double aplicarMensalmente(){
        this.saldo += this.saldo * PERCENTUAL;
        return this.saldo;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "PERCENTUAL=" + PERCENTUAL +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}