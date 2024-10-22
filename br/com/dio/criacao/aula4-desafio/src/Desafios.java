
/* 
 * Criar uma aplicação que mostre resolva as seguintes situações:
 * [ X ] Calcule as 4 operaçoes matemáticas: soma, subtração, divisão e multiplicação.
 * [ X ] A partir da hora do dia, informe a mensagem adequada: "Bom dia" "Boa tarde" ou "Boa noite"
 * [ X ] Calcule o valor final de um emprestimo, a partir do valor solicitado. Taxas e parcelas influenciam.
 * Defina arbitramente as taxas que influenciam nos valores.
 */
public class Desafios {

    public static void main(String[] args) {
        System.out.println("Resolvendo desafios em Java");

        /* OPERAÇÃO DE SOMA */
        Operacoes somar = new Operacoes();

        somar.soma(somar.num1, somar.num2);

        /* OPERAÇÃO DE SUBTRAÇÃO */
        Operacoes subtrair = new Operacoes();

        subtrair.subtracao(subtrair.num1, subtrair.num2);

        /* OPERAÇÕES DE MULTIPLICAÇÃO */
        Operacoes multiplicar = new Operacoes();

        multiplicar.multiplicacao(multiplicar.num1, multiplicar.num2);

        /* OPERAÇÃO DE DIVISÃO */
        Operacoes dividir = new Operacoes();

        dividir.divisao(dividir.num1, dividir.num2);

        /* SAUDAÇÕES */
        System.out.println("------------------------------------------");
        System.out.println("Saudações");

        Saudacoes saudacoes = new Saudacoes();
        saudacoes.horarioAtual();

        /* EMPRESTIMO */
        System.out.println("------------------------------------------");
        System.out.println("Emprestimo");
        Emprestimo.calcular(1000.0, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000.0, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000.0, 5);

    }
}
