package teste;

import dominio.*;

public class Main {
    public static void main(String[] args) {
        MemoriaRam ram = new MemoriaRam(16, 3200);
        Processador cpu = new Processador("Intel i7-12700K", 12);
        HD disco = new HD(1000, "SSD NVMe");

        Computador pc = new Computador(ram, cpu, disco);

        pc.ligar();
        pc.instalarPrograma("Photoshop");
        pc.desligar();
    }
}
