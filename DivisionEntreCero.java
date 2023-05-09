import javax.swing.JOptionPane;
//ejercicio 1
public class DivisionEntreCero {

    public static void main(String[] args) {
        int numerador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numerador:"));
        int denominador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el denominador:"));

        double resultado = numerador / denominador;
        JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);
       
        //error longitud del array
        int []arrayNumeros = new int [3];
        arrayNumeros[0]=1;
        arrayNumeros[1]=1;
        arrayNumeros[2]=1;
        arrayNumeros[3]=1;

        // byte resultadox= 1;
        // while (true) {
        //     resultadox+=1000;
        //     System.out.println(resultadox);
        // }       
        
        // try {
        //     double resultado = numerador / denominador;
        //     JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);
        // } catch (ArithmeticException e) {
        //     JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
        //     throw e;
        // }
    }
}
