package teste;

import dominio.*;

public class PagamentoTest01 {
    public static void main(String[] args) {
        PagamentoCartao  pagamentoCartao = new PagamentoCartao();
        PagamentoPix pagamentoPix = new PagamentoPix();

        pagamentoCartao.processar();
        pagamentoPix.processar();
    }
}
