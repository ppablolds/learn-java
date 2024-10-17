
import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros
        int tempoFinal = paginas / paginasLidas;
        System.out.print(tempoFinal + " dias");

    }
}
