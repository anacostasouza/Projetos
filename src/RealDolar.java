import java.util.Scanner;

public class RealDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em dolár: ");
        double dolar = scanner.nextInt();

        double cotacaoDolar = 4.95;

        double real = dolar * cotacaoDolar;

        System.out.println("Aqui está seu valor em real: " + real);

        scanner.close();
    }

}
