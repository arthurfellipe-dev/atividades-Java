package dominio;

public record Retangulo(double base, double altura) implements Calculavel {

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
