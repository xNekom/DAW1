package java_funciones;

import java.util.Scanner;

public class E9deBinarioADecimal_Profe {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número binario: ");
        String binario = entrada.next();
        int decimal = convierteADecimal(binario);
        System.out.println("El equivalente decimal es: " + decimal);
    }

    // Este método es el que realiza la conversión real. Se basa en el siguiente
    // algoritmo:
    // 1. Inicializa las variables.
    static int convierteADecimal(String binario) {

        // Declara las variables restoPosicion, exponente y longitud.
        int restoPosicion = 0;
        int exponente = 0;
        int longitud = binario.length();

        // 2. Calcula la longitud del número binario.
        // La variable longitud se utilizará para iterar sobre el número binario.

        // 3. Itera sobre el número binario.
        // Para cada dígito binario:
        // * Obtiene el dígito binario como un número entero.
        // * Multiplica el dígito binario por la potencia de 2 correspondiente.
        // * Suma el resultado al número decimal.

        int decimal = 0;
        for (int i = 0; i < longitud; i++) {

            // Obtiene el dígito binario actual.
            int digito = ((binario.charAt(longitud - 1 - restoPosicion)) - 48);

            // Calcula la potencia de 2 correspondiente al dígito binario.
            int potencia = (int) Math.pow(2, exponente);

            // Suma el resultado al número decimal.
            decimal = decimal + digito * potencia;

            // Incrementa la posición del dígito binario.
            restoPosicion++;

            // Incrementa el exponente.
            exponente++;
        }

        // 4. Devuelve el número decimal.
        return decimal;
    }

    // Este método calcula la potencia de un número base elevado a un exponente.
    static int potencia(int base, int  exponente) {

        // Declara la variable aux.
        int aux = 1;

        // Itera sobre el exponente.
        for (int i = 0; i < exponente; i++) {

            // Multiplica aux por la base.
            aux *= base;
        }

        // Devuelve aux.
        return aux;
    }
}
