package java_ejercicios;

public class Main {
    public static void main(String[] args) {
        String cadena = "Esta Es Una Cadena De Texto De Prueba";
        int mayusculas = 0;
        int minusculas = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter >= 'A' && caracter <= 'Z') {
                mayusculas++;
                System.out.print(caracter + " ");
            } else if (caracter >= 'a' && caracter <= 'z') {
                minusculas++;
                System.out.print(caracter + " ");
            }
        }

        System.out.println("\nNúmero de mayúsculas: " + mayusculas);
        System.out.println("Número de minúsculas: " + minusculas);
    }
}

/*public class Main {
    public static void main(String[] args) {
        String cadena = "Esta Es Una Cadena De Texto De Prueba";
        int mayusculas = 0;
        int minusculas = 0;
        int i = 0;
        while (i < cadena.length()) {
            char caracter = cadena.charAt(i);
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
                System.out.print(caracter + " ");
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
                System.out.print(caracter + " ");
            }
            i++;
        }
        System.out.println("\nNúmero de mayúsculas: " + mayusculas);
        System.out.println("Número de minúsculas: " + minusculas);
    }
} */