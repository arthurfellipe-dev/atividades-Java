package dominio;

public record Triangulo(double a, double b, double c) implements Calculavel {

    @Override
    public double calcularArea(){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    @Override
    public double calcularPerimetro(){
        return a + b + c;
    }
}
