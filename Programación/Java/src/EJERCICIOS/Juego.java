package EJERCICIOS;

/*El vencedor del juego sumará 0,2 puntos en la nota final del trimestre.

Enunciado: Se desea realizar un videojuego en el que se recrea a un valiente luchador, en este caso a ti mismo,
al que han soltado en medio del coliseo romano y que tiene 100 puntos de vida.
El juego consiste en sobrevivir el mayor número de asaltos con vida.
Desarrollo del juego: El luchador intentará esquivar los golpes de un monstruo que lanzará ataques a una altura 0:baja, 1:media o 2:alta. 
El luchador podrá poner el escudo antes de ser golpeado para intentar detener el golpe (0 para bloquear abajo, 1 para bloquear al medio ó 2 para bloquear arriba)
En caso de no bloquear el golpe se generará un daño aleatorio que debe estar entre 1 y 30 y que mermará los puntos de vida del luchador.
Si el luchador consigue bloquear 3 veces seguidas será un chute de adrenalina que le hará ganar 5 puntos de vida.

Ganará los puntos aquel luchador que sobreviva más asaltos y todo aquel que sobreviva 15 asaltos.

En cada turno se debe contabilizar: 
-El número de turno
-Si ha parado el golpe o no
-El daño recibido
-La vida restante

Una vez muerto el luchador se debe mostrar la vida restante (estará en negativos) y el número de asaltos totales */

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vida = 100;
        int turnos = 0;
        int bloqueosSeguidos = 0;

        while (vida > 0 && turnos < 15) {
            int alturaAtaque = (int) (Math.random() * 3);
            System.out.println("¡El monstruo ataca! ");
            System.out.println("Introduce la altura de bloqueo (0: baja, 1: media, 2: alta): ");
            int alturaBloqueo = entrada.nextInt();

            if (alturaAtaque == alturaBloqueo) {
                System.out.println("¡Has bloqueado el golpe!\n");
                bloqueosSeguidos++;
                if (bloqueosSeguidos == 3) {
                    vida = vida + 5;
                    bloqueosSeguidos = 0;
                    System.out.println("\n*****************************************************");
                    System.out.println("¡¡¡CHUTE DE ADRENALINA: Has ganado 5 puntos de vida!!!");
                    System.out.println("*****************************************************\n");
                }
            } else {
                int daño = (int) (Math.random() * 30) + 1;
                vida = vida - daño;
                bloqueosSeguidos = 0;
                System.out.println("\n¡Has fallado el bloqueo! La altura correcta era: " + alturaAtaque);
                System.out.println("Recibes " + daño + " puntos de daño\n");
            }
            turnos++;
            System.out.println("Vida restante: " + vida);
            System.out.println("Número de turnos: " + turnos);
        }
        System.out.println(
                "Juego finalizado. Has terminado con " + vida + " puntos de vida después de " + turnos + " turnos");
    }
}
