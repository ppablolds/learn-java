import javax.swing.*;

public class UncheckedExceptions {
    public static void main(String[] args) throws Exception {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("O resultado da divisão e: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite apenas números.");
                System.out.println("Entrada inválida. Por favor, digite apenas números.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "O denominador não pode ser 0.");
                System.out.println("O denominador não pode ser 0.");
            }
        } while (continueLooping);

        System.out.println("O programa foi encerrado.");
    }

    public static int dividir(int a, int b) { return a / b; }
}
