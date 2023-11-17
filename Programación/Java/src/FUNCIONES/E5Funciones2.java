package FUNCIONES;

/*Este es el código que usamos en su día para comprobar si una fecha era correcta o no. 

Modifícalo y conviértelo en una función que devuelva mediante un 'boolean' si la fecha introducida es correcta o no.
Dicho de otra manera, haz que tenga la misma funcionalidad pero contenido en un método/función al que se le pasarán como parámetros el día, el mes y el año y devolverá un boolean con el resultado.

El código adjunto pide al usuario por consola el día el mes y el año y comprueba si esa fecha es correcta o no. */

import java.util.Scanner;

public class E5Funciones2 {

    public static boolean fechaValida(int day, int month, int year) {
        boolean result = false;
        if (year == 0) {
            result = false;
        } else if ((month == 2) && (day > 0) && (day < 29)) {
            result = true;
        } else if (((month == 9) || (month == 4) || (month == 6) || (month == 11)) && ((day > 0) && (day < 31))) {
            result = true;
        } else if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 12)
                || (month == 10)) && (day > 0) && (day < 32)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {

        // Pedir día, mes y año e indicar si la fecha es correcta.

        // Tener en cuenta que hay meses con 28, 30 y 31 días

        int day, month, year;
        boolean resultado = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce día en número");
        day = entrada.nextInt();

        System.out.println("Introduce mes en número");
        month = entrada.nextInt();

        System.out.println("Introduce año en número");
        year = entrada.nextInt();

        resultado = fechaValida(day, month, year); // Llama al segundo método suma y almacena el resultado en la
                                                   // variable resultado2
        if (resultado == true) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha es incorrecta.");
        }
    }
}
