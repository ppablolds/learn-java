
// import java.swing.*;
import java.io.*;
import javax.swing.JOptionPane;
public class CheckedExceptions {
    public static void main(String[] args) {
        String nomeArquivo = "LoremIpsum.txt";
        
        try {
            imprimirArquivoNoConsole(nomeArquivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Nome do arquivo inválido.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado na leitura, tente novamente mais tarde.");
        }

        System.out.println("Apesar da exceção, o programa continuou executando.");
    }

    public static void imprimirArquivoNoConsole(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}
