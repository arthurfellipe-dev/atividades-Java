package dominio;

public enum TipoPersonagem {
    MAGO("Mago", 500,150),
    GUERREIRO("Guerreiro",1000, 75),
    ARQUEIRO("Arqueiro",750, 100);

    private final String descricao;
    private final int vidaBase;
    private final int danoBase;


    TipoPersonagem(String descricao, int vidaBase, int danoBase) {
        this.descricao = descricao;
        this.vidaBase = vidaBase;
        this.danoBase = danoBase;
    }

    public String descricao(){
        return descricao;
    }

    public int vidaBase(){
        return vidaBase;
    }

    public int danoBase(){
        return danoBase;
    }
}
