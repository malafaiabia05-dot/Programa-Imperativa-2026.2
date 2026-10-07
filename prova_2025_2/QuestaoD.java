public class QuestaoD {

    public static void rotacionar(int[] v, int tam, int k) {
        if (tam <= 1) return;

        k = k % tam;

        if (k < 0) {
            k = tam + k;
        }

        for (int r = 0; r < k; r++) {
            int temp = v[0];

            for (int i = 0; i < tam - 1; i++) {
                v[i] = v[i + 1];
            }

            v[tam - 1] = temp;
        }
    }
}
