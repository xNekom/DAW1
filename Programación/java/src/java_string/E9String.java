package java_string;
/*Dado el string="Textodelstring." 
Recorre dicho string con un while sacando por consola cada letra de principio a fin.
Nota, la primera posición del string es la 0. */

public class E9String {
    public static void main(String[] args) {

        String texto = "Textodelstring.";
        int posición = 0;

        while (posición < texto.length()) {
            System.out.println(texto.charAt(posición));
            posición++;
        }
    }
}
