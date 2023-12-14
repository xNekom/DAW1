package java_array;
/*
Crea tres tablas de cinco elementos: la primera de enteros, la segunda de 'double' y la tercera de booleanos.
Muestra las referencias en las que se encuentra cada una de las tablas anteriores
*/
public class crearTablas {
    public static void main(String[] args) {
        int [] edad;
        edad = new int [5];
        System.out.println(edad);

        double [] precio;
        precio = new double [5];
        System.out.println(precio);

        boolean [] test;
        test = new boolean [5];
        System.out.println(test);
    }
}
