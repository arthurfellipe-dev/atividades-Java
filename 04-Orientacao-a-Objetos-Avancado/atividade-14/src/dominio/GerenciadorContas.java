package dominio;

import java.util.List;

public class GerenciadorContas {

    public static void processarContas(List<Conta> contas){
        for(Conta conta : contas){
            if (conta instanceof ContaPoupanca cp)
                cp.aplicarRendimento();
            if (conta instanceof ContaCorrente cc)
                cc.cobrarTarifaMensal();
        }
    }

    public static void imprimirSaldos(List<Conta> contas){
        for(Conta conta: contas)
            System.out.println(conta);
    }
}