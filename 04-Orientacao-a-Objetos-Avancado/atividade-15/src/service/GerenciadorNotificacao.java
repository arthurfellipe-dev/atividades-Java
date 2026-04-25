package service;

import dominio.*;

public class GerenciadorNotificacao {

    public static void enviar(Notificacao n){
        switch (n){
            case Email e ->
                    System.out.println("enviando email a: " + e.destinatario());
            case SMS s ->
                    System.out.println("enviando SMS a: " + s.telefone());
            case Push p ->
                    System.out.println("enviando push a: " + p.titulo());
        }
    }
}
