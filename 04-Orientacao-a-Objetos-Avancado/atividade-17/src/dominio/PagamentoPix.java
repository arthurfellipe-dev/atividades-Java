package dominio;

public class PagamentoPix extends ProcessadorPagamento {


    public PagamentoPix() {

    }

    @Override
    public void validar() {
        System.out.println("validando pagamento pix...");
    }

    @Override
    public void calcularTaxa() {
        System.out.println("calculando taxa pix...");
    }

    @Override
    public void executar() {
        System.out.println("executando pagamento pix...");
    }

    @Override
    protected void notificar() {
        System.out.println("Pagamento Pix Processado");
    }
}
