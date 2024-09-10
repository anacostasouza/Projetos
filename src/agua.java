import java.util.Scanner;


class agua {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Escreva seu peso abaixo: ");
    double peso = scanner.nextDouble();
    
    double agua = peso * 35;
    
    var quantidadeAgua = agua / 1000;
    
    System.out.println("Você deve beber no minimo " + quantidadeAgua + " litros de agua ao dia.");
    
    
    scanner.close();
  }
}
