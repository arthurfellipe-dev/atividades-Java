package teste;

import dominio.Estacionamento;
import dominio.Carro;

public class EstacionamentoTeste01 {
    public static void main(String[] args) {
        Estacionamento condominio = new Estacionamento(2);

        Carro carro1 = new Carro("Camaro", "123-4322");
        Carro carro2 = new Carro("fusca", "999-9999");
        Carro carro3 = new Carro("uno", "XXX-XXXX");

        condominio.estacionar(carro1);
        condominio.estacionar(carro2);
        condominio.estacionar(carro3);

        condominio.sairDaVaga(1);

        condominio.estacionar(carro3);
    }
}