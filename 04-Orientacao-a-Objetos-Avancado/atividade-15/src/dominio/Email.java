package dominio;

public record Email(String destinatario, String assunto) implements Notificacao {

}
