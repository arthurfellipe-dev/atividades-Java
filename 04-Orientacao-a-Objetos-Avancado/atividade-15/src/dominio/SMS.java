package dominio;

public record SMS(int telefone, String mensagem) implements Notificacao{

}
