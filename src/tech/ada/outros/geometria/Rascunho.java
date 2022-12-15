package tech.ada.outros.geometria;

public class Rascunho {

    public static void main(String[] args) {
        TrianguloEquilatero triangulo = new TrianguloEquilatero(3);
        Quadrado quadrado = new Quadrado(3);
        Retangulo retangulo = new Retangulo(2, 5);

        compararTamanhos(triangulo, quadrado);
        compararTamanhos(triangulo, retangulo);
        compararTamanhos(retangulo, quadrado);
    }

    public static void compararTamanhos(FiguraGeometrica figura1, FiguraGeometrica figura2) {
        double area1 = figura1.calculaArea();
        double area2 = figura2.calculaArea();

        if (area1 > area2) {
            System.out.println("Figura 1 é maior!");
        } else if (area1 < area2) {
            System.out.println("Figura 2 é maior!");
        } else {
            System.out.println("Ambas tem a mesma área!");
        }
    }

}

