public class AparelhoDVD{
    boolean ligado, filmeInserido, reproduzindo;
    int volume;
    Filme filme;
    
    public AparelhoDVD(){
        ligado = false;
        volume = 2;
        filmeInserido = false;
        reproduzindo = false;
    }
    
    public void ligar(){
        if (ligado){
            System.out.println("O aparelho dvd ja esta ligado");
            return;
        }
        
        ligado = true;
    }
    
    public void desligar(){
        if (ligado){
            System.out.println("o aparelho dvd ja esta desligado");
            return;
        }
    }
    
    public Filme inserirFilme(Filme filme){
        if (!ligado || filme == null || filmeInserido){
            System.out.println("erro");
            return null;
        }
        
        this.filme = filme;
        filmeInserido = true;

        return this.filme;
    }
    
    public Filme removerFilme(){
        if(filme != null &&  ligado){
            Filme filmeTemp = filme;
            filme = null;
            filmeInserido = false;
            return filmeTemp;
        } 
        if (ligado)
            System.out.println("erro");
        return null;
    }

    public void play(){
        if (!filmeInserido|| !ligado) {
            System.out.println("erro");
            return;
        }
        
        System.out.println("Nome: " + filme.nome + "duracao: " + filme.duracao);
        reproduzindo = true;
    }    

    public void stop(){
        if ( !reproduzindo || !ligado ){
            System.out.println("erro");
            return;
        }
        System.out.println("filme parado");
        reproduzindo = false;
    }
    
    public int aumentarVolume() {
        if ( volume == 5 || !ligado) {
            System.out.println("erro");
            return -1;
        }
        
        volume++;

        return volume;
    }

    public int diminuirVolume() {
        if ( volume == 1 || !ligado){
            System.out.println("erro");
            return -1;
        }

        volume--;

        return volume;
    }
}


