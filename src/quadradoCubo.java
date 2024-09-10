
import java.util.Scanner;

class quadradoCubo {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Estes são os quadrados e cubos referentes a sequencia de 0 a 10: ");
     
    
    for (int i = 0; i <= 10; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%-10d %-10d %-10d%n", i, quadrado, cubo);
        }
    
    
    scanner.close();
  }
}
