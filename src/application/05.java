import java.util.Scanner;

public class 05 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = dados.nextLine();
        dados.close();

        char[] caracteres = input.toCharArray();
        String invertida = "";

        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }

        System.out.println("String invertida: " + invertida);

        dados.close();
    }
}
