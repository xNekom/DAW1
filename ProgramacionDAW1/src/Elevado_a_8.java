/*Desarrolla un programa que eleve un número a 8 utilizando while*/

import java.util.Scanner;

public class Elevado_a_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int datoEntrada = 0;
        int datoPrimero = 0;
        datoPrimero = datoEntrada * datoPrimero;

        System.out.println("Introduce un número:");
        datoEntrada = entrada.nextInt();

        while (contador < 8) {
            datoEntrada = datoEntrada * datoPrimero;
            contador++;
            System.out.println(datoEntrada);
            }
        }
    }