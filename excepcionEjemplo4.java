public class excepcionEjemplo4 {
    public static void main(String[] args) {
        int resultado = dividir(10, 2);
        System.out.println("El resultado de la división es: " + resultado);
    }

    public static int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return dividendo / divisor;
    }
}

