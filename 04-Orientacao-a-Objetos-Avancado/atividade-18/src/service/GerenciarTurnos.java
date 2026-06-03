package service;

import dominio.*;
import java.util.Random;

public final class GerenciarTurnos {

    public static void iniciarBatalha(Personagem p1, Personagem p2) {
        while (p1.isVivo() && p2.isVivo()) {
            p1.atacar(p2);
            if (p2.getVida() <= 0) break;
            p2.atacar(p1);
        }
    }

    public static boolean calcularHabilidade() {
        Random random = new Random();
        int chanceEspecial = random.nextInt(5) + 1;

        return chanceEspecial == 1;
    }
}


