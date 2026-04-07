package dominio;

public non-sealed class Produto extends ItemEstoque implements Tributavel{
    private static final double IMPOSTO = 0.12;
    private double valor;
    private String nome;

    public Produto(int quantidade,String nome ,String codigo, double valor) {
        super(quantidade, codigo);
        this.valor = valor;
        this.nome = nome;
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
