package FUNCIONES;

/*Escribe un programa que lea una lista de diez números y haga un recuento de cuántos son positivos, y cuántos son negativos. Mostrará por consola el resultado. */

import java.util.*;

public class E8Recuento {
    Scanner entrada = new Scanner(System.in);

    int num = 0;
    int pos = 0;
    int neg = 0;

    for(int i = 0; i < 10; i++)
    {
        System.out.println("Introduce un número entero: ");
        if (num > 0) {
            pos++;
        } else if (num < 0) {
            neg++;
        }
    }
    System.out.println("Números positivos:  "+pos);System.out.println("Números negativos:  "+neg);
}

}
