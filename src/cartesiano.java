import java.util.Scanner;


class cartesiano {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite a primeira coordenada (X1): ");
    double x1 = scanner.nextDouble();
    
    System.out.println("Digite a primeira coordenada (Y1): ");
    double y1 = scanner.nextDouble();
    
    System.out.println("Digite a segunda coordenada (X2): ");
    double x2 = scanner.nextDouble();
    
    System.out.println("Digite a primeira coordenada (Y2): ");
    double y2 = scanner.nextDouble();
    
    double distance = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
    
    System.out.println("A distancia entre as coordenadas é de:" + distance);
    
  }
}
