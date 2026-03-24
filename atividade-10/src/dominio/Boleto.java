package dominio;

public class Boleto implements Imprimivel {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo boleto");
    }
}
