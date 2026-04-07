import dominio.*;

public class Main {
    public static void main(String[] args) {
        Servico servico1 = new Servico("Manutenção", 120.0);
        Servico servico2 = new Servico("Consultoria", 200.0);

        Produto produto1 = new Produto(1, "Notebook Positivo", "xxx-xx", 3000);
        Produto produto2 = new Produto(2, "Mouse Samsung", "xxy-zz", 200);

        Tributavel[] tributaveis = {produto1, produto2, servico1, servico2};

        double total = CalculadoraTributo.somarImpostos(tributaveis);
        System.out.println("Total impostos: R$ " + total);

        for (Tributavel item : tributaveis) {
            if (item instanceof Produto p) {
                p.setQuantidadeEmEstoque(p.getQuantidadeEmEstoque() - 1);
                System.out.println("Vendido 1x " + p.getNome()
                        + " | Novo estoque: " + p.getQuantidadeEmEstoque());
            }
        }
    }
}
