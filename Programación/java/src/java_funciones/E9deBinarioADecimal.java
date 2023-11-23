package java_funciones;

/*Implementa un programa que convierta números binarios a decimal.

Al usuario se le pedirá que introduzca un número binario por consola y el programa responderá con el resultado de la conversión de dicho número.
Puedes usar la clase Scanner para recoger los datos del usuario y los dos métodos vistos de la clase String: el .lenght() y el .charAt() (si lo crees necesario).

No uses otras clases que no hayamos visto en clase.

Debes invocar al menos a dos funciones propias en tu código y hacer uso de ellas. Comenta qué hace cada función.

Nota: para convertir un número en base 'X' a decimal se usa el teorema fundamental de la numeración  (TFN) */

// Esta clase contiene el código para convertir un número binario a decimal.

// Importamos la clase Scanner que se utilizará para recoger los datos del usuario
import java.util.Scanner;

public class E9deBinarioADecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número binario:");
        String binaryString = scanner.nextLine();
        // Convertimos el número binario a decimal utilizando nuestra función
        int decimal = binaryToDecimal(binaryString);
        // Imprimimos el resultado
        System.out.println("El número decimal correspondiente es: " + decimal);
    }

    // Esta función convierte un número binario (en forma de cadena) a decimal
    public static int binaryToDecimal(String binaryString) {
        // Inicializamos el número decimal a 0
        int decimal = 0;
        // Obtenemos la longitud de la cadena binaria
        int n = binaryString.length();
        // Recorremos la cadena de derecha a izquierda
        for(int i = 0; i < n; i++) {
            // Obtenemos el bit en la posición i desde el final
            char bit = binaryString.charAt(n - 1 - i);
            // Si el bit es '1', lo sumamos al número decimal
            if(bit == '1') {
                decimal += (int) Math.pow(2, i);
            }
        }
        // Devolvemos el número decimal
        return decimal;
    }
}

