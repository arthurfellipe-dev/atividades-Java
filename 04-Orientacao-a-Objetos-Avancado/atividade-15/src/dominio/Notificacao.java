package dominio;

public sealed interface Notificacao permits Email, SMS, Push{

}
