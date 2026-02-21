public class Jogador {
    private String nome;
    private static int vida = 100;

    public Jogador(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

}
