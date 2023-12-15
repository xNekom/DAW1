package ejercicios_mouredev;

public class prueba {
    public static void main(String[] args) {
        int numero, divisor;
        int contadorDivisores;

        for (numero = 1; numero <= 100; numero++) {
            contadorDivisores = 1;
            for (divisor = 2; divisor <= numero; divisor++) {
                if (numero % divisor == 0) {
                    contadorDivisores++;
                }
            }
            if (contadorDivisores == 2) {
                System.out.println("Número primo; " + numero);
            } else {
                System.out.println(numero);
            }
        }
    }
}
