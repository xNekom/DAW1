package java_ejercicios;

/*Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el
precio final con IVA. El IVA sera una constante que sera del 21%.*/
public class prueba {
    public static void main(String[] args) {

        //Declaramos las variables
        int a = 0;
        do {
            for (int b = 0; b <= 6; b++) {
                System.out.print("* ");
                if (b == 6) {
                    System.out.println();
                     a++;
                }
            }
        }
        while (a <= 2);
    }
}


