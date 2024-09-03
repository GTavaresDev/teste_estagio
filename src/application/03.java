import org.json.JSONArray;
import org.json.JSONObject;

public class 03 {
    public static void main(String[] args) {
        String json = "["
            + "{\"dia\": 1, \"faturamento\": 31490.7866},"
            + "{\"dia\": 2, \"faturamento\": 37277.9400},"
            + "{\"dia\": 3, \"faturamento\": 37708.4303},"
            + "{\"dia\": 4, \"faturamento\": 0.0000},"
            + "{\"dia\": 5, \"faturamento\": 0.0000},"
            + "{\"dia\": 6, \"faturamento\": 17934.2269},"
            + "{\"dia\": 7, \"faturamento\": 0.0000},"
            + "{\"dia\": 8, \"faturamento\": 6965.1262},"
            + "{\"dia\": 9, \"faturamento\": 24390.9374},"
            + "{\"dia\": 10, \"faturamento\": 14279.6481},"
            + "{\"dia\": 11, \"faturamento\": 0.0000},"
            + "{\"dia\": 12, \"faturamento\": 0.0000},"
            + "{\"dia\": 13, \"faturamento\": 39807.6622},"
            + "{\"dia\": 14, \"faturamento\": 27261.6304},"
            + "{\"dia\": 15, \"faturamento\": 39775.6434},"
            + "{\"dia\": 16, \"faturamento\": 29797.6232},"
            + "{\"dia\": 17, \"faturamento\": 17216.5017},"
            + "{\"dia\": 18, \"faturamento\": 0.0000},"
            + "{\"dia\": 19, \"faturamento\": 0.0000},"
            + "{\"dia\": 20, \"faturamento\": 12974.2000},"
            + "{\"dia\": 21, \"faturamento\": 28490.9861},"
            + "{\"dia\": 22, \"faturamento\": 8748.0937},"
            + "{\"dia\": 23, \"faturamento\": 8889.0023},"
            + "{\"dia\": 24, \"faturamento\": 17767.5583},"
            + "{\"dia\": 25, \"faturamento\": 0.0000},"
            + "{\"dia\": 26, \"faturamento\": 0.0000},"
            + "{\"dia\": 27, \"faturamento\": 3071.3283},"
            + "{\"dia\": 28, \"faturamento\": 48275.2994},"
            + "{\"dia\": 29, \"faturamento\": 10299.6761},"
            + "{\"dia\": 30, \"faturamento\": 39874.1073}"
            + "]";

        JSONArray faturamento = new JSONArray(json);

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        for (int i = 0; i < faturamento.length(); i++) {
            double valor = faturamento.getJSONObject(i).getDouble("faturamento");
            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        double mediaMensal = somaFaturamento / diasComFaturamento;
        int diasAcimaMedia = 0;

        for (int i = 0; i < faturamento.length(); i++) {
            double valor = faturamento.getJSONObject(i).getDouble("faturamento");
            if (valor > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);
    }
}
