package service;

import dominio.*;
import java.util.Random;

public final class GerenciarTurnos {

    private static int loopCombate(Personagem p1, Personagem p2) {
        while (p1.getVida() > 0 && p2.getVida() > 0) {
            p1.atacar(p2);
            if (p2.getVida() <= 0) {
                return 0;
            }
            p2.atacar(p1);
        }
        return 0;
    }

    public static void iniciarBatalha(Personagem p1, Personagem p2) {
        int statusLuta;
        do {
            statusLuta = GerenciarTurnos.loopCombate(p1, p2);
        } while (statusLuta == 1);

    }

    public static boolean calcularHabilidade() {
        Random random = new Random();
        int chanceEspecial = random.nextInt(5) + 1;

        return chanceEspecial == 1;
    }
}


