package tech.ada.outros.geometria;

public class TrianguloEquilatero extends FiguraGeometrica {

    public TrianguloEquilatero(double lado) {
        lados = new double[3];
        lados[0] = lado;
        lados[1] = lado;
        lados[2] = lado;
    }

    @Override
    double calculaArea() {
        return lados[0] * 1;
    }
}
