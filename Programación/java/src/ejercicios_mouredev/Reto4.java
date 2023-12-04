package ejercicios_mouredev;
/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
abstract class Poligono {
    abstract double area();
}

class Triangulo extends Poligono {
    private double base;
    private double altura;

    Triangulo(double baseInput, double alturaInput) {
        base = baseInput;
        altura = alturaInput;
    }

    double area() {
        return (base * altura) / 2;
    }
}

class Cuadrado extends Poligono {
    private double lado;

    Cuadrado(double ladoInput) {
        lado = ladoInput;
    }

    double area() {
        return lado * lado;
    }
}

class Rectangulo extends Poligono {
    private double base;
    private double altura;

    Rectangulo(double baseInput, double alturaInput) {
        base = baseInput;
        altura = alturaInput;
    }

    double area() {
        return base * altura;
    }
}

class Reto4 {
    public static void main(String[] args) {
        Poligono triangulo = new Triangulo(3, 4);
        System.out.println("Área del triángulo: " + triangulo.area());

        Poligono cuadrado = new Cuadrado(5);
        System.out.println("Área del cuadrado: " + cuadrado.area());

        Poligono rectangulo = new Rectangulo(2, 6);
        System.out.println("Área del rectángulo: " + rectangulo.area());
    }
}


