public class App {
    public static void main(String[] args) {
        /* Declarar uma variavel em Java segue sempre uma estrutura */
        //Estrutura
        // Tipo NomeBemDefinido = Atribução (opcional em alguns casos)

        //Exemplos
        // int idade = 18;
        // double altura = 1.80;
        // dog spike; // observe que aqui a variavel não possui atribuições

        /* Declarando metodos em Java segue uma estrutura bem simples */
        // Estrutura
        // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
        
        // Exemplos
        // int somar (int numeroUm, int numeroDois)
        // String formatarCep (long cep)

        String primeiroNome = "Pablo";
        String SegundoNome = "Lima Da Silva";
        String nomeCompleto = nomeCompleto(primeiroNome, SegundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
