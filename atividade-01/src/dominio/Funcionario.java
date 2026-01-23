package dominio;

public class Funcionario {
    String name;
    int idade;
    double salario;

    public Funcionario(String name, int idade, double salario){
        this.name = name;
        this.idade = idade;
        this.salario = salario;
    }

    public Funcionario(){
    }

    public void imprimeFuncionario() {
        System.out.println(this.name);
        System.out.println(this.idade);
        System.out.println(this.salario);
    }
}
