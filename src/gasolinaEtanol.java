import java.util.Scanner; 

class gasolinaEtanol {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o valor da Gasolina: ");
    double gasolina = scanner.nextDouble();
    
    System.out.println("Digite o valor do Etanol: ");
    double etanol = scanner.nextDouble();
    
    if (etanol <= (0.7 * gasolina)) {
      
      System.out.println("Aproveite e abasteça com Etanol!");
    }
	else {
      
      System.out.println("Fuja e abasteça com Gasolina!");
    }    
    
    
    scanner.close();
   
  }
}
