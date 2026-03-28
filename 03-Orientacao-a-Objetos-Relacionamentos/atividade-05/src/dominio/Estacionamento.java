package dominio;

public class Estacionamento {
    private Carro[] vagas;

    public Estacionamento(int tamanho) {
        this.vagas = new Carro[tamanho];
    }

    public Carro[] getVagas() {
        return vagas;
    }

    public void setVagas(Carro[] vagas) {
        this.vagas = vagas;
    }

    public boolean estacionar(Carro carro) {
        for (int i = 0; i < this.vagas.length; i++) {
            if (this.vagas[i] == null) {
                this.vagas[i] = carro;
                System.out.printf("Vaga encontrada, %s estacionado na vaga %d %n", carro.getModelo(), i+1);
                return true;
            }
        }
        System.out.println("Nenhum vaga encontrada");
        return false;
    }

    public boolean sairDaVaga(int numeroVaga) {
        if (this.vagas[numeroVaga-1] != null) {
            this.vagas[numeroVaga-1] = null;
            System.out.println("saindo da vaga " + numeroVaga);
            return true;
        }
        System.out.println("Nenhum vaga encontrada");
        return false;
    }
}