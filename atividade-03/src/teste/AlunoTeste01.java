package teste;

import dominio.Aluno;
import dominio.StatusAluno;

public class AlunoTeste01  {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João Pedro Souza", "00012", "Engenharia da Computação");
        Aluno aluno2 = new Aluno("Maria Fernanda", "00123", "Medicina" );
        aluno2.setNome("Maria julia");
        aluno2.setCurso("Medicina");
        aluno2.setStatus(StatusAluno.TRANCADO);
        aluno.imprime();
        aluno2.imprime();
    }
}