import java.util.Scanner;

import.util.Scanner;    

public class mediaNota {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a nota de sua primeira prova: ");
    double  nota1 = scanner.nextDouble();

    System.out.println("Digite a nota de sua segunda prova: ");
    double nota2 = scanner.nextDouble();

    System.out.println("Digite a nota de sua terceira prova: ");
    double nota3 = scanner.nextDouble();

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.println("A sua media (resultado da soma de tres notas e a divisao entre elas) é de: " + media);

    scanner.close();
}
