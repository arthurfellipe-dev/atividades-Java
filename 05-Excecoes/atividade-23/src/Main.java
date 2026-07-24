void main() {
    ContaBancaria contaBancaria = new ContaBancaria(890);

    try{
        contaBancaria.sacar(899);
    } catch (SaldoInsuficienteException e) {
        System.err.println("Erro ao sacar: " + e.getMessage());
    }
}