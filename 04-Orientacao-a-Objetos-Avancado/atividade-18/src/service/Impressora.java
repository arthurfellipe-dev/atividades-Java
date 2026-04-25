package service;

import dominio.Personagem;

public final class Impressora {

    public static void imprimirAtributos(Personagem p){
        System.out.println("====================");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Classe:" +p.getTipo());
        System.out.println("Vida: " + p.getVida());
        System.out.println("Dano: " + p.getDano());
    }

    public static void imprimirStatusAtaque(Personagem atacante, Personagem alvo){
        System.out.println(atacante.getNome() + " causou " + atacante.getDano() + " de dano em " + alvo.getNome());
        System.out.println("Vida de "+ alvo.getNome()  +": " + alvo.getVida());
    }

    public static void imprimirStatusHabilidade(Personagem p1) {
        System.out.println(p1.getNome() + " usou " + p1.getNomeHabilidade() +"!!");
    }

}
