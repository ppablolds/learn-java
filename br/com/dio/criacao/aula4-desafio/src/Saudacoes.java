
import java.time.LocalTime;

public class Saudacoes {

    public void horarioAtual() {
        LocalTime horario = java.time.LocalTime.now();
        System.out.println("Horário atual: " + horario);

        if (horario.getHour() < 12) {
            System.out.println("Bom dia!");
        } else if (horario.getHour() < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
