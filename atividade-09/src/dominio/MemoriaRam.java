package dominio;

public class MemoriaRam {
    private int capacidade;
    private int frequencia;

    public MemoriaRam(int capacidade, int frequencia) {
        this.capacidade = capacidade;
        this.frequencia = frequencia;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getFrequencia() {
        return frequencia;
    }

    @Override
    public String toString() {
        return "Memoria RAM: " + capacidade + "GB, " + frequencia + "MHz";
    }
}
