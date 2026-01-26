package dominio;

public class Celular {
    private double preco;
    private String modelo;
    private String cor;
    private String marca;
    private String estado;
    private static double desconto = 0.25;
    private static final double LIMITE_DESCONTO = 0.80;

    public Celular(double preco, String modelo, String cor, String marca, String estado) {
        this.preco = preco;
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.estado = estado;
    }

    public Celular() {
    }

    public double calcularPreco() {
        return this.preco * (1 - desconto) ;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }

    public static double getDesconto() { return desconto; }

    public static void setDesconto(double desconto) {
        if (desconto < 0 || desconto > LIMITE_DESCONTO) {
            System.out.printf("erro ao tentar implementar %.2f%% de desconto, desconto inválido", desconto * 100);
            return;
        }
        Celular.desconto = desconto;
        System.out.println("Desconto alterado para " + (desconto * 100) + "%\n");
    }

    public void imprime() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: " + this.preco);
        System.out.println("Estado: " + this.estado);
        System.out.println("Desconto: " + Celular.desconto * 100 + "%");
        System.out.printf("Preço com desconto: R$ %.2f%n%n", calcularPreco());
    }
}