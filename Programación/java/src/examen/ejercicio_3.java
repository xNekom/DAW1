package examen;

public class ejercicio_3 {
    public static void main(String[] args) {
        int a = 0;
        a = 10;
        if (a == 10) {
            System.out.println("if_1");
            if (a == 10) {
                System.out.println("if_1.1");
                a++;
            }
            else if (a == 11) {
                System.out.println("else if_1.1");
                }
            else {
                System.out.println("else_2.2");
                }
            }
        else if (a == 10) {
                System.out.println("else if_1");
            }
        else if (a == 10) {
                System.out.println("else if_2");
            }
        if (a == 10) {
                System.out.println("if_2");
            }
        else if (a == 10) {
            System.out.println("else if_2.1");
            }
        else {
            System.out.println("else_2.2");
            }
        System.out.println("variable a= " + a);
        }
    }
/*
if_1
if_1.1
else_2.2
variable a= 11
 */