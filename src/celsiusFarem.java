import java.util.Scanner;


class celsiusFarem {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
   
    
    
    
    
    System.out.println("Escreva a temperatura em Fahrenheit: ");
    double faren = scanner.nextInt();
    
    double celsius = (faren - 32) * 5/9;
    
    System.out.println("A temperatura em Celsius é de: " + celsius);
    
    scanner.close();
    
  }
}
