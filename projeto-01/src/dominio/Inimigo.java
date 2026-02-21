public class Inimigo {
    private int vida;
    private String nome;
    public Inimigo(int vida, String nome) {
        this.vida = vida;
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
