
//QUESTÃO 03

package atvlista2;

public class Quadrado {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
        area();
        perimetro();
    }
    
    void area() {
        System.out.println("Area do quadrado: " + lado * lado);
    }

    void perimetro() {
        System.out.println("Perimetro do quadrado: " + 4 * lado);
    }
}
