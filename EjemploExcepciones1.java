import java.util.Scanner;

public class EjemploExcepciones1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generar una excepción de índice fuera de rango (IndexOutOfBoundsException)
        int[] arr = new int[5];
        System.out.println("Ingrese un índice para acceder al arreglo: ");
        int index = input.nextInt();
        try {
            System.out.println("El valor en el índice " + index + " es: " + arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: El índice " + index + " está fuera del rango del arreglo.");
        }

    }
}

