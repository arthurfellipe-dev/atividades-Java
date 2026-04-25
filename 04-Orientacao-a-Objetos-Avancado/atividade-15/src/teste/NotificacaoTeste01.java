package teste;

import dominio.*;
import service.GerenciadorNotificacao;

public class NotificacaoTeste01 {
    public static void main(String[] args) {
        Notificacao email = new Email("contato@empresa.com", "Nova Promoção!");
        Notificacao sms = new SMS(99999999, "Seu código é: 1234");
        Notificacao push = new Push("iPhone 15", "Nova Mensagem");

        GerenciadorNotificacao.enviar(email);
        GerenciadorNotificacao.enviar(sms);
        GerenciadorNotificacao.enviar(push);
    }
}
