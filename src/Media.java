import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Escreva a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Escreva a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double somaNotas = nota1 + nota2 + nota3;

        double media = somaNotas / 3;

        System.out.println("A media de suas notas sao: " + media);

        scanner.close();
    }

}
