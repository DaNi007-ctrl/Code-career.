import java.util.Scanner;

public class Secuencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int suma = 0;
        int primero = 0;
        int ultimo = 0;
        int anterior = 0;

        while (true) {
            System.out.print("Introduce un número positivo: ");
            
            if (scanner.hasNextInt()) {
                int entrada = scanner.nextInt();
                
                if (contador > 0 && entrada <= anterior) {
                    System.out.println("Secuencia interrumpida.");
                    break;
                }
                
                if (contador == 0) {
                    primero = entrada;
                }

                ultimo = entrada;
                anterior = entrada;
                suma += entrada;
                contador++;
            } else {
                System.out.println("Por favor, introduce un número entero válido.");
                scanner.next(); // Limpia la entrada inválida
            }
        }

        if (contador > 0) {
            System.out.println("Total números válidos: " + contador);
            System.out.println("Suma total: " + suma);
            System.out.println("Primer número: " + primero);
            System.out.println("Último número: " + ultimo);
        }
        
        scanner.close();
    }
}

        
 
