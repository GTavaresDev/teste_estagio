import java.util.Scanner;

public class 02 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = dados.nextInt();


        int a = 0, b = 1, fibonacci = 0;

        while (fibonacci < numero) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }

        if (fibonacci == numero || numero == 0) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }


      dados.close();
    }

    
}
