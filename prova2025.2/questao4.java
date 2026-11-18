public class questao4 {
    public static int filtraOperacoes(
            Operacao[] vOp, int tamOp, Operacao[] vOpFiltrado, int x) {
        int quantidade = 0;

        for (int i = 0; i < tamOp; i++) {
            if (vOp[i].idConta == x) {
                vOpFiltrado[quantidade] = vOp[i];
                quantidade++;
            }
        }

        return quantidade;
    }
}
