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
        if (ligado == true){
            System.out.println("O aparelho dvd ja esta ligado");
            return;
        }
        
        ligado = true;
    }
    
    public void desligar(){
        if (ligado == false){
            System.out.println("o aparelho dvd ja esta desligado");
            return;
        }
        
        ligado = false;
    }
    
    public Filme inserirFilme(Filme filme){
        if (ligado == false || filme == null || filmeInserido == true){
            System.out.println("erro");
            return null;
        }
        
        this.filme = filme;
        filmeInserido = true;

        return this.filme;
    }
    
    public Filme removerFilme(){
        if(filme != null &&  ligado == true){
            Filme filmeTemp = filme;
            filme = null;
            filmeInserido = false;
            return filmeTemp;
        } 
        if (ligado == true)
            System.out.println("erro");
        return null;
    }

    public void play(){
        if (filmeInserido != true || ligado != true) {
            System.out.println("erro");
            return;
        }
        
        System.out.println("Nome: " + filme.nome + "duracao: " + filme.duracao);
        reproduzindo = true;
    }    

    public void stop(){
        if ( reproduzindo != true || ligado != true ){
            System.out.println("erro");
            return;
        }
        System.out.println("filme parado");
        reproduzindo = false;
    }
    
    public int aumentarVolume() {
        if ( volume == 5 || ligado == false) {
            System.out.println("erro");
            return -1;
        }
        
        volume++;

        return volume;
    }

    public int diminuirVolume() {
        if ( volume == 1 || ligado == false){
            System.out.println("erro");
            return -1;
        }

        volume--;

        return volume;
    }
}


