package dominio;

import service.GerenciarTurnos;
import service.Impressora;

public abstract class Personagem implements Atacavel {
    private String nome;
    private int vida;
    private int dano;
    TipoPersonagem tipo;
    private String nomeHabilidade;


    public Personagem(String nome, int vida, int dano, TipoPersonagem tipo) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.tipo = tipo;
    }

    public Personagem(String nome, int vida, int dano, TipoPersonagem tipo, String nomeHabilidade) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.tipo = tipo;
        this.nomeHabilidade = nomeHabilidade;
    }

    public abstract void habilidadeEspecial();

    @Override
    public double atacar(Personagem personagemAlvo) {
        if (GerenciarTurnos.calcularHabilidade()) {
            habilidadeEspecial();
            Impressora.imprimirStatusHabilidade(this);
        }

        personagemAlvo.setVida(personagemAlvo.getVida() - this.dano);
        Impressora.imprimirStatusAtaque(this, personagemAlvo);

        return personagemAlvo.getVida();
    }

    public void incrementaDano(int dano) {
        this.dano += dano;
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

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getTipo() {
        return tipo.descricao();
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

}
