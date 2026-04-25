package dominio;

public sealed abstract class Conta permits ContaCorrente, ContaPoupanca {
    protected double saldo;
    protected String titular;

    public Conta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public abstract double aplicarMensalmente();

    public double getSaldo() {
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}

