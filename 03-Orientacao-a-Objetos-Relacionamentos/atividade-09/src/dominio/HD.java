package dominio;

public class HD {
    private int armazenamento;
    private String tipo;

    public HD(int armazenamento, String tipo) {
        this.armazenamento = armazenamento;
        this.tipo = tipo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "dominio.HD: " + armazenamento + "GB (" + tipo + ")";
    }
}
