public class 04 {
    public static void main(String[] args) {
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;

        double total = SP + RJ + MG + ES + Outros;

        System.out.println("Percentual de SP: " + (SP / total) * 100 + "%");
        System.out.println("Percentual de RJ: " + (RJ / total) * 100 + "%");
        System.out.println("Percentual de MG: " + (MG / total) * 100 + "%");
        System.out.println("Percentual de ES: " + (ES / total) * 100 + "%");
        System.out.println("Percentual de Outros: " + (Outros / total) * 100 + "%");
    }
}
