import java.util.Scanner;
import java.util.Random;

public class Ahorcado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] palabras = {"SIMPLE", "JAVA", "CODIGO", "JUEGO", "PROGRAMA"};
        String secreta = palabras[random.nextInt(palabras.length)].toUpperCase();
        
        String letrasProbadas = ""; 
        int intentos = 6;

        System.out.println("--- El Ahorcado Simple (6 Intentos) ---");
        
        while (intentos > 0) {
            String estadoPalabra = "";
            int letrasFaltantes = 0;
            
            for (char c : secreta.toCharArray()) {
                if (letrasProbadas.contains(String.valueOf(c))) {
                    estadoPalabra += c + " ";
                } else {
                    estadoPalabra += "_ ";
                    letrasFaltantes++;
                }
            }
            
            if (letrasFaltantes == 0) {
                System.out.println("\n¡GANASTE! La palabra era: " + secreta);
                break;
            }

            System.out.println("\nPalabra: " + estadoPalabra);
            System.out.println("Intentos restantes: " + intentos);
            System.out.println("Letras probadas: " + letrasProbadas.replaceAll("", " ").trim());

            System.out.print("Introduce una letra: ");
            String entrada = scanner.next().toUpperCase();
            
            if (entrada.length() != 1) {
                System.out.println("Introduce solo una letra.");
                continue;
            }
            char letra = entrada.charAt(0);

            if (letrasProbadas.contains(String.valueOf(letra))) {
                System.out.println("Ya probaste esa letra.");
            } else {
                letrasProbadas += letra; 
                
                if (secreta.contains(String.valueOf(letra))) {
                    System.out.println("¡Acierto!");
                } else {
                    intentos--;
                    System.out.println("¡Fallo!");
                }
            }
        }
        
        if (intentos == 0) {
            System.out.println("\n¡PERDISTE! Te quedaste sin intentos.");
            System.out.println("La palabra secreta era: " + secreta);
        }

        scanner.close();
    }
}