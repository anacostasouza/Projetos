
import java.util.Scanner;


class horas {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite as horas do dia (HH:MM): ");
    String hora = scanner.nextLine();
   
   scanner.close();
    
    try {
            int minutosDesdeInicio = calcMinIn(hora);
            System.out.printf("Minutos desde o início do dia: %d\n", minutosDesdeInicio);
        } catch (IllegalArgumentException e) {
            System.out.println("Formato de hora inválido. Por favor, insira no formato HH:MM.");
        }
    }


    public static int calcMinIn(String hora) {
      
        if (hora == null || !hora.matches("\\d{2}:\\d{2}")) {
            throw new IllegalArgumentException("Formato inválido");
        }

        
        String[] partes = hora.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        
        return (horas * 60) + minutos;
    }
}