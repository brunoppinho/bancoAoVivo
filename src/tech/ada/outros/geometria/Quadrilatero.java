package tech.ada.outros.geometria;

public class Quadrilatero extends FiguraGeometrica {

    public double angulo1;
    public double angulo2;
    public double angulo3;
    public double angulo4;

    public Quadrilatero(double tamanhoLado1, double tamanhoLado2, double tamanhoLado3, double tamanhoLado4, double angulo1, double angulo2, double angulo3, double angulo4) {
        lados = new double[4];
        lados[0] = tamanhoLado1;
        lados[1] = tamanhoLado2;
        lados[2] = tamanhoLado3;
        lados[3] = tamanhoLado4;
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
        this.angulo3 = angulo3;
        this.angulo4 = angulo4;
    }

    double calculaArea() {
        return ((lados[0] + lados[2]) / 2) * ((lados[1] + lados[3]) / 2);
    }
    
}
