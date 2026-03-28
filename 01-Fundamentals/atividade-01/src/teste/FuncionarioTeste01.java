package teste;

import dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("maria", 19, 2500);
        funcionario.imprimeFuncionario();
    }
}
