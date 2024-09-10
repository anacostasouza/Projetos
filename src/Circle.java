import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o diametro do circulo: ");
        float diametro = scanner.nextInt();

        float quadrado = diametro * diametro;

        double area = quadrado * 3.14;

        System.out.println("O valor da area de seu circulo é: " + area);

        scanner.close();
    }
}
