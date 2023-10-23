import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;

        System.out.println("Introduce el valor de a: ");
        a = entrada.nextInt();
        System.out.println("Introduce el valor de b: ");
        b = entrada.nextInt();
        System.out.println("Introduce el valor de c: ");
        c = entrada.nextInt();

        if ((a > c) && (b > c)) {
        	System.out.print("El mayor es "+a+"; el del medio es "+b+"; el menor es "+c);
        }
        if ((a > c) && (b > c)) {
        	System.out.print("a>c>b");
        }
        if ((a > c) && (b > c)) {
        	System.out.print("a>c>b");
        }