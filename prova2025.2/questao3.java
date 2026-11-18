public class questao3 {
    public static int insertionSortCliente(Conta[] v, int tam) {
        for (int i = 1; i < tam; i++) {
            Conta contaAtual = v[i];
            int j = i - 1;

            while (j >= 0
                    && v[j].cliente.compareToIgnoreCase(contaAtual.cliente) > 0) {
                v[j + 1] = v[j];
                j--;
            }

            v[j + 1] = contaAtual;
        }

        return tam;
    }
}
