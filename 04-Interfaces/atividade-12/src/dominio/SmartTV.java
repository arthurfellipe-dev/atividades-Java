package dominio;

public class SmartTV implements Ligavel,  Conectavel {
    String rede;
    Boolean conectado;
    Boolean ligado;

    public SmartTV() {
        this.ligado = false;
        this.conectado = false;
    }

    @Override
    public void conectar(String rede) {
        if (ligado == false) {
            System.out.println("Conectando... Erro ao conectar, TV desligada");
            return;
        }
        this.rede = rede;
        this.conectado = true;
        System.out.println("Conectando... " + this.rede);
    }

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("Ligando...");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("Desligando...");
    }
}
