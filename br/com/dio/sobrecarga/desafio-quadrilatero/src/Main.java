public class Main {
    public static void main(String[] args) throws Exception {
        
        //Quadrilatero
        System.out.println("Exercicio Quadrilatero: ");

        double quadrado = Quadrilatero.area(3);
        System.out.println("A área do quadrado é: " + quadrado);

        double retangulo = Quadrilatero.area(4, 5);
        System.out.println("A área do retangulo é: " + retangulo);

        double trapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("A área do trapezio é: " + trapezio);
    }
}
