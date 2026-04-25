package dominio;

import static dominio.TipoPersonagem.GUERREIRO;

public class Guerreiro extends Personagem{

    public Guerreiro(String nome) {
        super(nome, GUERREIRO.vidaBase(), GUERREIRO.danoBase(), GUERREIRO, "Corte Triplo");
    }

    @Override
    public void habilidadeEspecial() {
        super.setDano(GUERREIRO.danoBase());
        super.incrementaDano(40);
    }

    @Override
    public double atacar(Personagem personagemAlvo) {
        return super.atacar(personagemAlvo);
    }


}
