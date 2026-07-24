public class GerenciadorArquivos {

    public static void lerArquivo(String nomeArquivo) throws ArquivoNaoEncontradoException {
        if (nomeArquivo == null || nomeArquivo.isBlank()) {
            throw new ArquivoNaoEncontradoException("arquivo não encontrado: " + nomeArquivo);
        }
        System.out.println("arquivo: " + nomeArquivo + " , lido com sucesso");
    }

}
