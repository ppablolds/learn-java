import java.util.ArrayList;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e coloque as 7 notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(2.25);
        notas.add(9.0);
        notas.add(8.0);
        notas.add(6.5);
        notas.add(3.0);
        notas.add(10.0);
        System.out.println(notas.toString());

        System.out.println("Me mostra a posição da nota 3: " + notas.indexOf(3.0));
        System.out.println(notas);

        System.out.println("Adicione na lista a nota 1.0 na posição 4: ");
        notas.add(4, 1d);
        System.out.println(notas);

        System.out.println("Substitua o valor da nota 1.0 para 10.0: ");
        notas.set(notas.indexOf(1.0), 10d);
        System.out.println(notas);

        System.out.println("Confira se a nota 5 está na lista: " + notas.contains(5d));
    }
}
