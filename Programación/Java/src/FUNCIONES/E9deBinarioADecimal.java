package FUNCIONES;

/*Implementa un programa que convierta números binarios a decimal. 

Al usuario se le pedirá que introduzca un número binario por consola y el programa responderá con el resultado de la conversión de dicho número.
Puedes usar la clase Scanner para recoger los datos del usuario y los dos métodos vistos de la clase String: el .lenght() y el .charAt() (si lo crees necesario).

No uses otras clases que no hayamos visto en clase.

Debes invocar al menos a dos funciones propias en tu código y hacer uso de ellas. Comenta qué hace cada función.

Nota: para convertir un número en base 'X' a decimal se usa el teorema fundamental de la numeración  (TFN) */

import java.util.Scanner;

public class E9deBinarioADecimal { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número binario:");
        String cadenaBinaria = entrada.nextLine();
        int decimal = binarioaDecimal(cadenaBinaria);
        System.out.println("El número decimal correspondiente es: " + decimal);
    }

    public static int binarioaDecimal(String cadenaBinaria) {
        int decimal = 0;
        int n = cadenaBinaria.length();
        for (int i = 0; i < n; i++) {
            int bit = cadenaBinaria.charAt(i) - '0';
            decimal += bit * Math.pow(2, n - 1 - i);
        }
        return decimal;
    }
}
