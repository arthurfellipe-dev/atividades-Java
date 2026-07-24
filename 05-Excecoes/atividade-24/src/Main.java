void main() {
    String a = "Teste";
    
    try {
        GerenciadorArquivos.lerArquivo(a);
    } catch (Exception e) {
        System.err.println("erro ao tentar ler arquivo, " + e.getMessage());
    }
}