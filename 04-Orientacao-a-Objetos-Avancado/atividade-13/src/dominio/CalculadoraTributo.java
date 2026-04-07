package dominio;

public class CalculadoraTributo {

    public static double somarImpostos(Tributavel[] itens){
        double soma = 0;
        for(Tributavel item: itens){
            soma += item.calcularImposto();
        }
        return soma;
    }
}
