package java_ejercicios;

/*Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el
precio final con IVA. El IVA sera una constante que sera del 21%.*/
public class prueba {
    public static void main(String[] args) {

        //Declaramos las variables
        double precio = 39.99;
        double precioIVA = precio * 21 / 100;
        double precioFinal = precio + precioIVA;
        System.out.println("El precio del producto con IVA es: " + precioFinal + " €");
    }
}


