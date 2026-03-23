package dominio;

public class Computador {
    private MemoriaRam memoriaRam;
    private Processador processador;
    private HD hd;
    private boolean ligado;

    public Computador(MemoriaRam memoriaRam, Processador processador, HD hd) {
        this.memoriaRam = memoriaRam;
        this.processador = processador;
        this.hd = hd;
        this.ligado = false;
    }

    public void ligar() {
        if (memoriaRam != null && processador != null && hd != null) {
            this.ligado = true;
            System.out.println("O computador foi ligado");
        } else {
            System.out.println("Erro: Componentes ausentes, não é possível ligar");
        }
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("O computador foi desligado");
    }

    public void instalarPrograma(String nome) {
        if (ligado) {
            System.out.println("Instalando " + nome + "...");
        } else {
            System.out.println("O computador precisa estar ligado para instalar programas");
        }
    }

}
