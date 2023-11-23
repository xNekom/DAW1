package java_string;
/*Dado el string="Textodelstring." 
Recorre dicho string con un while sacando por consola cada letra de principio a fin.
Nota, la primera posición del string es la 0. */

public class E9StringProfe {
    public static void main(String[] args) {
        
        char caracter;
        int posición = 0;
        String a= "Textodelstring.";
        int b = a.length();
        while (posición < b){
            caracter = a.charAt(posición);
            posición++;
            System.out.println(caracter);
        }
    }
}

