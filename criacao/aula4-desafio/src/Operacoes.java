
import java.util.Scanner;

public class Operacoes {
    int num1;
    int num2;

    public void soma(int num1, int num2) {

        System.out.println("------------------------------------");
        System.out.println("OPERÇÃO DE SOMA");

        this.num1 = num1;
        this.num2 = num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        num2 = scanner.nextInt();

        System.out.println("A soma de " + num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public void subtracao(int num1, int num2) {

        System.out.println("------------------------------------");
        System.out.println("OPERÇÃO DE SUBTRAÇÃO");

        this.num1 = num1;
        this.num2 = num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        num2 = scanner.nextInt();

        System.out.println("A subtração de " + num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public void multiplicacao(int num1, int num2) {

        System.out.println("------------------------------------");
        System.out.println("OPERÇÃO DE MULTIMIPLICAÇÃO");

        this.num1 = num1;
        this.num2 = num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        num2 = scanner.nextInt();

        System.out.println("A multiplicação de " + num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public void divisao(int num1, int num2) {

        System.out.println("------------------------------------");
        System.out.println("OPERÇÃO DE DIVISÃO");

        this.num1 = num1;
        this.num2 = num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        num2 = scanner.nextInt();

        System.out.println("A Divisão de " + num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
