package java_ejercicios;

/*
Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo con el siguiente prototipo
static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2)
La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes utilizados
*/
public class funcionDiferenciaHoras {
    public static void main(String[] args) {
        int hora1 = 8;
        int minuto1 = 59;
        int hora2 = 14;
        int minuto2 = 18;
        int resultado = diferenciaMin(hora1, minuto1, hora2, minuto2);
        System.out.println(resultado);
    }

    public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        int minutos1 = hora1 * 60 + minuto1;
        int minutos2 = hora2 * 60 + minuto2;
        int diferencia = minutos1 - minutos2;
        if (diferencia < 0) {
            diferencia = -diferencia;
        }
        return diferencia;
    }

}
