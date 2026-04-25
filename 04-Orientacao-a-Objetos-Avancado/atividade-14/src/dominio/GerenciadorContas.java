package dominio;

import java.util.List;

public class GerenciadorContas {

    public static void processarContas(List<Conta> contas){
        for(Conta conta : contas){
            conta.aplicarMensalmente();
        }
    }

    public static void imprimirSaldos(List<Conta> contas){
        for(Conta conta: contas)
            System.out.println(conta);
    }
}