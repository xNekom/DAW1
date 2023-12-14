package java_array;

/*
Construye una tabla de 10 elementos del tipo que desees. Declara 3 variables de tablas diferentes que referenciarán
a la tabla creada. Comprueba imprimiendo por pantalla que todas las variables contienen la misma referencia
*/
public class construyeUnaTabla {

    public static void main(String[] args) {
        int[] tabla = {5, 4, 8, 9, 6, 1, 3, 4, 235, 15, 1, 45};
        System.out.println(tabla);

        int a = tabla[3];
        System.out.println(a);

        int b = tabla[8];
        System.out.println(b);

        int c = tabla[11];
        System.out.println(c);

    }
}
