import java.util.Scanner;

public class salarioLiquido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora trabalhada: R$ ");
        double valorHora = scanner.nextDouble();

        System.out.println("Digite o numero de horas trabalhadas por mes: ");
        double quantidadeHoraMes = scanner.nextDouble();

        System.out.println("Digite o percetual do desconto de seu INSS: ");
        double percentual = scanner.nextDouble();

        double salarioBruto = valorHora * quantidadeHoraMes;

        double descontoInss = (percentual / 100) * salarioBruto;

        double salarioLiquido = salarioBruto - descontoInss;

        System.out.println("O valor liquido de seu salario atual é de: " + salarioLiquido);

        scanner.close();
    }
}