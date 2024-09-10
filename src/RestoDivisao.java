import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (X): ");
        int x = scanner.nextInt();

        System.out.print("Digite o segundo número (Y): ");
        int y = scanner.nextInt();

        int resto = x % y;

        System.out.println("O resto da divisão de " + x + " por " + y + " é: " + resto);

        scanner.close();
    }
}
