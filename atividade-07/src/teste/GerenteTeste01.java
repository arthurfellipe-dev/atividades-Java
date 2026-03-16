package teste;

import dominio.Departamento;
import dominio.Funcionario;
import dominio.Gerente;

public class GerenteTeste01  {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Aurélio", 22000, Departamento.RH);
        Funcionario funcionario = new Funcionario("Junior", 6700, Departamento.MARKETING);


        gerente.imprime();
        funcionario.imprime();
    }
}