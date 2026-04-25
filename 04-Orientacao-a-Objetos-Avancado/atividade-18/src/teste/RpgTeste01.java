package teste;

import dominio.*;
import service.*;

public class RpgTeste01 {
    static void main(String[] args) {
        Personagem p1 = new Guerreiro("Green basin");
        Personagem p2 = new Mago("Red basin");

        GerenciarTurnos.iniciarBatalha(p1, p2);

    }
}
