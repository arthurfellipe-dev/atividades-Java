package service;

import dominio.Professor;
import dominio.Seminario;
import dominio.Aluno;

public class SeminarioRelatorio {

    public void imprimirRelatorio(Professor professor) {
        System.out.println("\n\t\tRELATÓRIO DOS SEMINÁRIOS");

        if (professor == null || professor.getSeminarios() == null) {
            System.out.println("Erro ao encontrar os dados desse professor");
            return;
        }
        System.out.println("\nDocente: ");
        System.out.println("\tNome: " + professor.getNome());
        System.out.println("\tespecialidade: " + professor.getEspecialidade() + "\n");

        for (Seminario seminario : professor.getSeminarios()) {
            System.out.println("Seminários: ");
            System.out.println("\ttitulo: " + seminario.getTitulo());

            if (seminario.getLocal() != null) {
                System.out.println("\tLocal: " + seminario.getLocal().getEndereco() + "\n");
            }

            if (seminario.getAlunos()  != null && seminario.getAlunos().length > 0) {
                System.out.println("Alunos: ");
                int i = 1;
                for (Aluno aluno : seminario.getAlunos()) {
                    System.out.printf("\taluno %d: \n", i);
                    System.out.println("\t\tNome: " + aluno.getNome());
                    System.out.println("\t\tIdade: " + aluno.getIdade());
                    i++;
                }
            } else {
                System.out.println("Nenhum aluno encontrado");
            }

        }
    }
}
