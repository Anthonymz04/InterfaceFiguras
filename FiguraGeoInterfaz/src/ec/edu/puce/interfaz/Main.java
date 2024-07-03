package ec.edu.puce.interfaz;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(8, 9);
        Triangulo triangulo = new Triangulo(2, 8);
        Circulo circulo = new Circulo(12);

        System.out.println(rectangulo);
        System.out.println(triangulo);
        System.out.println(circulo);

        System.out.println("¿El rectángulo es > el triángulo? " + (rectangulo.mayorQue(triangulo) ? "verdadero" : "falso"));
        System.out.println("¿El círculo es > el rectángulo? " + (circulo.mayorQue(rectangulo) ? "verdadero" : "falso"));
    }
}
