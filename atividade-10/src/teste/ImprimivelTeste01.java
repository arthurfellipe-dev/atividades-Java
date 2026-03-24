package teste;

import dominio.*;

import java.util.ArrayList;
import java.util.List;

public class ImprimivelTeste01 {
    public static void main(String[] args) {
        List<Imprimivel> lista = new ArrayList<>();

        lista.add(new Nota());
        lista.add(new Relatorio());
        lista.add(new Boleto());

        for (Imprimivel doc : lista) {
            doc.imprimir();
        }
    }
}
