import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;

        System.out.println("Introduce el valor del 1º número: ");
        a = entrada.nextInt();
        System.out.println("Introduce el valor del 2º número: ");
        b = entrada.nextInt();
        System.out.println("Introduce el valor del 3º número: ");
        c = entrada.nextInt();

        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        if (b < c) {
            b = b + c;
            c = b - c;
            b = b - c;
        }

        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        System.out.println("El mayor es " + a + "; el del medio es " + b + "; el menor es " + c);
    }
}
