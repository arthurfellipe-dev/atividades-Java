package teste;

import dominio.Funcionario;
import dominio.Gerente;

public class GerenteTeste01  {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Aurélio", 22000, "RH");
        Funcionario funcionario = new Funcionario("Junior", 6700);
        gerente.imprime();
        funcionario.imprime();
    }
}