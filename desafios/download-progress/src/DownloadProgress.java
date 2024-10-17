
import java.util.Scanner;

public class DownloadProgress {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download
        int barras = tamanho / 1;

        for (int i = 0; i < barras; i++) {
            System.out.print("/");
        }

        leitor.close();

    }
}
