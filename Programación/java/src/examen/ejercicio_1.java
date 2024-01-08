package examen;

public class ejercicio_1
{
    public static void main(String[] args) {
        int a, b, c, d;
        a = 0;
        b = 5;
        c = 4;
        do {
            if (a == 0) {
                System.out.println("if_1");
                a++;
            }
            else {
                System.out.println("else_1");
            }
            for (int aux = 1; aux < c; aux++) {
                a++;
            }
        } while (b < 4);

        if (a == 4) {
            System.out.println("a = " + a);
        }
    }
}
