package dominio;

public final class ContaCorrente extends Conta {
    private final double TARIFA = 12;

    public ContaCorrente(double saldo, String titular) {
        super(saldo, titular);
    }

    @Override
    public double aplicarMensalmente() {
        this.saldo -= TARIFA;
        return this.saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "TARIFA=" + TARIFA +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}