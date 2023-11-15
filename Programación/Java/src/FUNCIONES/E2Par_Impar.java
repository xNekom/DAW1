package FUNCIONES;

/*En el código del ejercicio anterior añade una función llamada: "parImpar" que sea capaz de decir por consola si el número que se le pasa como parámetro es par o no. 
Si el número es par mostrará un mensaje diciendo que es par, si el número es impar dirá que es impar, nada más. */
import java.util.Scanner;

public class E2Par_Impar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double num1 = entrada.nextDouble();
        parImpar((int) num1);
        System.out.println("Introduce el segundo número: ");
        double num2 = entrada.nextDouble();
        parImpar((int) num2);
        double resultado = suma(num1, num2);
        System.out.println("El resultado de la suma es: " + resultado);

    }

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static void parImpar(double num) {
        if (num % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número impar.");
        }
    }
}
