import java.util.Scanner;

public class Questao1 {
    public static final int TAM_CONTAS = 50;
    public static final int TAM_OP = 1000;

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Conta[] contas = new Conta[TAM_CONTAS];
        cadastrarConta(contas, 0);
    }

    public static int cadastrarConta(Conta[] v, int tam) {
        if (tam >= TAM_CONTAS) {
            System.out.println("Erro: Limite máximo de contas atingido.");
            return tam;
        }

        int id;
        do {
            System.out.print("Digite o ID da nova conta: ");
            id = input.nextInt();
            if (buscaId(v, tam, id) != -1) {
                System.out.println("Erro: Já existe uma conta com este ID.");
            }
        } while (buscaId(v, tam, id) != -1);

        input.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String cliente = input.nextLine();

        double saldo = lerValorNaoNegativo("Digite o saldo inicial: ");
        double limite = lerValorNaoNegativo("Digite o limite da conta: ");

        Conta novaConta = new Conta();
        novaConta.id = id;
        novaConta.cliente = cliente;
        novaConta.saldo = saldo;
        novaConta.limite = limite;

        v[tam] = novaConta;
        System.out.println("Conta cadastrada com sucesso!");
        return tam + 1;
    }

    public static int buscaId(Conta[] contas, int tam, int id) {
        for (int i = 0; i < tam; i++) {
            if (contas[i].id == id) {
                return i;
            }
        }
        return -1;
    }

    public static double lerValorNaoNegativo(String mensagem) {
        double valor;
        do {
            System.out.print(mensagem);
            valor = input.nextDouble();
            if (valor < 0) {
                System.out.println("Erro: O valor não pode ser negativo.");
            }
        } while (valor < 0);
        return valor;
    }

    public static String obterNomeOperacao(char tipo) {
        switch (Character.toUpperCase(tipo)) {
            case 'D':
                return "Depósito";
            case 'S':
                return "Saque";
            case 'T':
                return "Transferência";
            default:
                return "Desconhecida";
        }
    }

    public static String formatarValorCD(double valor) {
        char indicador = (valor >= 0) ? 'C' : 'D';
        return String.format("%.2f%c", Math.abs(valor), indicador);
    }
}
