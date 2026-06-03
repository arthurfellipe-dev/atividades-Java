public class Conversor {

    public static int stringParaInt(String s, int valorPadrao){
        try{
            return Integer.parseInt(s);
        } catch(NumberFormatException e){
            return valorPadrao;
        }
    }
}
