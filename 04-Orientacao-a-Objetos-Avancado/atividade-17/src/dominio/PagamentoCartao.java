package dominio;

public class PagamentoCartao extends ProcessadorPagamento {

    @Override
    public void validar() {
        System.out.println("Validando pagamento cartão...");
    }

    @Override
    public void calcularTaxa() {
        System.out.println("Calculando taxa cartão...");
    }

    @Override
    public void executar() {
        System.out.println("Executando pagamento cartão...");
    }

    @Override
    protected void notificar() {
        System.out.println("Pagamento cartão processado...");
    }
}
