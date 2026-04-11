package dominio;

public sealed interface Notificacao permits Email, SMS, Push{
    default void enviar(Notificacao n){
        System.out.println("enviando notificação...");
    }
}
