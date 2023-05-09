import javax.swing.JOptionPane;

//Ejercicio 3 tryCatch
public class EjemploTryCatch {
    public static void main(String[] args) {
        boolean isNumberIncorrect=false;
       do{
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
            int resultado = num1 / num2;
            JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número entero válido.");
            isNumberIncorrect= true;
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: No se puede dividir entre cero.");
            isNumberIncorrect=true;
        } 

       }while(isNumberIncorrect==true);
       
    }
}