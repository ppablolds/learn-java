public class Quadrilatero {
    public static double area(double lado) {
        //System.out.println("A área do quadrado é: " + lado * lado);
        return lado * lado;
    }

    public static double area(double lado1, double lado2) {
        //System.out.println("A área do retângulo é: " + lado1 * lado2);
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        //System.out.println("A área do trapezio é: " + ((baseMaior + baseMenor) * altura) / 2);
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}
