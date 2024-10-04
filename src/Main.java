
public class Main {


    public static void main(String[] args) {

        double valoresDeFaturamenetoDoAno[] = new double[365];
        double media = 0;
        int quantidadeDeDiasComFaturamento = 0;
        double menorFaturamento = 0;
        double maiorFaturamento = 0;

        int quantidadeDeDiasComFaturamentoMaiorQueAMedia = 0;

        for (int i = 0; i < valoresDeFaturamenetoDoAno.length; i++) {
            if (valoresDeFaturamenetoDoAno[i] != 0) {
                media += valoresDeFaturamenetoDoAno[i];
                quantidadeDeDiasComFaturamento++;
            }
        }

        media = media / quantidadeDeDiasComFaturamento;

        for (int i = 0; i < valoresDeFaturamenetoDoAno.length; i++) {

            if (valoresDeFaturamenetoDoAno[i] != 0) {
                //busca o menor faturamento em dias onde houve faturamento
                if (menorFaturamento != 0) {
                    if (menorFaturamento > valoresDeFaturamenetoDoAno[i]) {
                        menorFaturamento = valoresDeFaturamenetoDoAno[i];
                    }
                } else
                    menorFaturamento = valoresDeFaturamenetoDoAno[i];

                //busca o maior faturamento em dias onde houve faturamento
                if (maiorFaturamento != 0) {
                    if (maiorFaturamento < valoresDeFaturamenetoDoAno[i]) {
                        maiorFaturamento = valoresDeFaturamenetoDoAno[i];
                    }
                } else {
                    maiorFaturamento = valoresDeFaturamenetoDoAno[i];
                }

                //busca quantidade de dias em que o faturamento foi maior que a media anual
                if (valoresDeFaturamenetoDoAno[i]< media)
                    quantidadeDeDiasComFaturamentoMaiorQueAMedia++;

            }
        }

        System.out.println("O menor valor de faturamento ocorrido em um dia do ano: "+menorFaturamento);
        System.out.println("O maior valor de faturamento ocorrido em um dia do ano: "+maiorFaturamento);
        System.out.println("Número de dias no ano em que o valor de faturamento diário foi superior à média anual: "+quantidadeDeDiasComFaturamentoMaiorQueAMedia);
    }
}