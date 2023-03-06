package percentualdeestados;

public class PercentualDeEstados {

    public static void main(String[] args) {
        // valores de faturamento por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // calcula o valor total mensal da distribuidora
        double total = sp + rj + mg + es + outros;

        // calcula o percentual de representação de cada estado
        double porcentagem_sp = (sp / total) * 100;
        double porcentagem_rj = (rj / total) * 100;
        double porcentagem_mg = (mg / total) * 100;
        double porcentagem_es = (es / total) * 100;
        double porcentagem_outros = (outros / total) * 100;

        // exibe o resultado
        System.out.printf("Percentual de representação de cada estado:\n");
        System.out.printf("SP: %.2f%%\n", porcentagem_sp);
        System.out.printf("RJ: %.2f%%\n", porcentagem_rj);
        System.out.printf("MG: %.2f%%\n", porcentagem_mg);
        System.out.printf("ES: %.2f%%\n", porcentagem_es);
        System.out.printf("Outros: %.2f%%\n", porcentagem_outros);
    }
}
