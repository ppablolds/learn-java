
public class App {

    public static void main(String[] args) {

        //Sempre que a variavel estiver toda em letra maiuscula, é um indicador de que ele e inalterada
        final String BR = "Brasil"; //Este "final" indica que a variavel não pode ser alterada

        int ano = 2024; //Ao contrario que todos que não tiverem o "final", podem ser alterados

        ano = 2025;

        //DECLARAÇÕES INVALIDAS
        // int numero&um = 1; // Os unicos simbolos permitidos são $ e _
        // int 1numero = 1; // Uma variavel não pode começar com numeros
        // int numero um = 1; // Não deve ter espaços nos nomes das variaveis
        // int long = 1; // long faz parte das palavras reservadas do JAVA (Não pode usar palavras reservadas nas variaveis)

        //DECLARAÇÕES VALIDAS
        // int numero$um = 1;
        // int numero1 = 1;
        // int numero_um = 1;
        // int longo = 1;

    }
}
