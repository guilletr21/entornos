public class Calculadora {

    public int sumar(int a, int b) {
return a + b;
}

    public int restar(int a, int b) {
return a - b;
}

    public int dividir(int a, int b) {
if (b == 0) {

        throw new IllegalArgumentException("No se puede dividir entre cero");
}
return a / b;
}
}
// Esta clase define una calculadora básica con métodos para sumar, restar y dividir dos números enteros. El método de división incluye una verificación para evitar la división por cero, lanzando una excepción si se intenta realizar esta operación.
