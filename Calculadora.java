import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("--- CALCULADORA SIMPLES ---");

        System.out.print("Digite o primeiro número: ");
        double num1 = leitura.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = leitura.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = leitura.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        if (operacao == '+') {
            resultado = num1 + num2;
        } else if (operacao == '-') {
            resultado = num1 - num2;
        } else if (operacao == '*') {
            resultado = num1 * num2;
        } else if (operacao == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Não é possível dividir por zero!");
                operacaoValida = false;
            }
        } else {
            System.out.println("Operação inválida!");
            operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("Resultado: " + num1 + " " + operacao + " " + num2 + " = " + resultado);
        }

        leitura.close();
    }
}
