
import java.util.Scanner; 

class Troca {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o primeiro valor: ");
    double valor1 = scanner.nextInt();
    
    System.out.println("Digite o segundo valor: ");
    double valor2 = scanner.nextInt();
    
    double troca = valor1;
    	valor1 = valor2;
      	valor2 = troca;
      
    System.out.println("Após a troca: Valor 1 = " + valor1 + " e" + " Valor 2 = " + valor2);
    
    scanner.close();
  }
}
