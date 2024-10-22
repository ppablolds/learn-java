import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome?");
        String nome = scanner.next();

        System.out.println("Digite seu sobre-nome?");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura?");
        double altura = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobreNome + ", prazer em te conhcer!");
        System.out.println("Você tem " + idade + " anos de idade.");
        System.out.println("Você tem " + altura + "cm de altura.");
    }
}
