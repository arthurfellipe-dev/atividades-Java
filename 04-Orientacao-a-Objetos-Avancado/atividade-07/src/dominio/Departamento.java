package dominio;

public enum Departamento {
    FINANCEIRO("Financeiro"),
    RH("Rh"),
    MARKETING("Marketing");

    private final String nome;

    Departamento(String nome) {
        this.nome = nome;
    }

    public String nome() {
        return nome;
    }
}
