import dominio.Divisor;

void main() {
    Divisor divisor = new Divisor();

    try{
        IO.println(divisor.dividir(2, 0));
    } catch(ArithmeticException e){
        IO.println("Erro ao tentar dividir " + e);
    } finally{
        IO.println("operação encerrada");
    }
}
