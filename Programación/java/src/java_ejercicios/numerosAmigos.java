package java_ejercicios;

/*
Escribe una función que decida si dos números enteros positivos son amigos. Dos número a y b son amigos si la suma de
los divisores propios (distintos de él mismo) de a es igual a b. Y viceversa.
Para probar se pueden usar los números 220 y 284 , que son amigos.
*/

public class numerosAmigos {
    // Definimos una función que toma dos números enteros positivos como argumentos
    public static boolean sonAmigos(int a, int b) {
        // Inicializamos las variables que almacenarán la suma de los divisores propios de cada número
        int sumaDivisoresA = 0;
        int sumaDivisoresB = 0;

        // Calculamos la suma de los divisores propios de a
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sumaDivisoresA += i;
            }
        }

        // Calculamos la suma de los divisores propios de b
        for (int i = 1; i < b; i++) {
            if (b % i == 0) {
                sumaDivisoresB += i;
            }
        }

        // Comprobamos si la suma de los divisores propios de a es igual a b y viceversa
        return sumaDivisoresA == b && sumaDivisoresB == a;
    }

    public static void main(String[] args) {
        // Definimos los números que queremos comprobar
        int num1 = 220;
        int num2 = 284;

        // Llamamos a la función sonAmigos con los números definidos anteriormente
        if (sonAmigos(num1, num2)) {
            System.out.println(num1 + " y " + num2 + " son amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son amigos.");
        }
    }
}
