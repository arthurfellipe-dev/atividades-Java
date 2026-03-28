package teste;

import dominio.Celular;

public class CelularTeste01  {
    public static void main(String[] args) {
        Celular celular = new Celular(2500, "A06", "Branco", "Samsung", "novo");
        Celular celular2 = new Celular();
        celular2.setCor("laranja");
        celular2.setMarca("apple");
        celular2.setModelo("iphone 16");
        celular2.setPreco(4500);
        celular2.setEstado("usado");

        celular2.imprime();
        celular.imprime();

        Celular.setDesconto(0.79);

        celular2.imprime();
        celular.imprime();

        Celular.setDesconto(1);


    }
}