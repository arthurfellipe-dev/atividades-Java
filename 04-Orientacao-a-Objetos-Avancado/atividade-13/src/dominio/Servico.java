package dominio;

public class Servico implements Tributavel{
    private static final double IMPOSTO = 0.06;
    private String descricao;
    private double valor;

    public Servico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
