package dominio;

public abstract class ProcessadorPagamento {

    public final void processar(){
        validar();
        calcularTaxa();
        executar();
        notificar();
    }

    public abstract void validar();
    public abstract void calcularTaxa();
    public abstract void executar();

    protected void notificar(){
        System.out.println("Pagamento processado");
    }

}
