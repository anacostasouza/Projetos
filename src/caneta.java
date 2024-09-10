import java.util.Scanner;


class caneta {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite a quantidade de canetas: ");
    int canetas = scanner.nextInt();
    
    System.out.println("Digite a nota usada para pagamento em reais: ");
    double nota = scanner.nextDouble();
     
    System.out.println("Digite o valor do troco recebido: ");
    double troco = scanner.nextDouble();
    
    
    double valorTotal = nota - troco;
    
    double valorUnit = valorTotal / canetas;
    
    System.out.println("O valor unitario de cada caneta é de: " + valorUnit);
  
    scanner.close();
  }
}
