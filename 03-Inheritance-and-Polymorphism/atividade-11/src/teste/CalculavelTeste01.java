package teste;

import dominio.*;

public class CalculavelTeste01 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(8.9);
        Retangulo retangulo = new Retangulo(12.0, 22.8);
        Triangulo triangulo = new Triangulo(11,12,13);

        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
        System.out.println(circulo);

        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());
        System.out.println(retangulo);

        System.out.println(triangulo.calcularArea());
        System.out.println(triangulo.calcularPerimetro());
        System.out.println(triangulo);
    }
}
