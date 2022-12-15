package tech.ada.outros.geometria;

public abstract class FiguraGeometrica {

    protected double[] lados;

    abstract double calculaArea();

    public double perimetro() {
        double perimetro = 0;
        for (double lado : lados) {
            perimetro += lado;
        }
        return perimetro;
    }
}
