package java_ejercicios;

import java.util.Scanner;

public class Mastermind {
    public String secretNumber1;
    public String secretNumber2;
    public int attempts;
    public String[] history1;
    public String[] history2;

    public Mastermind(String secretNumber1, String secretNumber2, int attempts) {
        this.secretNumber1 = secretNumber1;
        this.secretNumber2 = secretNumber2;
        this.attempts = attempts;
        this.history1 = new String[attempts];
        this.history2 = new String[attempts];
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.attempts; i++) {
            System.out.println("Jugador 1, introduce tu número: ");
            String guess1 = scanner.nextLine();
            if (guess1.length() != this.secretNumber2.length()) {
                System.out.println("El número introducido no tiene la misma longitud que el número secreto. Inténtalo de nuevo.");
                i--;
                continue;
            }
            String result1 = checkGuess(guess1, this.secretNumber2);
            this.history1[i] = "Intento " + (i + 1) + ": " + guess1 + " --> " + result1;
            if (result1.contains(this.secretNumber2.length() + "M")) {
                System.out.println("¡Jugador 1 ha ganado!");
                break;
            }

            System.out.println("Jugador 2, introduce tu número: ");
            String guess2 = scanner.nextLine();
            if (guess2.length() != this.secretNumber1.length()) {
                System.out.println("El número introducido no tiene la misma longitud que el número secreto. Inténtalo de nuevo.");
                i--;
                continue;
            }
            String result2 = checkGuess(guess2, this.secretNumber1);
            this.history2[i] = "Intento " + (i + 1) + ": " + guess2 + " --> " + result2;
            if (result2.contains(this.secretNumber1.length() + "M")) {
                System.out.println("¡Jugador 2 ha ganado!");
                break;
            }
        }
        printHistory();
    }

    public String checkGuess(String guess, String secretNumber) {
        int muertos = 0;
        int heridos = 0;
        for (int i = 0; i < secretNumber.length(); i++) {
            char c = guess.charAt(i);
            if (c == secretNumber.charAt(i)) {
                muertos++;
            } else if (secretNumber.contains(String.valueOf(c))) {
                heridos++;
            }
        }
        return muertos + "M " + heridos + "H";
    }

    public void printHistory() {
        System.out.println("Historial del Jugador 1:");
        for (String s : this.history1) {
            if (s != null) {
                System.out.println(s);
            }
        }
        System.out.println("Historial del Jugador 2:");
        for (String s : this.history2) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Mastermind game = new Mastermind("3444567", "1234567", 10);
        game.playGame();
    }
}
