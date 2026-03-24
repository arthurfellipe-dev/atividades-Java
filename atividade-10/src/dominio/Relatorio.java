package dominio;

public class Relatorio implements Imprimivel {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo boleto");
    }
}
