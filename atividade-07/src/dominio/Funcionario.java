package dominio;

public class Funcionario {
    protected String nome;
    protected double salario;
    protected Departamento departamento;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(String nome, double salario, Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void imprime() {
        System.out.println("Nome: " + nome + "\n");
        System.out.println("Salario: " + salario + "\n");
        System.out.println("Departamento: " + this.departamento.nome() + "\n");
    }
}