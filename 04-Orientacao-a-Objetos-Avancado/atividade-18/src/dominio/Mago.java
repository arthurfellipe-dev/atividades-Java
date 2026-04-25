package dominio;

import static dominio.TipoPersonagem.MAGO;

public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, MAGO.vidaBase(), MAGO.danoBase(), MAGO, "Bola de Fogo");
    }

    @Override
    public void habilidadeEspecial() {
        super.setDano(MAGO.danoBase());
        super.incrementaDano(100);
    }

    @Override
    public double atacar(Personagem personagemAlvo) {
        return super.atacar(personagemAlvo);
    }
}
