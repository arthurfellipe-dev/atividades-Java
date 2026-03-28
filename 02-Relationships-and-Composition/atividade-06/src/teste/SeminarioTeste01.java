package teste;

import dominio.Aluno;
import dominio.Local;
import dominio.Professor;
import dominio.Seminario;
import service.SeminarioRelatorio;

public class SeminarioTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Rua Chile");

        Aluno aluno01 = new Aluno("João", 17);
        Aluno aluno02 = new Aluno("Sofia", 19);
        Aluno[] alunos = {aluno01, aluno02};

        Professor professor = new Professor("Maria", "Geografia");

        Seminario seminario = new Seminario("Impactos da Ia no ar", local, alunos);
        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);

        aluno01.setSeminario(seminario);
        aluno02.setSeminario(seminario);

        SeminarioRelatorio relatorio = new SeminarioRelatorio();
        relatorio.imprimirRelatorio(professor);
    }
}
