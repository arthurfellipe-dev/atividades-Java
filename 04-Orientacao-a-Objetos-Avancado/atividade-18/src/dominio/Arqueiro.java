package dominio;

import static dominio.TipoPersonagem.ARQUEIRO;

public class Arqueiro extends Personagem{

    public Arqueiro(String nome){

        super(nome, ARQUEIRO.vidaBase(), ARQUEIRO.danoBase(), ARQUEIRO, "Chuva de flechas");
    }

    @Override
    public void habilidadeEspecial() {
        super.setDano(ARQUEIRO.danoBase());
        super.incrementaDano(75);
    }


    @Override
    public double atacar(Personagem personagemAlvo) {
        return super.atacar(personagemAlvo);
    }

}
