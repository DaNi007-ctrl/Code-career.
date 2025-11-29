import java.util.Scanner;

public class GestiónNotasArrays {
    public static void main(String[]args){
        int p;
        Scanner sc=new Scanner(System.in);
        float [] array1=new float[5];
        do{

            System.out.println("MENÚ DE OPCIONES: ");
            System.out.println("========================");
            System.out.println("1.- (Re)Cargar.");
            System.out.println("2.- Mostrar.");
            System.out.println("3.- Sumar.");
            System.out.println("4.- Promedio.");
            System.out.println("5.- Máximo y mínimo.");
            System.out.println("0.- Salir.");
            System.out.print("Elige una opción: ");
            int op=sc.nextInt();
            p=op;

                switch(op){
                    case 1:
                        for (int i=0;i<array1.length;i++){
                            System.out.print("Numero "+(i+1)+": ");
                            array1[i]=sc.nextFloat();
                            if(array1[i]<0 || array1[i]>10){
                                System.out.println("Nota inválida. Introduce una nota entre 0 y 10.");
                                i--;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Array1: ");
                        for (int i=0;i<array1.length;i++){
                            System.out.print(array1[i]+", ");
                        }
                        break;
                    case 3:
                        double suma=0;
                        for (int i=0;i<array1.length;i++){
                            suma+=array1[i];
                        }
                        System.out.println("La suma es: "+suma);
                        break;
                    case 4:
                        double sum=0;
                        for (int i=0;i<array1.length;i++){
                            sum+=array1[i];
                        }
                        double promedio=(double)sum/ array1.length;
                        System.out.println("El promedio es: "+promedio);
                        break;
                    case 5:
                        float max=array1[0];
                        float min=array1[0];
                        for (int i=1;i<array1.length;i++){
                            if (array1[i]>max){
                                max=array1[i];
                            }
                            if (array1[i]<min){
                                min=array1[i];
                            }
                        }
                        System.out.println("El máximo es: "+max);
                        System.out.println("El mínimo es: "+min);
                        break;
                    case 0:
                        System.out.println("Saliendo del programa.");
                        break;
                }
        }while (p!=0);
    }
}

