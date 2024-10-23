
import java.util.ArrayList;
import java.util.List;

public class ExampleList {

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Adele", 12, "Branca"));
            add(new Gato("Casito", 6, "Preto"));
            add(new Gato("Garfield", 10, "Laranja"));
        }};
        System.out.println(meusGatos);
    }
}

class Gato {

    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gato { ");
        sb.append("nome: ").append(nome);
        sb.append(", idade: ").append(idade);
        sb.append(", cor: ").append(cor);
        sb.append(" }");
        return sb.toString();
    }

}
