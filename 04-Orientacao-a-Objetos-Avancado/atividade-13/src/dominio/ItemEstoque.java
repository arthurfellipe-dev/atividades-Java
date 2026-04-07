package dominio;

public sealed abstract class ItemEstoque permits Produto{
    private int quantidadeEmEstoque;
    private String codigo;

    public ItemEstoque(int quantidadeEmEstoque, String codigo) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.codigo = codigo;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "ItemEstoque{" +
                "quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
