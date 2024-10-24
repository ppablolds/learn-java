
import javax.swing.*;
import java.io.*;

public class CustomException {

    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nApesar da exceção, o programa continuou executando.");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAbrirArquivoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado na leitura, tente novamente mais tarde.");
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAbrirArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAbrirArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAbrirArquivoException extends Exception {

    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAbrirArquivoException(String diretorio, String nomeDoArquivo) {
        super("O arquivio " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.diretorio = diretorio;
        this.nomeDoArquivo = nomeDoArquivo;
    }

    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImpossivelAbrirArquivoException{");
        sb.append("nomeDoArquivo=").append(nomeDoArquivo);
        sb.append(", diretorio=").append(diretorio);
        sb.append('}');
        return sb.toString();
    }
     */

}
