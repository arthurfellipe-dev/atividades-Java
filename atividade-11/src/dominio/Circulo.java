package dominio;
/*
A=π⋅r2
P=2⋅π⋅r
 */
public record Circulo(double raio) implements Calculavel {

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
