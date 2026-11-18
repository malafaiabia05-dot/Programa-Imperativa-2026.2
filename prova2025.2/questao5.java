public class questao5 {
    public static void extrato(
            Conta[] contas, int tamContas,
            Operacao[] vOp, int tamOp, int idConta) {
        Conta conta = null;
        for (int i = 0; i < tamContas; i++) {
            if (contas[i].id == idConta) {
                conta = contas[i];
                break;
            }
        }

        if (conta == null) {
            System.out.println("Erro: Conta não encontrada.");
            return;
        }

        Operacao[] operacoesConta = new Operacao[tamOp];
        int quantidade = questao4.filtraOperacoes(
                vOp, tamOp, operacoesConta, idConta);
        int inicioUltimasOperacoes = Math.max(0, quantidade - 5);
        double saldo = 0.0;

        for (int i = 0; i < inicioUltimasOperacoes; i++) {
            saldo += operacoesConta[i].valor;
        }

        System.out.println("Extrato da conta " + conta.id);
        System.out.println("Cliente: " + conta.cliente);
        System.out.println("Saldo anterior: " + Questao1.formatarValorCD(saldo));

        for (int i = inicioUltimasOperacoes; i < quantidade; i++) {
            Operacao operacao = operacoesConta[i];
            saldo += operacao.valor;
            System.out.println(
                    operacao.tipo + ": "
                    + Questao1.formatarValorCD(operacao.valor)
                    + " | Saldo: " + Questao1.formatarValorCD(saldo));
        }

        System.out.println("Saldo atual: " + Questao1.formatarValorCD(saldo));
    }
}
